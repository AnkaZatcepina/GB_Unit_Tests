package ru.anka.lesson2.task2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// Напишите тесты с использованием аннотаций
// @Test,
// @Before,
// @After,
// @BeforeClass, (==BeforeALL)
// @AfterClass для проверки различных сценариев, включая правильные и неправильные адреса.
public class EmailValidatorTest {

    private static EmailValidator emailValidator;
    @BeforeAll
    static void setUp() {
        emailValidator = new EmailValidator();
    }

    @AfterAll
    static void tearDown() {
        emailValidator = null;
    }

    @Test
    void isValidEmail() {
        assertTrue(emailValidator.isValidEmail("123kofa-ioh@mm"));
    }

    @Test
    void isNotValidEmail() {
        assertFalse(emailValidator.isValidEmail("123kofa-ioh"));
    }
}
