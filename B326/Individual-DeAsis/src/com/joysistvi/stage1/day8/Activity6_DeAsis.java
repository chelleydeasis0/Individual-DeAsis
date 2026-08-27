package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class Activity6_DeAsis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String email = "clover@gmail.com";
        String password = "Clover0330";
        boolean success = false;

        // For loop → 3 attempts
        for(int attempts = 1; attempts <= 3; attempts++) {
            System.out.print("Enter email: ");
            String loginEmail = sc.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = sc.nextLine();

            if(loginEmail.equals(email) && loginPassword.equals(password)) {
                System.out.println("Login successful!");
                success = true;
                break; // stop loop kapag tama
            } else {
                System.out.println("Invalid email or password. Attempt " + attempts + " of 3.");
            }
        }

        if(!success) {
            System.out.println("Too many failed attempts. Account locked.");
        }
    }
}

