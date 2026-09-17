package com.logicalStatements.forloops;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println("EvenNumbers");
        for(int i=0;i<=num;i++) {
        	if(i%2==0 && i!=0) {
        		System.out.print(i+" ");
        	}
        }
        System.out.println();
		System.out.println("=========================");
        System.out.println("OddNubers: ");
        for(int i=0;i<=num;i++) {
        	if(i%2==1 && i!=0) {
        		System.out.print(i+" ");
        	}
        }
		

	}

}
