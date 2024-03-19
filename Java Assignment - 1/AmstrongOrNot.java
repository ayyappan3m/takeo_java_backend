package com.examples;

import java.util.Scanner;

public class AmstrongOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		int n1 = n;
		int num = 0; int last;
		for(;n != 0;) {
			last = n%10;
			 n /= 10;
			num += last*last*last;
		}
		if(num == n1) {
			System.out.println(n1+" is Amstrong number");
		} else {
			System.out.println(n1+" is Not Amstrong number");
		}
		input.close();

	}

}
