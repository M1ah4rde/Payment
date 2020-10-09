package ru.sbrf.application.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum Currency {

    RUB(810),
    USD(840),
    EUR(978);

    private final int code;

}
