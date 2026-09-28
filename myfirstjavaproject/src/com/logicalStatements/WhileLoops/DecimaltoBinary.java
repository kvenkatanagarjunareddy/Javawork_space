package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		decimalToBinary(num);
		sc.close();
		}
	static void decimalToBinary(int num) {
		int r=0;
		String s=" ";
		int sumup=0;
		int multiplier=1;
		while(num>0) {
			r=num%2;

			s=r+s;
			sumup=sumup+(r*multiplier);
			multiplier*=2;
			num/=2;
		}
		System.out.println("the binarey number is:"+s);
		System.out.println("The orginal numer is:" +sumup);
	}

}
