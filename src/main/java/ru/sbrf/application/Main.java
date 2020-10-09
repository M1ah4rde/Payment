package ru.sbrf.application;

import ru.sbrf.application.app.WebIApplication;
import ru.sbrf.application.client.User;
import ru.sbrf.application.server.BankServer;

public class Main {
    public static void main(String[] args) throws Exception {

        WebIApplication webApplication = new WebIApplication();
        BankServer bankServer = new BankServer();

        User user = new User("+79876543210", "98765432109876543210");

    }
}
