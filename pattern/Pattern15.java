package com.pattern;

public class Pattern15 {

	public static void main(String[] args) {
		int rows = 5; 
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

	}

}
