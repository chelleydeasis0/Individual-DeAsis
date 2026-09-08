package com.joysis.stage2.day17;

import java.util.Scanner;

public class Activity12JavaMethods_DeAsis {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n============================");
            System.out.println("      JAVA METHODS MENU");
            System.out.println("============================");

            System.out.println("1. Check Odd or Even");
            System.out.println("2. Print Name 50 Times");
            System.out.println("3. Get Square Root");
            System.out.println("4. Get Power of a Number");
            System.out.println("5. Generate Random Number");
            System.out.println("6. Get Area of a Circle");
            System.out.println("7. Check if Person is a Voter");
            System.out.println("8. Get Length of a Word");
            System.out.println("9. Reverse a Word");
            System.out.println("10. Print Full Name and Age");
            System.out.println("0. Exit");

            System.out.print("\nEnter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();

                    checkOddEven(number);
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();

                    printName50Times(name);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    scanner.nextLine();

                    getSquareRoot(num);
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();

                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    scanner.nextLine();

                    getPower(base, exponent);
                    break;

                case 5:
                    printRandomNumber();
                    break;

                case 6:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();

                    getCircleArea(radius);
                    break;

                case 7:
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    checkVoter(age);
                    break;

                case 8:
                    System.out.print("Enter a word: ");
                    String word = scanner.nextLine();

                    getWordLength(word);
                    break;

                case 9:
                    System.out.print("Enter a word: ");
                    String reverseWord = scanner.nextLine();

                    reverseWord(reverseWord);
                    break;

                case 10:
                    System.out.print("Enter your full name: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Enter your age: ");
                    int myAge = scanner.nextInt();
                    scanner.nextLine();

                    printNameAndAge(fullName, myAge);
                    break;

                case 0:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }


    // Identify if number is odd or even
    static void checkOddEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is EVEN.");
        } else {
            System.out.println(number + " is ODD.");
        }
    }


    // Print name 50 times
    static void printName50Times(String name) {

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + name);
        }
    }


    // Get square root
    static void getSquareRoot(double number) {

        double result = Math.sqrt(number);

        System.out.println("Square root: " + result);
    }


    // Get power using base and exponent
    static void getPower(double base, double exponent) {

        double result = Math.pow(base, exponent);

        System.out.println("Result: " + result);
    }


    // Random number between 1 and 100
    static void printRandomNumber() {

        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Random number: " + randomNumber);
    }


    // Area of a circle
    static void getCircleArea(double radius) {

        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle: " + area);
    }


    // Identify if person is a voter
    static void checkVoter(int age) {

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not yet eligible to vote.");
        }
    }


    // Get length of a word
    static void getWordLength(String word) {

        System.out.println("Length of the word: " + word.length());
    }


    // Reverse a word
    static void reverseWord(String word) {

        System.out.print("Reverse: ");

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

        System.out.println();
    }


    // Print full name and age
    static void printNameAndAge(String name, int age) {

        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
    }
}

