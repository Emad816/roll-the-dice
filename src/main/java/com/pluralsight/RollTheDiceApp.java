package com.pluralsight;

public class RollTheDiceApp {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1 = dice.roll(1, 6);
        System.out.println(roll1);
        int roll2 = dice.roll(1, 6);
        System.out.println(roll2);




    }
}
