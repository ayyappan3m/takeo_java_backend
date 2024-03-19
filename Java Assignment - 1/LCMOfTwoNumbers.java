package com.examples;

import java.util.Scanner;

public class LCMOfTwoNumbers {
	public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int gcd = calculateGCD(number1, number2);
        int lcm = (number1 * number2) / gcd;
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);
        scanner.close();
		
	}

}
