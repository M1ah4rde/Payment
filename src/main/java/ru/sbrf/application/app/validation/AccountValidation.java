package ru.sbrf.application.app.validation;

import lombok.AllArgsConstructor;
import ru.sbrf.application.app.exeptions.AccountValidationException;

@AllArgsConstructor

public class AccountValidation {

    private String account;

    public AccountValidation checkLength() {
        if (account.length() != 20) {
            throw new AccountValidationException("Invalid length for account: " + account, account);
        }
        return this;
    }

}
