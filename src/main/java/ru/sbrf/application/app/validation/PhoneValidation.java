package ru.sbrf.application.app.validation;

import lombok.AllArgsConstructor;
import ru.sbrf.application.common.exeptions.PhoneValidationException;

@AllArgsConstructor

public class PhoneValidation {

    private String phone;

    public PhoneValidation checkPrefix() {
        if (!phone.startsWith("+7")) {
            throw new PhoneValidationException("Invalid prefix for phone: " + phone, phone);
        }
        return this;
    }

    public PhoneValidation checkLength() {
        if (phone.length() != 12) {
            throw new PhoneValidationException("Invalid length for phone: " + phone, phone);
        }
        return this;
    }

}