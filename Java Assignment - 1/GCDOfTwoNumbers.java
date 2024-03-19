package com.examples;

import java.util.Scanner;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int minNumber = Math.min(number1, number2);
        int hcf = 1;
        for (int i = 1; i <= minNumber; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + number1 + " and " + number2 + " is: " + hcf);
        scanner.close();

	}

}
