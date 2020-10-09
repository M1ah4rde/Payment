package ru.sbrf.application.common.exeptions;

public class AccountValidationException extends RuntimeException {

    private String account;

    public AccountValidationException(String account) {
        this.account = account;
    }

    public AccountValidationException(String message, String account) {
        super(message);
        this.account = account;
    }

    public AccountValidationException(String message, Throwable cause, String account) {
        super(message, cause);
        this.account = account;
    }

    public AccountValidationException(Throwable cause, String account) {
        super(cause);
        this.account = account;
    }

    public AccountValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String account) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }
}
