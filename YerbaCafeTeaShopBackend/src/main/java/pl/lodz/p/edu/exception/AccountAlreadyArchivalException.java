package pl.lodz.p.edu.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class AccountAlreadyArchivalException extends ResponseStatusException {
    AccountAlreadyArchivalException(HttpStatusCode status, String reason) {
        super(status, reason);
    }
}
