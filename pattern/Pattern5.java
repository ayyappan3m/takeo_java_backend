package com.pattern;

public class Pattern5 {

	public static void main(String[] args) {
		 int rows = 5; 

	        for (int i = 0; i < rows; i++) {
	            char ch = (char) ('A' + i);
	            for (int j = 0; j <= i; j++) {
	                System.out.print(ch + " ");
	            }
	            System.out.println();
	        }

	}

}
