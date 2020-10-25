package ru.sbrf.application.server.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Info {

    private int numberTransaction;
    private String numberAccountUser;
    private String numberPhoneClient;
    private int transferAmount;
    private String currencyMoney;

}
