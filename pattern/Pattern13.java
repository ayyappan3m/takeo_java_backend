package com.pattern;

public class Pattern13 {

	public static void main(String[] args) {
		int rows = 5; 
        char startChar = 'A'; 

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (startChar + i));
                if (k < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

	}

}
