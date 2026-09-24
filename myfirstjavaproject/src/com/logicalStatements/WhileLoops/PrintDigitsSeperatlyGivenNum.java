package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class PrintDigitsSeperatlyGivenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		SeperateDigitPrint(num);

	}

	static void SeperateDigitPrint(int num) {

		String numStr = Integer.toString(num);
		int i = 0;
		while (i < numStr.length()) {

			System.out.print(numStr.charAt(i) + " ");
			i++;

		}
	}

}
