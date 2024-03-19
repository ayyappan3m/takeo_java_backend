package com.example;

import java.util.Scanner;

public class DayInMonth_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        int days;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            days = 28; // Assuming non-leap year by default
        } else {
            days = -1; // Invalid month
        }
        
        if (days != -1) {
            System.out.println("The number of days in month " + month + " is " + days + ".");
        } else {
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
        }
        
        scanner.close();

	}

}
