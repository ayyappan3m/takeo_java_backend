package com.example;

import java.util.Scanner;

public class UpperCaseOrLowerCase_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is not a valid alphabet character.");
        }
        
        scanner.close();

	}

}
