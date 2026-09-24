package com.logicalStatements.forloops;

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
		
		String numStr = Integer.toString(num);
		for(int i=1;i<numStr.length();i+=2) {
			int digit = numStr.charAt(i) - '0';
			sum += digit;
			
		}
		System.out.println("Sum of odd digits is: " + sum);
	}

}
