package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_DeAsis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of students and subjects
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        sc.nextLine(); //

        // Subject names
        String[] subjectNames = new String[subjects];
        for (int s = 0; s < subjects; s++) {
            System.out.print("Enter subject " + (s + 1) + ": ");
            subjectNames[s] = sc.nextLine();
        }

        // Student names and grades
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];

        for (int i = 0; i < students; i++) {
            System.out.print("\nEnter student name: ");
            studentNames[i] = sc.nextLine();

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grade for " + subjectNames[j] + ": ");
                grades[i][j] = sc.nextDouble();
            }
            sc.nextLine(); //
        }

        // Display Grades Report
        System.out.println("\n");
        System.out.println("        Grades Report");


        // Header row
        System.out.print("Student\t");
        for (String subj : subjectNames) {
            System.out.print(subj + "\t");
        }
        System.out.println("Average");


        // Data rows
        for (int i = 0; i < students; i++) {
            System.out.print(studentNames[i] + "\t");
            double sum = 0;
            for (int j = 0; j < subjects; j++) {
                System.out.print(grades[i][j] + "\t");
                sum += grades[i][j];
            }
            double average = sum / subjects;
            System.out.printf("%.2f\n", average); // may extra newline para bumaba
        }
    }
}