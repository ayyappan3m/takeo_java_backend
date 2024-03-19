package com.example;

import java.util.Scanner;

public class StudentGradeCalculater_21 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter marks for the following subjects:");
        System.out.print("Maths: ");
        int mathsMarks = scanner.nextInt();
        System.out.print("Physics: ");
        int physicsMarks = scanner.nextInt();
        System.out.print("Chemistry: ");
        int chemistryMarks = scanner.nextInt();
        System.out.print("English: ");
        int englishMarks = scanner.nextInt();
        System.out.print("Hindi: ");
        int hindiMarks = scanner.nextInt();
        
        int totalMarks = mathsMarks + physicsMarks + chemistryMarks + englishMarks + hindiMarks;
        
        double percentage = (double) totalMarks / 5;
        
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }
        
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();

	}

}
