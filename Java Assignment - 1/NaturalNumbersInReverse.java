package com.examples;

import java.util.Scanner;

public class NaturalNumbersInReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
		
		input.close();

	}

}
