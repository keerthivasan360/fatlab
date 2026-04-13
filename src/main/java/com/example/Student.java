package com.example;

public class Student {
    // Fields for student data
    String name;
    double catMarks;        // Max 30M
    double assignmentMarks; // Max 20M
    double fatMarks;        // Max 50M
    double totalMarks;
    double gpa;
    String grade;

    public Student(String name, double cat, double assignment, double fat) {
        this.name = name;
        this.catMarks = cat;
        this.assignmentMarks = assignment;
        this.fatMarks = fat;
        
        // 1. Calculate Total Marks
        this.totalMarks = cat + assignment + fat;
        
        // 2. Compute GPA (Scale of 10)
        this.gpa = this.totalMarks / 10;
        
        // 3. Provide Performance Insights (Grades)
        this.grade = computeGrade(this.totalMarks);
    }

    private String computeGrade(double total) {
        if (total >= 90) return "S (Excellent)";
        else if (total >= 80) return "A (Very Good)";
        else if (total >= 70) return "B (Good)";
        else if (total >= 60) return "C (Average)";
        else if (total >= 50) return "D (Pass)";
        else return "F (Fail)";
    }

    // Method to print student row in the report
    public void displayRow() {
        System.out.printf("%-12s | %-5.1f | %-5.1f | %-5.1f | %-6.1f | %-4.1f | %-12s%n", 
            name, catMarks, assignmentMarks, fatMarks, totalMarks, gpa, grade);
    }
}
