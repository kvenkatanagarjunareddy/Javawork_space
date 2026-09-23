package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int reverse=reverseOfNumber(num);
		sc.close();
		System.out.println(reverse);
		
	}
	static int reverseOfNumber(int num) {
		int rev=0;
		int r=0;
		while(num>0) {
			r=num%10;
			num/=10;
			rev=rev*10+r;
		}
		return rev;
	}

}
