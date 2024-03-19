package com.pattern;

public class Pattern10 {

	public static void main(String[] args) {
		int rows = 5; 
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows - 1; j++) {
                System.out.print("  ");
            }
            char ch = (char) ('E' - i); 
            for (int k = 0; k <= i; k++) {
                System.out.print(ch + " ");
                ch++; 
            }
            System.out.println();
        }

	}

}
