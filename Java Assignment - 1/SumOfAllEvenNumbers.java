package com.examples;

import java.util.Scanner;

public class SumOfAllEvenNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(i%2 == 0)
				sum += i;
		}
		System.out.println(sum);
		input.close();
	}

}
