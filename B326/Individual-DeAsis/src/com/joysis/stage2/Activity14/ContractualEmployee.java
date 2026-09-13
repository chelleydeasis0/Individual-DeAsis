package com.joysis.stage2.Activity14;

public class ContractualEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public ContractualEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }
}