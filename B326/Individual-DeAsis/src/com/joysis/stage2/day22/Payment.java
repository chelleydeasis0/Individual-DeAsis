package com.joysis.discussion.day20;

public class Payment {
    double balance;
    double amount;

    // Constructor: set both balance and amount
    public Payment(double balance, double amount) {
        this.balance = balance;
        this.amount = amount;
    }

    // Method 1: pay with amount
    void pay(double amount) {
        System.out.println("Processing generic payment of amount " + amount);
        balance -= amount;
        System.out.println("Remaining balance: " + balance);
    }

    // Method 2: overloaded pay
    void pay(double amount, double balance) {
        System.out.println("Processing generic payment of " + amount + " from balance " + balance);
        balance -= amount;
        System.out.println("Remaining balance: " + balance);
    }
}
