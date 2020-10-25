package ru.sbrf.application.app;

import lombok.Getter;
import ru.sbrf.application.app.exeptions.AccountValidationException;
import ru.sbrf.application.app.exeptions.PhoneValidationException;
import ru.sbrf.application.app.validation.AccountValidation;
import ru.sbrf.application.app.validation.PhoneValidation;
import ru.sbrf.application.client.User;

@Getter

public class WebApplication implements Application {

    @Override
    public void PhonePayment(User user) throws Exception {

        String phone = "+71234567890"; // 12 значений
        PhoneValidation phoneValidation = new PhoneValidation(phone);

        String account = "01234567890123456789"; // 20 значений
        AccountValidation accountValidation = new AccountValidation(account);

        try {
            phoneValidation.checkLength();
        } catch (PhoneValidationException ex) {
            System.out.println(ex);
            System.out.println(ex.getPhone());
            throw ex;
        }

        try {
            accountValidation.checkLength();
        } catch (AccountValidationException ex) {
            System.out.println(ex);
            System.out.println(ex.getAccount());
            throw ex;
        }

    }

}