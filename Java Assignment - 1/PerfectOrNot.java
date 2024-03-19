package com.examples;

import java.util.Scanner;

public class PerfectOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		int sum = 0;
		for(int i=1;i<n;i++) {
			if(n%i == 0)  {
				sum += i;
			}
		}
		if(n == sum) {
			System.out.println(n+" is a perfect number");
		} else {
			System.out.println(n+" is not a perfect number");
		}
		input.close();

	}

}
