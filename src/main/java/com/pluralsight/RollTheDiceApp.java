package com.pluralsight;

public class RollTheDiceApp {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        int sum;
        for (int k = 1; k <= 100; k++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.printf("roll %d:  %d  -  %d  sum:  %d\n",k ,roll1 ,roll2 ,sum);

            switch (sum){
                case 2 -> twoCounter++;
                case 4 -> fourCounter++;
                case 6 -> sixCounter++;
                case 7 -> sevenCounter++;
            }

        }
        System.out.println("twoCounter = " + twoCounter);
        System.out.println("fourCounter = " + fourCounter);
        System.out.println("sixCounter = " + sixCounter);
        System.out.println("sevenCounter = " + sevenCounter);
    }
}
