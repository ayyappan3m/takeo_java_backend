package com.examples;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		boolean isPrime = true;
		for(int i=2;i<n;i++) {
			if(n%i == 0)  {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(n+" is prime");
		} else {
			System.out.println(n+" is not prime");
		}
		input.close();

	}

}
