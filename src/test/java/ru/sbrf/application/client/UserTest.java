package ru.sbrf.application.client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPhoneNumber() {
        User user = new User("+81234567890", "01234567890123456789");
        assertEquals("+7", user.getNumberPhone());
    }

    @Test
    void getAccountNumber() {
    }

    @Test
    void testToString() {
    }
}