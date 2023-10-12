package pl.lodz.p.edu.logic.service;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.orm.jpa.JpaSystemException;
import pl.lodz.p.edu.exception.ExceptionFactory;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

@Slf4j
public abstract class AbstractRetryHandler {

    @Value("${transaction.repeat.times:3}")
    private int transactionRetries;

    private String transactionId;

    protected <T> T repeatTransactionWhenTimeoutOccurred(Supplier<T> supplier) {
        int retryCounter = 1;

        while (retryCounter <= transactionRetries) {
            try {
                transactionId = Long.toString(System.currentTimeMillis())
                    + ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
                log.info("Transaction number {} with TXid={} began", retryCounter, transactionId);
                T result = supplier.get();
                log.info("Transaction number {} with TXid={} ends with status: COMMIT", retryCounter, transactionId);
                return result;
            } catch (JpaSystemException e) {
                if (e.getCause() instanceof TransactionException ex && ex.getMessage().contains("timeout")) {
                    log.warn("Transaction number {} with TXid={} ends with status: ROLLBACK", retryCounter, transactionId);
                    retryCounter++;
                } else {
                    break;
                }
            }
        }

        throw ExceptionFactory.createTransactionTimeoutException();
    }
}
