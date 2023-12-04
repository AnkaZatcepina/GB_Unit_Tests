package ru.anka.lesson3.hw;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class EvenOddTest {
    private EvenOdd evenOdd;

    @BeforeEach
    void setUp() {
        evenOdd = new EvenOdd();
    }

    @AfterEach
    void tearDown() {
        evenOdd = null;
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 5556, 90000, -2})
    @DisplayName("Проверка чётного числа")
    void testOdd(int arg) {
        assertTrue(evenOdd.evenOddNumber(arg));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 7, 90001, -1, -5})
    @DisplayName("Проверка нечётного числа")
    void testEven(int arg) {
        assertFalse(evenOdd.evenOddNumber(arg));
    }
}
