package ru.sbrf.application.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class PhonePayment {
    private String phone;
    private int amount;
    private Currency currency;
}