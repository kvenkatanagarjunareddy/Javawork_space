package com.switchstatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isrunning = true;

		while (isrunning) {
		
			System.out.println("\nEnter the operator you want to perform (+, -, *, /, %) or '@' to exit:");
			String operator = sc.next();

			
			if (operator.equals("@")) {
				System.out.println("Thanks for using the calculator!");
				isrunning = false;
			} else {
				System.out.println("Enter a value:");
				int a = sc.nextInt();
				System.out.println("Enter the b value:");
				int b = sc.nextInt();

				
				switch (operator) {
					case "+" -> System.out.println("Addition: " + (a + b));
					case "-" -> System.out.println("Subtraction: " + (a - b));
					case "*" -> System.out.println("Multiplication: " + (a * b));
					case "/" -> {
						
						if (b != 0) {
							System.out.println("Division: " + (a / b));
						} else {
							System.out.println("Error: Cannot divide by zero!");
						}
					}
					case "%" -> System.out.println("Remainder: " + (a % b));
					default -> System.out.println("Enter a valid operator");
				}
			}
		}
		sc.close();
	}
}
