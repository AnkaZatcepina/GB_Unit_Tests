package ru.anka.lesson2.task1;
/*
    Напишите тесты с использованием ассертов assertEquals, 
    assertTrue, assertFalse, assertNull, assertNotNull 
    и проверьте работу методов на различных наборах данных. 
*/

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    
    private MathUtils mathUtils;
    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        mathUtils = null;
    }

    @Test
    void add() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    void subtract() {
        assertTrue(5 == mathUtils.subtract(12,7));
    }

    @Test
    void multiply() {
        assertFalse(15 != mathUtils.multiply(3,5));
    }

    @Test
    void divide() {
//        mathUtils = null;
//        assertNotNull(mathUtils);

    }
}
