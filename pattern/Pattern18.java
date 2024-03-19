package com.pattern;

public class Pattern18 {

	public static void main(String[] args) {
		char startChar = 'A'; 
        int rows = 5; 
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (startChar + j - 1) + " ");
            }
            System.out.println();
        }

	}

}
