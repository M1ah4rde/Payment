package ru.sbrf.application.app.validation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOError;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PhoneValidationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkPrefix() {
        PhoneValidation phoneValidation = new PhoneValidation("+81234567890");
        assertThrows(IOError.class, phoneValidation::checkPrefix);
    }

    @Test
    void checkLength() {
    }
}