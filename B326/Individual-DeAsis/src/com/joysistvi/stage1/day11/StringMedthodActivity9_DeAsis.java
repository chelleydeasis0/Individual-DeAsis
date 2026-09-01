package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class StringMedthodActivity9_DeAsis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. contains() -
        String sentence = "I love learning Java";
        System.out.println("1. contains(): " + sentence.contains("Java"));


        // 2. endsWith()
        String fileName = "assignment.pdf";
        System.out.println("2. endsWith(): " + fileName.endsWith(".pdf"));


        // 3. startsWith()
        String name = "Maria";

        System.out.println(name.startsWith("M"));


        // 4. indexOf()
        String word = "Banana";
        System.out.println(word.indexOf("n"));


        // 5. isEmpty()
        String message = "";
        System.out.println("5. isEmpty(): " + message.isEmpty());


        // 6. trim()
        String username = "   student123   ";
        System.out.println("6. trim(): " + username.trim());


        // 7. replace()
        String sentence2 = "I like cats";
        System.out.println("7. replace(): " +
                sentence2.replace("cats", "dogs"));


        // 8. toCharArray()
        String fruit = "Apple";
        char[] letters = fruit.toCharArray();

        System.out.println("8. toCharArray():");
        for (char letter : letters) {
            System.out.println(letter);
        }


        // 9. nextLine().charAt()
        Scanner input = new Scanner(System.in);

        System.out.print("9. Enter your favorite color: ");
        char firstLetter = input.nextLine().charAt(0);

        System.out.println("First letter: " + firstLetter);


        // 10. valueOf()
        int score = 95;
        String scoreText = String.valueOf(score);

        System.out.println("10. valueOf(): " + scoreText);
    }
}

