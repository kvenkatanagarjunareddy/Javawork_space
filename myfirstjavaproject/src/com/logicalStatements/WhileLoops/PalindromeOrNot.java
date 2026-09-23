package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean status = isPalindrome(num);
		if (status) {
			System.out.println("The given num is Palindrome");
		} else {
			System.out.println("The given num is not a Palindrome");
		}
		sc.close();
	}

	static boolean isPalindrome(int num) {
		boolean status = false;
		int r = 0;
		int rev = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			num /= 10;
			rev = rev * 10 + r;
		}
		if (rev == temp) {
			status = true;
		}
		return status;
	}

}
