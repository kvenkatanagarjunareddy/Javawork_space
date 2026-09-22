package com.logicalStatements.forloops;

import java.util.Scanner;

public class primeNumbers {
	static boolean isprime(int n) {
		boolean status=true;
		if(n==1 || n==0) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Numeber: ");
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
		if(isprime(i)) {
			System.out.println(i);
		}
		}

	}

}
