package ru.sbrf.application.server.exceptions;

public class PaymentValidationException extends RuntimeException {

    private String paymentIndetifier;

    public PaymentValidationException(String paymentIndetifier) {
        this.paymentIndetifier = paymentIndetifier;
    }

    public PaymentValidationException(String message, String paymentIndetifier) {
        super(message);
        this.paymentIndetifier = paymentIndetifier;
    }

    public PaymentValidationException(String message, Throwable cause, String paymentIndetifier) {
        super(message, cause);
        this.paymentIndetifier = paymentIndetifier;
    }

    public PaymentValidationException(Throwable cause, String paymentIndetifier) {
        super(cause);
        this.paymentIndetifier = paymentIndetifier;
    }

    public PaymentValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String paymentIndetifier) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.paymentIndetifier = paymentIndetifier;
    }
}
