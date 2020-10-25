package ru.sbrf.application.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import ru.sbrf.application.client.Currency;
import ru.sbrf.application.client.User;

@AllArgsConstructor
@Getter
@ToString

public class PhonePayment {

    private final String phone;
    private final int amount;
    private final Currency currency;
    private final User user;
    private final String id;

}