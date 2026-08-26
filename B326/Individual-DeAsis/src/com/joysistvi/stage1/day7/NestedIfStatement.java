package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--- Age Categorizer ---");
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        //Section Syntax of nexted If Statement

        //  Age CCategorizer /*

        //Code Minization for getting the range

        //Validation
        //Age: 0 -120

        if (age >= 0 && age <= 120) {
            if (age <= 2) {
                System.out.println("Category: Baby");
            } else if (age <= 12) {
                System.out.println("Category: Child");
            } else if (age <= 19) {
                System.out.println("Category: Teenager");
            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Age! Age must be greater 0") ;
        }


        }
    }
