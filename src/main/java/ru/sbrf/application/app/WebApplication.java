package ru.sbrf.application.app;

import ru.sbrf.application.app.validation.PhoneValidation;
import ru.sbrf.application.common.exeptions.PhoneValidationException;

public class WebApplication implements Application {

    @Override
    public void PhonePayment() {

        String phone = "+71234567890";
        PhoneValidation phoneValidation = new PhoneValidation(phone);

        try {
            phoneValidation.checkLength().checkPrefix();
        } catch (PhoneValidationException ex) {
            System.out.println(ex);
            System.out.println(ex.getPhone());
            throw ex;
        }
    }
}