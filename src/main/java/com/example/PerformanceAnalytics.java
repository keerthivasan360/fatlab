package com.example;

import java.util.Scanner;

public class PerformanceAnalytics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5]; // Array for 5 student entries

        System.out.println("--- Student Performance Analytics System ---");

        // Input loop for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Student #" + (i + 1));
            System.out.print("Name: ");
            String name = sc.next();
            
            System.out.print("Enter CAT Marks (30M): ");
            double cat = sc.nextDouble();
            
            System.out.print("Enter Assignment Marks (20M): ");
            double assign = sc.nextDouble();
            
            System.out.print("Enter FAT Marks (50M): ");
            double fat = sc.nextDouble();

            // Store student data and perform calculations
            students[i] = new Student(name, cat, assign, fat);
        }

        // Display the Analytics Report
        System.out.println("\n" + "=".repeat(75));
        System.out.printf("%-12s | %-5s | %-5s | %-5s | %-6s | %-4s | %-12s%n", 
            "NAME", "CAT", "ASGN", "FAT", "TOTAL", "GPA", "GRADE");
        System.out.println("-".repeat(75));

        Student topper = students[0];
        for (Student s : students) {
            s.displayRow();
            // Identify the Topper
            if (s.totalMarks > topper.totalMarks) {
                topper = s;
            }
        }

        // Performance Insight: Identify Topper
        System.out.println("=".repeat(75));
        System.out.println("\n*** PERFORMANCE INSIGHTS ***");
        System.out.println("SYSTEM TOPPER: " + topper.name);
        System.out.println("HIGHEST SCORE: " + topper.totalMarks + "/100");
        System.out.println("TOPPER GRADE: " + topper.grade);
        
        sc.close();
    }
}
