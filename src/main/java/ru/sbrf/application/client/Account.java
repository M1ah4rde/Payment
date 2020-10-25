package ru.sbrf.application.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Account {

    private String accountNumber;
    private Currency currency;
    private float balance;

}
