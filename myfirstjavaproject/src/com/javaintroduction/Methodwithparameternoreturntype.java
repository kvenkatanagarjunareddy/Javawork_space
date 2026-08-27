package com.javaintroduction;

import java.util.Scanner;

public class Methodwithparameternoreturntype {
	
	void calculateSum(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		System.out.println("Sum: " + sum);
	}
	
	void calculateDifference(int firstNumber, int secondNumber) {
		int difference = firstNumber - secondNumber;
		System.out.println("Difference: " + difference);
	}
	
	void calculateProduct(int firstNumber, int secondNumber) {
		int product = firstNumber * secondNumber;
		System.out.println("Product: " + product);
	}
	
	void calculateQuotient(int firstNumber, int secondNumber) {
		
		int quotient = firstNumber / secondNumber;
		System.out.println("Quotient: " + quotient);
	}
	
	void calculateRemainder(int firstNumber, int secondNumber) {
		calculateSum(firstNumber, secondNumber);
		int remainder = firstNumber % secondNumber;
		System.out.println("Remainder: " + remainder);
	}
	
	void calculateSquare(int number) {
		int square = number * number;
		System.out.println("Square: " + square);
	}
	
	void calculateCube(int number) {
		int cube = number * number * number;
		System.out.println("Cube: " + cube);
	}
	
	void calculateAverage(int firstNumber, int secondNumber) {
		int average = (firstNumber + secondNumber) / 2;
		System.out.println("Average: " + average);
	}

	public static void main(String[] args) {
		System.out.println("Main method started.");
		
		Methodwithparameternoreturntype calculator = new Methodwithparameternoreturntype();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number (a): ");
		int a = scanner.nextInt();
		
		System.out.print("Enter the second number (b): ");
		int b = scanner.nextInt();
		
		System.out.println("\n--- Calculating Results ---");
		calculator.calculateAverage(a, b);
		calculator.calculateCube(b);
		calculator.calculateDifference(a, b);
		calculator.calculateProduct(a, b);
		calculator.calculateQuotient(a, b);
		calculator.calculateRemainder(a, b);
		calculator.calculateSquare(b);
		
		scanner.close(); 
		System.out.println("Main method finished.");
	}
}
