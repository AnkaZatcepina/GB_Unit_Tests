package ru.anka.lesson3.hw;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IntervalTest {
    private Interval interval;

    @BeforeEach
    void setUp() {
        interval = new Interval();
    }

    @AfterEach
    void tearDown() {
        interval = null;
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 50, 100})
    @DisplayName("Проверка числа, попадающего в интервал от 25 до 100")
    void testInInterval(int arg) {
        assertTrue(interval.numberInInterval(arg));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, -1000, 0, 24, 101})
    @DisplayName("Проверка числа, непопадающего в интервал от 25 до 100")
    void testNotInInterval(int arg) {
        assertFalse(interval.numberInInterval(arg));
    }
}
