package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class SumOfTheDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int sumofDigit=sumOfDigit(num);
		sc.close();
		
		System.out.println("the sumOfdisgit of the given number is: "+sumofDigit);
	}
	static int sumOfDigit(int n) {
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n/=10;
			sum+=r;
			
		}
		return sum;
		
		
	}
	

}
