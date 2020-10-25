package ru.sbrf.application.server;

public enum StatusPayment {

    incorrectNumberPhone("Указан неверный номер клиента"),
    incorrectNumberAccount("Указан неверный номер счета"),
    notHaveAmount("Недостаточно средств на счете"),
    completed("Успешно");

    StatusPayment(String s) {
    }

}
