package ru.sbrf.application.app.validation;

import lombok.AllArgsConstructor;
import ru.sbrf.application.app.exeptions.PhoneValidationException;

@AllArgsConstructor

public class PhoneValidation {

    private String phone;

    public PhoneValidation checkLength() {
        if (phone.length() != 12) {
            throw new PhoneValidationException("Invalid length for phone: " + phone, phone);
        }
        return this;
    }

}