package com.example;

import java.util.Scanner;

public class DivisionChecker_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage of marks obtained: ");
        double percentage = scanner.nextDouble();
        
        String division;
        if (percentage >= 60.0) {
            division = "Division 1";
        } else if (percentage >= 45.0) {
            division = "Division 2";
        } else if (percentage >= 30.0) {
            division = "Division 3";
        } else {
            division = "Fail";
        }
        
        System.out.println("Division based on percentage: " + division);
        
        scanner.close();

	}

}
