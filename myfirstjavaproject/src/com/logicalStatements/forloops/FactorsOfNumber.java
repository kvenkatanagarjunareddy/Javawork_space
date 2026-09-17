package com.logicalStatements.forloops;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		factors(num);
	}
	static void factors(int num) {
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.print(num);
	}
}
	

