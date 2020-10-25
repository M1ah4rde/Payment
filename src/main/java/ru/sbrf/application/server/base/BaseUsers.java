package ru.sbrf.application.server.base;

import ru.sbrf.application.app.exeptions.PhoneValidationException;
import ru.sbrf.application.client.User;

import java.util.ArrayList;

public class BaseUsers {

    User userNum = new User();
    private String userNumber;

    public BaseUsers userNumber(String phone) {

        ArrayList<String> usersNumbers = new ArrayList<>();
        userNumber = userNum.getNumberPhone();
        if ((usersNumbers.contains(userNumber))) {
            throw new PhoneValidationException("re-entry!");
        } else {
            usersNumbers.add(userNumber);
            return this;
        }
    }

}
