package ru.sbrf.application.client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setAccountNumber() {
    }

    @Test
    void setCurrency() {
    }

    @Test
    void setBalance() {
        Account account = new Account("01234567890123456789", Currency.RUB, 6000);
        account.setBalance(5000);
        assertEquals(account.getBalance(), 1000);
    }

    @Test
    void getAccountNumber() {
    }

    @Test
    void getCurrency() {
    }

    @Test
    void getBalance() {
    }
}