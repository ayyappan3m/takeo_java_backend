package com.examples;

import java.util.Scanner;

public class SwapUsingThirdVariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();
        System.out.println("Values before swapping:");
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
        int temp;
        for (int i = 0; i < 1; i++) {
            temp = firstValue;
            firstValue = secondValue;
            secondValue = temp;
        }
        System.out.println("\nValues after swapping:");
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
        scanner.close();

	}

}
