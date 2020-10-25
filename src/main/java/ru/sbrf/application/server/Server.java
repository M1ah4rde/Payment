package ru.sbrf.application.server;

import ru.sbrf.application.client.User;
import ru.sbrf.application.common.PhonePayment;

public interface Server {

    void makePaymentPhone(PhonePayment phonePayment, User user, User client);

}
