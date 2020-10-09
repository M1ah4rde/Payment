package ru.sbrf.application.common;

import lombok.Getter;

@Getter

public class Phone {

    private String number;
    private String prefix;
    private int length;

    public Phone(String number) {
        this.number = number;
    }

}
