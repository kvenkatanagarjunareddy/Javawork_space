package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int count = SumDigitCount(num);
		System.out.println("The count of the given number is: " + count);

	}

	static int SumDigitCount(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;

		}
		return count;

	}

}
