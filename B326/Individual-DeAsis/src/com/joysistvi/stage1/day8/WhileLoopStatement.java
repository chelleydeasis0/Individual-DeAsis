package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       boolean isRunning = false;
       while (isRunning) {
           System.out.println("Type 'exit' to stop: ");
           String input = sc.nextLine();

           if (input.equalsIgnoreCase("exit)")) {
               System.out.println("program stopped!");
               isRunning = true;
           }


        }


    }
}
//  int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;

//flag - used to track/MArk a variable
