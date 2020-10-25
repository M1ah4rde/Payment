package ru.sbrf.application.server;

import lombok.Getter;
import lombok.ToString;
import ru.sbrf.application.client.User;
import ru.sbrf.application.common.PhonePayment;
import ru.sbrf.application.server.base.BaseUsers;
import ru.sbrf.application.server.base.PaymentHistory;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString

public class BankServer implements Server {

    private String ip;
    private String port;
    private String protocol;
    private String server;

    private List<String> listPayment = new ArrayList<String>();
    private BaseUsers baseUsers = new BaseUsers();
    private PaymentHistory PaymentHistory = new PaymentHistory();

    public BankServer(String ip, String port, String protocol, String server) {
        this.ip = ip;
        this.port = port;
        this.protocol = protocol;
        this.server = server;
    }

    @Override
    public void makePaymentPhone(PhonePayment phonePayment, User user, User client) {

    }
}