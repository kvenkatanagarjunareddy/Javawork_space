package com.logicalStatements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.print("Enter your Gender m or f: ");
			String gender = sc.next();
			if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
				System.out.print("Enter Voter ID No: ");
				String voterIdNo = sc.next();
				
				System.out.println("Press any one option you want to vote 1,2,3,4  ");
				int option = sc.nextInt();
				switch (option) {
					case 1 -> System.out.println("Vote is Captured for N. Chandrababu Naidu "+voterIdNo);
					case 2 -> System.out.println("Vote is Captured for Y.S. Jagan Mohan Reddy "+voterIdNo);
					case 3 -> System.out.println("Vote is Captured for Pawan Kalyan "+voterIdNo);
					case 4 -> System.out.println("Vote is Captured for Y.S. Sharmila "+voterIdNo);
					default -> System.out.println("Thanks for Voting To NOTA "+voterIdNo);
				}
			} else {
				System.out.println("Not eligible");
			}
			
		} else {
			System.out.println("Not eligible");
		}
		
		sc.close();
	}
}
