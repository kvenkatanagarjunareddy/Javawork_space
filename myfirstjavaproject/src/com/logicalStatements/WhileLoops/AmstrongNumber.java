package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean status = isAmstrong(num);
		if (status) {
			System.out.println("The given num is Amstrong number");
		} else {
			System.out.println("The given num is not a Amstrong Number");
		}
		sc.close();
	}

	static boolean isAmstrong(int n) {
		boolean status = false;
		int r = 0;
		int temp = n;
		int sum = 0;
		String strNum = Integer.toString(n);
		int count = strNum.length();
		while (n > 0) {
			r = n % 10;
			n /= 10;
			sum = (int) (sum + Math.pow(r, count));
		}
		if (temp == sum) {
			status = true;
		}
		return status;

	}

}
