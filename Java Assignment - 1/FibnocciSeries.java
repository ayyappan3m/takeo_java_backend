package com.examples;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci series of " + numTerms + " terms:");
        System.out.print(firstTerm + " " + secondTerm + " ");
        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        scanner.close();

	}

}
