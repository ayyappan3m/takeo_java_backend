package com.pattern;

public class Pattern11 {

	public static void main(String[] args) {
		int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

	}

}
