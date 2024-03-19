package com.examples;

import java.util.Scanner;

public class CountDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		int count = 0;
		while(n != 0) {
			n = n/10;
			count++;
		}
		System.out.println(count);
		input.close();
	}

}
