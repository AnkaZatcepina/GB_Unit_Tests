package ru.anka.lesson5.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    private RandomNumberGenerator randomNumberGenerator;
    private  List<Integer> generatedNumbers = new ArrayList<>();
    @BeforeEach
    void setUp() {
        randomNumberGenerator = new RandomNumberGenerator(1,12);
        generatedNumbers = randomNumberGenerator.generateRandomNumbers(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Проверим длину готового списка")
    void generateRandomNumbers() {
        // List<Integer> generatedNumbers = randomNumberGenerator.generateRandomNumbers(5);
        assertEquals(5, generatedNumbers.size());
    }
    @Test
    @DisplayName("Проверим,входят ли все полученный числа в нужный промежуток")
    void generateRandomNumbers2(){
        // List<Integer> generatedNumbers = randomNumberGenerator.generateRandomNumbers(5);
        for (int num : generatedNumbers){
            assertTrue( num >= 1 && num <= 12);
        }
    }

}
