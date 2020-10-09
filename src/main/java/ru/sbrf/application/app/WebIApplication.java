package ru.sbrf.application.app;

import lombok.Getter;
import ru.sbrf.application.app.validation.AccountValidation;
import ru.sbrf.application.app.validation.PhoneValidation;
import ru.sbrf.application.client.User;
import ru.sbrf.application.common.exeptions.AccountValidationException;
import ru.sbrf.application.common.exeptions.PhoneValidationException;

@Getter

public class WebIApplication implements IApplication {

    @Override
    public void PhonePayment(User user) throws Exception {

        String phone = "+71234567890"; // 12 значений
        PhoneValidation phoneValidation = new PhoneValidation(phone);

        String account = "01234567890123456789"; // 20 значений
        AccountValidation accountValidation = new AccountValidation(account);

        try {
            phoneValidation.checkLength().checkPrefix();
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