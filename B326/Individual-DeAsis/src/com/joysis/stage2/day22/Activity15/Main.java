package com.joysis.stage2.day22.Activity15;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {

                new RegularEmployee1("Ana", 15000),

                new SalesEmployee1("Ben", 12000, 5000),

                new ContractualEmployee("Cruz", 160, 75)
        };

        for (Employee e : employees) {

            e.printPayslip();

            // Check if employee can receive bonus
            if (e instanceof Bonusable) {

                Bonusable b = (Bonusable) e;

                if (b.isEligibleForBonus()) {
                    System.out.println("Bonus: " + b.computeBonus());
                }
            }

            // Check if employee can be audited
            if (e instanceof Auditable) {

                Auditable a = (Auditable) e;

                a.logSalaryComputation(
                        a.generateEmployeeId()
                );
            }

            System.out.println("--------------------------------");
        }
    }
}