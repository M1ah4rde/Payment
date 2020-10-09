package ru.sbrf.application.server;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ru.sbrf.application.client.User;
import ru.sbrf.application.common.PhonePayment;

import java.util.ArrayList;
import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class BankServer implements IServer {

    private HashMap<String, PhonePayment> payments = new HashMap<String, PhonePayment>(); // список платежей

    private ArrayList<User> users = new ArrayList<User>(); // список пользователей

    @Override
    public void phonePayment(PhonePayment phonePayment) {

        if (payments.containsKey(phonePayment.getId())) { // проверка на повтор по номеру (id)
            System.out.println("Повтор платежа");
            return;
        }

        payments.put(phonePayment.getId(), phonePayment); // добавляем пользователя в список по номеру (id)
    }
}


