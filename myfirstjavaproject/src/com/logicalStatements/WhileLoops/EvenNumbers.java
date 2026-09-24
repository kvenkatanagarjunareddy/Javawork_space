
package com.logicalStatements.WhileLoops;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number where you want start : ");
		int n=sc.nextInt();
		System.out.println("Enter a number where you want stop : ");
		int stop=sc.nextInt();
		while(n<=stop ) {
			
			System.out.print(n+" ");
			n+=2;
		}

	}

}
