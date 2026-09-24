
package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		SeperateDigitPrint(num);

	}

	static void SeperateDigitPrint(int num) {
		int product = 1;
		int digit;
		while (num > 0) {
			digit = num % 10;
			product *= digit;
			num /= 10;
		}
		System.out.println("The product of the given digit is: " + product);

	}

}
