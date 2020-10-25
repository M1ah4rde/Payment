package ru.sbrf.application.app.exeptions;

public class PhoneValidationException extends RuntimeException {

    private String phone;

    public PhoneValidationException(String phone) {
        this.phone = phone;
    }

    public PhoneValidationException(String message, String phone) {
        super(message);
        this.phone = phone;
    }

    public PhoneValidationException(String message, Throwable cause, String phone) {
        super(message, cause);
        this.phone = phone;
    }

    public PhoneValidationException(Throwable cause, String phone) {
        super(cause);
        this.phone = phone;
    }

    public PhoneValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String phone) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

}
