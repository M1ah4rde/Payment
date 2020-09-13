package ru.sbrf.application.common;

public enum Currency {
    RUB(810),
    USD(840),
    EUR(978);

    private int code;

    Currency(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code=" + code +
                '}';
    }
}
