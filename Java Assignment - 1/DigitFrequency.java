package com.examples;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int[] digitFrequency = new int[10]; 
	        number = Math.abs(number);
	        while (number > 0) {
	            int digit = number % 10; 
	            digitFrequency[digit]++; 
	            number /= 10; 
	        }
	        System.out.println("Frequency of digits in the given number:");
	        for (int i = 0; i < 10; i++) {
	            if (digitFrequency[i] > 0) {
	                System.out.println("Digit " + i + " occurs " + digitFrequency[i] + " times.");
	            }
	        }
	        
	        scanner.close();

	}

}
