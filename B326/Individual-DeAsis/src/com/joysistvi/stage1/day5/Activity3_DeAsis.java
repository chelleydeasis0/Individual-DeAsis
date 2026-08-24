package com.joysistvi.stage1.day5;

public class Activity3_DeAsis {

    public static void main(String[] args) {


        // 2. Logical AND (&&)
        int age = 20;
        boolean hasValidID = true;

        if (age >= 18 && hasValidID) {
            System.out.println("Allowed to enter the event.");
        } else {
            System.out.println("Not allowed to enter.");
        }

        // 3. Logical OR (||)
        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("No classes today.");
        } else {
            System.out.println("There are classes today.");
        }

        // 4. Ternary Operator (? :)
        int score = 80;
        String result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Student result: " + result);

        // 5. Ternary Operator for larger number
        int num1 = 25;
        int num2 = 40;
        int larger = (num1 > num2) ? num1 : num2;
        System.out.println("Larger number is: " + larger);

    }
}
