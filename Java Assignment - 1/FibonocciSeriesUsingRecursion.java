package com.examples;

import java.util.Scanner;

public class FibonocciSeriesUsingRecursion {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of terms in the Fibonacci series: ");
	        int numTerms = scanner.nextInt();
	        System.out.println("Fibonacci series of " + numTerms + " terms:");
	        for (int i = 1; i <= numTerms; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	        scanner.close();

	}
	public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
