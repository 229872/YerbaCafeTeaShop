package pl.lodz.p.edu.exception;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ExceptionMessage {

    public static final String UNKNOWN = "exception.unknown";
    public static final String TRANSACTION_TIMEOUT = "exception.transaction.timeout";
    public static final String ACCOUNT_NOT_FOUND = "exception.account.not.found";
    public static final String ACCOUNT_CONFLICT_LOGIN = "exception.account.conflict.login";
    public static final String ACCOUNT_CONFLICT_EMAIL = "exception.account.conflict.email";
    public static final String ACCOUNT_NOT_BLOCKED = "exception.account.state.not.blocked";
    public static final String ACCOUNT_NOT_ACTIVE = "exception.account.state.not.active";
    public static final String ACCOUNT_ARCHIVAL = "exception.account.state.archival";
    public static final String ACCOUNT_LAST_ROLE = "exception.account.role.last.role";
    public static final String ACCOUNT_ROLE_ALREADY_ASSIGNED = "exception.account.role.already.exists";
    public static final String ACCOUNT_ROLE_ADMIN_MANY_ROLES = "exception.account.role.admin.many.roles";
    public static final String ACCOUNT_ROLE_NOT_FOUND = "exception.account.role.not.found";
    public static final String ACCOUNT_ROLE_MORE_THAN_ONE = "exception.account.role.more.than.one.assigned";
    public static final String ACCOUNT_ROLE_CANT_ASSIGN_GUEST = "exception.account.role.cant.assign.guest";
    public static final String ACCOUNT_CREATE_MANY_ROLES = "exception.account.create.role.many";
    public static final String ACCOUNT_CREATE_CANT_ASSIGN_NOT_VERIFIED = "exception.account.create.not_verified";


    public static class Validation {
        public static final String ACCOUNT_EMAIL_WRONG = "exception.validation.account.email.wrong";
        public static final String ACCOUNT_EMAIL_BLANK = "exception.validation.account.email.blank";
        public static final String ACCOUNT_LOCALE_NOT_SUPPORTED = "exception.validation.account.locale.not.supported";
        public static final String ACCOUNT_LOCALE_BLANK = "exception.validation.account.locale.blank";
        public static final String ACCOUNT_ROLE_NOT_SUPPORTED = "exception.validation.account.role.not.supported";
        public static final String ACCOUNT_ROLE_BLANK = "exception.validation.account.role.blank";
        public static final String ACCOUNT_STATE_NOT_SUPPORTED = "exception.validation.account.state.not.supported";
        public static final String ACCOUNT_STATE_BLANK = "exception.validation.account.state.blank";
    }
}
