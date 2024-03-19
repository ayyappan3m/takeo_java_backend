package com.pattern;

public class Pattern19 {

	public static void main(String[] args) {
		int rows = 5; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "); 
            }
            for (char ch = 'E'; ch >= 'A'; ch--) {
                if (i == 0 && ch == 'A') {
                    System.out.print(ch);
                } else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
		
	}

}
