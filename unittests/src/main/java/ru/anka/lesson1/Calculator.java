package ru.anka.lesson1;


public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    public double calculateDiscount(int cost, int discountPrc) {
        if (cost <= 0){
            throw new ArithmeticException("Неверная стоимость");
        }
        if (discountPrc < 0 || discountPrc >= 100){
            throw new ArithmeticException("Процент скидки должен быть от 0 до 99");
        }
        double result = cost - cost * discountPrc / 100 ;
        return result;
    }
}
