package com.pattern;

public class Pattern20 {

	public static void main(String[] args) {
		int rowCount = 5;
        for (int i = 1; i <= rowCount; i++) {
            for (int j = rowCount; j > i; j--) {
                System.out.print(" ");
            }
            for (char ch = 'E'; ch >= 'A'; ch--) {
                if (ch > 'A' && i >= 2) {
                    System.out.print(ch + " ");
                } else {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }

	}

}
