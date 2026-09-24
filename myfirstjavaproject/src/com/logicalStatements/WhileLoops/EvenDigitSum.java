
package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class EvenDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number where you want to start");
		int start = sc.nextInt();
		System.out.println("Enter a number where you want to stop");
		int stop = sc.nextInt();
		int sum = 0;
		while (start <= stop) {

			if (start != 0 && start % 2 == 0) {
				sum += start;

			}

			start++;
		}
		System.out.println("sum of even digits: " + sum);

	}

}
