package com.joysis.discussion.day20;

public class CreditCardPayment extends Payment {
    double cashAdvance;

    public CreditCardPayment(double balance) {
        super(balance, 0.0); // amount default 0
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using CreditCard!");
        balance -= amount;
        System.out.println("Remaining balance: " + balance);
    }
}
