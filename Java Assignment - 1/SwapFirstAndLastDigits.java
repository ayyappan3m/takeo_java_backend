package com.examples;

import java.util.Scanner;

public class SwapFirstAndLastDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int numDigits = 0;
        while (temp > 0) {
            temp /= 10;
            numDigits++;
        }
        int firstDigit = number / (int) Math.pow(10, numDigits - 1);
        int lastDigit = number % 10;
        int swappedNumber = lastDigit;
        
        for (int i = 1; i < numDigits; i++) {
            swappedNumber *= 10;
        }
        
        swappedNumber += number % ((int) Math.pow(10, numDigits - 1));
        swappedNumber -= lastDigit;
        swappedNumber += firstDigit;
        System.out.println("Original number: " + number);
        System.out.println("Swapped number: " + swappedNumber);
        
        scanner.close();

	}

}
