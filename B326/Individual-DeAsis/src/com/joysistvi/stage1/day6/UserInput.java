package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class UserInput {

    public static void main(String args[]) {
        // create an object of scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}
