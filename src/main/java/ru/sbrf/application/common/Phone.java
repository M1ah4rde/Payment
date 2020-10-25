package ru.sbrf.application.common;

import lombok.Getter;
import ru.sbrf.application.app.exeptions.PhoneValidationException;

@Getter

public class Phone<T> {

    private T phone;

    public Phone() {
    }

    public Phone(T phone) {
        this.phone = phone;
    }

    public Phone<T> checkPrefixPhone() {
        String phoneToString = phone.toString();
        boolean prefixAndNumber = phoneToString.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3,4}\\)?[\\- ]?)?[\\d\\- ]{5,10}$");
        if (!prefixAndNumber) {
            throw new PhoneValidationException("Invalid format phone number: " + this.phone);
        }
        return this;
    }

}
