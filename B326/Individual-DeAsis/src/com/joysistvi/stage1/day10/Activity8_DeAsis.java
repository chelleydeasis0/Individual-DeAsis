package com.joysistvi.stage1.day10;

import java.util.Scanner;

public class Activity8_DeAsis {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 1. Declare array
        int[] numbers = new int[5];

        // 2. Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // 3. Display all numbers
        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // 4. Compute sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        // Highest & Lowest
        int highest = numbers[0];
        int lowest = numbers[0];
        for (int num : numbers) {
            if (num > highest) highest = num;
            if (num < lowest) lowest = num;
        }

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
    }
}