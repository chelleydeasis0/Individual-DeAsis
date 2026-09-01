package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9StringClass_DeAsis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input 2 countries
        String[] countries = new String[2];
        for (int i = 0; i < countries.length; i++) {
            System.out.print("Enter country " + (i+1) + ": ");
            countries[i] = sc.nextLine();
        }

        // Process each country
        for (int i = 0; i < countries.length; i++) {
            String country = countries[i];
            System.out.println("\nCountry: " + country);

            // First and last character
            char first = country.charAt(0);
            char last = country.charAt(country.length() - 1);
            System.out.println("First character: " + first);
            System.out.println("Last character: " + last);

            // Count P/p
            int countP = 0;
            for (int j = 0; j < country.length(); j++) {
                char c = country.charAt(j);
                if (c == 'P' || c == 'p') {
                    countP++;
                }
            }
            System.out.println("Number of P/p: " + countP);

            // Count vowels
            int vowels = 0;
            for (int j = 0; j < country.length(); j++) {
                char c = Character.toLowerCase(country.charAt(j));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
            }
            System.out.println("Number of vowels: " + vowels);
        }
    }
}

