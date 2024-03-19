package com.example;

import java.util.Scanner;

public class Weekdays_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) representing the day of the week: ");
        int dayNumber = scanner.nextInt();
        
        String day;
        if (dayNumber == 1) {
            day = "Sunday";
        } else if (dayNumber == 2) {
            day = "Monday";
        } else if (dayNumber == 3) {
            day = "Tuesday";
        } else if (dayNumber == 4) {
            day = "Wednesday";
        } else if (dayNumber == 5) {
            day = "Thursday";
        } else if (dayNumber == 6) {
            day = "Friday";
        } else if (dayNumber == 7) {
            day = "Saturday";
        } else {
            day = "Invalid day number. Please enter a number between 1 and 7.";
        }
        
        System.out.println("The day corresponding to " + dayNumber + " is " + day + ".");
        
        scanner.close();

	}

}
