
package com.logicalStatements.forloops;

import java.util.Scanner;

public class EvenSumOfDigitsOFNumberForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sumofDigit = sumOfDigit(num);
		sc.close();

		System.out.println("the sumOfdisgit of the given number is: " + sumofDigit);
	}

	static int sumOfDigit(int n) {
		int sum = 0;
		String numStr = Integer.toString(n);
		for (int i = 0; i < numStr.length(); i += 2) {
			int digit = numStr.charAt(i) - '0';
			sum += digit;
		}
		return sum;

	}

}
