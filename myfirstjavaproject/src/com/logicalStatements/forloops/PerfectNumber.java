package com.logicalStatements.forloops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		boolean flag=perfectChecking(num);
		if(flag) {
			System.out.println("perfecct numer");
		}else {
			System.out.println("Not a perfect number");
		}
		
	}
	static boolean perfectChecking(int num) {
		boolean status=false;
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			status=true;
		}
		return status;
	}

}
