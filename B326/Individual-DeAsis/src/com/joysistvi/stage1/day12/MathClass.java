package com.joysistvi.stage1.day12;

import java.util.Random;

public class MathClass {

    public static void main(String[] args) {

        int roll = (int) (Math.random() * 58) + 1;

        System.out.println("Bingo Simulator\n");

        String letter;

        if (roll <= 15) {
            letter = "B";
        } else if (roll <= 30) {
            letter = "I";
        } else if (roll <= 45) {
            letter = "N";
        } else if (roll <= 60) {
            letter = "G";

        } else {
            letter = "O";
        }
        System.out.println("Sa letra ng " + letter + ":" + roll);
    }


}
    // Bingo simulator
    //1-58

// for (int i =1; i < 20; i++) {
//    Random random = new Random();
//  System.out.println(random.nextInt(58) + 1);
// System.out.println(int) (Math.random() * 58) +1);


