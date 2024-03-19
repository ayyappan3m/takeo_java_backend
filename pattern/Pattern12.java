package com.pattern;

public class Pattern12 {

	public static void main(String[] args) {
		int rows = 5; 

        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    System.out.print(i + 1 + " "); 
                } else {
                    System.out.print(i + 1 + "" + i + " "); 
                }
            }
            System.out.println();
        }
	}

}
