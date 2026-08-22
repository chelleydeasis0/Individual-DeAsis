package com.joysistvi.stage1.Day4;

public class Activity2_DeAsis {

    public static void main(String[] args) {
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Percentages
        double foodPercent = (foodAllowance / income) * 100;
        double transPercent = (transportation / income) * 100;
        double rentPercent = (rent / income) * 100;
        double utilityPercent = (utilityBill / income) * 100;

        // Remaining balance
        double remainingBalance = income - (foodAllowance + transportation + rent + utilityBill);

        // Output with rounding
        System.out.printf("Income: %.0f\n", income);
        System.out.printf("Food Allowance: %.1f %%\n", foodPercent);
        System.out.printf("Transportation: %.1f %%\n", transPercent);
        System.out.printf("Rent: %.1f %%\n", rentPercent);
        System.out.printf("Utility Bill: %.1f %%\n", utilityPercent);
        System.out.printf("Remaining Balance: %.0f\n", remainingBalance);

        System.out.println("BUILD SUCCESSFUL");
    }

}