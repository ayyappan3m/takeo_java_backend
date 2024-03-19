package com.examples;

import java.util.Scanner;

public class PrintAllPerfectNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		int sum = 0;
		for(int j=1;j<n;j++) {
			sum = 0;
			for(int i=1;i<j;i++) {
				if(j%i == 0)  {
					sum += i;
				}
			}
			if(j == sum) {
				System.out.println(j);
			}
		}
		
		
		input.close();

	}

}
