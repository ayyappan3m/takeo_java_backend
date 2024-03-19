package com.examples;

import java.util.Scanner;

public class SumofDigitOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		int sum = 0;
		for(;n!=0;) {
				sum += n%10;
				n /= 10;
		}
		System.out.println(sum);
		input.close();

	}

}
