package com.pattern;

public class Pattern17 {

	public static void main(String[] args) {
		 int rows = 5; 
	        int num = 1; 

	        for (int i = 1; i <= rows; i++) {
	            for (int j = i; j < rows; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print(num++ + " ");
	            }
	            System.out.println();
	        }

	}

}
