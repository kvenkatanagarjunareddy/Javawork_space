
package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class EvenSumGivenNumber{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		SeperateDigitPrint(num);

	}

	static void SeperateDigitPrint(int num) {
		String numStr = Integer.toString(num);
		int i = 0;
		int sum = 0;
		while (i < numStr.length()) {
			int digit = numStr.charAt(i) - '0';
			sum += digit;
			i += 2;
		}
		System.out.println("The sum of digit is " + sum);

	}

}
