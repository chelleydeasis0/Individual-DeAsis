package com.joysis.stage2.day22.Activity15;

public class RegularEmployee1 extends Employee implements Bonusable, Auditable {

    private static final double ATTENDANCE_BONUS = 1000;
    private static final double TAX_RATE = 0.10;

    public RegularEmployee1(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return baseSalary + ATTENDANCE_BONUS;
    }

    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }

    @Override
    public double computeDeductions() {
        return computeSalary() * TAX_RATE;
    }

    @Override
    public double computeBonus() {
        return baseSalary * 0.05;
    }

    @Override
    public boolean isEligibleForBonus() {
        return true;
    }

    @Override
    public String generateEmployeeId() {
        return "REG-" + name.toUpperCase();
    }

    @Override
    public void logSalaryComputation(String employeeId) {
        System.out.println(
                "Audit log: " + employeeId + " salary computed."
        );
    }
}