package com.examples;

import java.util.Scanner;

public class PrintAllAmstrongNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = input.nextInt();
		int num = 0; int temp; int last;
		for(int i = 1; i<=n ;i++) {
			temp = i; num = 0;
			for(;temp != 0;) {
				last = temp%10;
				 temp /= 10;
				num += last*last*last;
			}
			if(num == i) {
				System.out.println(i+" is Amstrong number");
			}
		}
		
		input.close();

	}

}
