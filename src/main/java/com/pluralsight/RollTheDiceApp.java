package com.pluralsight;

public class RollTheDiceApp {
    public static void main(String[] args) {

        Dice dice = new Dice();
        int result = dice.roll(1, 6);
        System.out.println(result);



    }
}
