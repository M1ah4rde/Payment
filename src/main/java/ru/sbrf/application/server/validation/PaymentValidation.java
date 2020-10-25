package ru.sbrf.application.server.validation;

import lombok.AllArgsConstructor;
import ru.sbrf.application.server.exceptions.PaymentValidationException;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor

public class PaymentValidation {

    private String paymentIdentification;
    private List<String> listpaymentIdentification = new ArrayList<>();

    public PaymentValidation checkDoublePaymentPhone() throws PaymentValidationException {
        for (String list : listpaymentIdentification) {
            if (paymentIdentification.equals(list)) {
                throw new PaymentValidationException("Повторная оплата: " + paymentIdentification, paymentIdentification);
            }
        }
        return this;
    }

}
