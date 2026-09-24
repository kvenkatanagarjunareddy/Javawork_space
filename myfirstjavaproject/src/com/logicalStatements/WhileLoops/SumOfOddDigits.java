package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class SumOfOddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numer: ");
		int num = sc.nextInt();
		SumofOddDigits(num);
	}

	static void SumofOddDigits(int num) {
		int sum = 0;
		int i = 1;
		String numStr = Integer.toString(num);
		while (i < numStr.length()) {
			int digit = numStr.charAt(i) - '0';
			sum += digit;
			i += 2;
		}
		System.out.println("Sum of odd digits is: " + sum);
	}

}
