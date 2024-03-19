package com.example;

import java.util.Scanner;

public class TriangleProblem_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of the sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();
        
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input. All sides of a triangle must be positive.");
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Invalid input. The sum of the lengths of any two sides of a triangle must be greater than the length of the third side.");
        } else {
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is an equilateral triangle.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is an isosceles triangle.");
            } else {
                System.out.println("The triangle is a scalene triangle.");
            }
        }
        
        scanner.close();
	}

}
