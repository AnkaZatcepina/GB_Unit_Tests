package ru.anka.lesson3.hw;

public class Interval {
    private final int MIN = 25; 
    private final int MAX = 100; 
    public boolean numberInInterval(int n){
        if ( MIN <= n && n <= MAX ){
            return true;
        }
        return false;
    }
}
