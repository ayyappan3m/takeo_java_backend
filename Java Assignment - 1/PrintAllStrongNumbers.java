package com.examples;

import java.util.Scanner;

public class PrintAllStrongNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		int n1 = n;
		int num = 0; int last;
		for(int j=1;j<=n;j++) {
			int temp = j; num = 0;
			for(;temp != 0;) {
				last = temp%10;
				 temp /= 10;
				 int fact = 1;
				 for(int i = 1; i<= last;i++)
					 fact *= i;
				 num += fact;
			}
			if(num == j) {
				System.out.println(j);
			}
		}
		
		input.close();

	}

}
