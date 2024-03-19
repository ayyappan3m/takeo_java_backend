package com.pattern;

public class Pattern2 {

	public static void main(String[] args) {
		char startChar = 'A'; 
        int rows = 5; 

        for (int i = 0; i < rows; i++) {
            char ch = startChar; 
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++; 
            }
            System.out.println();
        }

	}

}
