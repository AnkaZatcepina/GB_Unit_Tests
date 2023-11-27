package ru.anka.lesson2.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    // Используйте параметризованные тесты для проверки работы этих операций на различных входных данных и убедитесь, что результаты верны.
    private final Calc calculator = new Calc();

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "0, 0, 0", "-1, 1, 0", "10, -5, 5"})
    void testAdd(int a, int b, int expected) {
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"1, 2, -1", "0, 0, 0", "-1, 1, -2", "10, -5, 15"})
    void testSubtract(int a, int b, int expected) {
        int res = calculator.subtract(a,b);
        assertEquals(expected, res);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 2", "0, 0, 0", "-1, 1, -1", "10, -5, -50"})
    void multiply(int a, int b, int expected) {
        int res = calculator.multiply(a,b);
        assertEquals(expected, res);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 0.5", "-1, 1, -1", "10, -5, -2"})
    void divide(int a, int b, double expected) {
        double res = calculator.divide(a,b);
        assertEquals(expected, res, 0.001);
    }

    @Test
    void whatExceptoinWillBeThrown(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
    }

    @ParameterizedTest
    @CsvSource({"1, 0", "-1, 0", "10, 0"})
    void manyExceptions(int a, int b){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a,b));
    }


}
