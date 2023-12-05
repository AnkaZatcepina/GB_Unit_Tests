package ru.anka.lesson5.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberFinderTest {

    private MaxNumberFinder maxNumberFinder;

    @BeforeEach
    void setUp() {
        maxNumberFinder = new MaxNumberFinder();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Проверим выбрасывание нужного исключения")
    void findMaxNumber() {
        List<Integer> numbers = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> maxNumberFinder.findMaxNumber(numbers));
    }

    @Test
    @DisplayName("Проверим поиск максимального числа")
    void findMaxNumber2() {
        List<Integer> numbers = List.of(10, 5, 20, 15, 30);
        assertEquals(30, maxNumberFinder.findMaxNumber(numbers));
    }
}