package com.examples;

import java.util.Scanner;

public class SwapValueWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();
        System.out.println("Values before swapping:");
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
        for (int i = 0; i < 1; i++) {
            firstValue += secondValue;
            secondValue = firstValue - secondValue;
            firstValue = firstValue - secondValue;
        }
        System.out.println("\nValues after swapping:");
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
        scanner.close();

	}

}
