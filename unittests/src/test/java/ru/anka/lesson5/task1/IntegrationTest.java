package ru.anka.lesson5.task1;

import org.junit.jupiter.api.Test;


import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {
    @Test
    void checkThemAllTogether(){
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(1,12);
        List<Integer> generatedNumbers = randomNumberGenerator.generateRandomNumbers(5);
        int actualMax = Collections.max(generatedNumbers);
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        assertEquals(actualMax, maxNumberFinder.findMaxNumber(generatedNumbers));
    }

}
