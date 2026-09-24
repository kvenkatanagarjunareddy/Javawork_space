package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class Number100To0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number where you want to start");
		int start = sc.nextInt();
		System.out.println("Enter a number where you want to stop");
		int stop = sc.nextInt();
		while (start >= stop) {
			System.out.print(start + "  ");
			start--;

		}

	}

}
