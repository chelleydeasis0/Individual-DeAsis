package com.joysis.discussion.day20;

public class CashPayment extends Payment {

    public CashPayment(double balance) {
        super(balance, 0.0); // amount default 0
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash payment!");
        balance -= amount;
        System.out.println("Remaining balance: " + balance);
    }
}
