package com.examples;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		input.close();

	}

}
