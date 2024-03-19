package com.examples;

import java.util.Scanner;

public class PalindromCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String numString = String.valueOf(number);
        boolean isPalindrome = true;
        for (int i = 0; i < numString.length() / 2; i++) {
            if (numString.charAt(i) != numString.charAt(numString.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();

	}

}
