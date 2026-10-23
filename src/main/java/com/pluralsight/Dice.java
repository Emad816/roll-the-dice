package com.pluralsight;

public class Dice {
    public int roll(int minValue, int maxValue){

        int randomNumber = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;

        return randomNumber;
    }
}
