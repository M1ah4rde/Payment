package ru.sbrf.application.server.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentHistory {

    private Map<Integer, Info> baseTransactions = new HashMap<>();
    private List<Integer> numberTransactions = new ArrayList<>();

    public Integer newNumberTransaction() {

        int newNumberTransaction, lastNumbertTransaction;

        if (numberTransactions.size() == 0) {
            int numberTransaction = 0;
            numberTransactions.add(numberTransaction);
        }

        lastNumbertTransaction = numberTransactions.get(numberTransactions.size() - 1);
        newNumberTransaction = lastNumbertTransaction + 1;
        numberTransactions.add(newNumberTransaction);
        return newNumberTransaction;
    }

}
