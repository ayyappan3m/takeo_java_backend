package com.example;

public class CheckDivisible_3_4_5 {

	public static void main(String[] args) {
		int a = 15;
		if(a%3 == 0) {
			System.out.println("Number is divisible by 3");
		} else {
			System.out.println("Number is not divisible by 3");
		}
		
		if(a%5 == 0) {
			System.out.println("Number is divisible by 11");
		} else {
			System.out.println("Number is not divisible by 11");
		}

		if(a%11 == 0) {
			System.out.println("Number is divisible by 11");
		} else {
			System.out.println("Number is not divisible by 11");
		}

	}

}
