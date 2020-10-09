package ru.sbrf.application.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum StatusPayment {

    successfully(1),
    waiting(2),
    fail(3);

    private final int code;
}
