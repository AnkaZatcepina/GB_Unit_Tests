package ru.anka.lesson5.task1;

import java.util.List;

public class MaxNumberFinder {
    public int findMaxNumber(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("The list of numbers is empty.");
        }

        int max = numbers.get(0);

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
