package com.examples;

import java.util.Scanner;

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		boolean isPrime = true;
		for(int j = 1; j <= n ;j++) {
			isPrime = true;
			for(int i=2;i<j;i++) {
				if(j%i == 0)  {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(j);
			} 
		}
		
		
		input.close();

	}

}
