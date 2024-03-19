package com.example;

import java.util.Scanner;

public class TemperatureConveter_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
        
        scanner.close();

	}

}
