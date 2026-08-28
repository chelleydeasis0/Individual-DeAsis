package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_MultiplicationTable_DeAsis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }

}
