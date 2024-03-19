package com.examples;

import java.util.Scanner;

public class SumofAllOddNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i+=2) {
				sum += i;
		}
		System.out.println(sum);
		input.close();

	}

}
