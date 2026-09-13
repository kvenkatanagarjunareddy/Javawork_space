package com.switchstatements;

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isrunning = true;
		double balance = 1000.0; 
		while (isrunning) {
			System.out.println("\n--- ATM Menu ---");
			System.out.println("1-Withdraw, 2-Deposit, 3-Balance, 4-Exit");
			System.out.println("Enter the number you want to perform:");
			
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("Enter withdraw amount:");
				double amount = sc.nextDouble();
				if (amount <= balance) {
					balance -= amount;
					System.out.println(amount + " withdrawn successfully");
				} else {
					System.out.println("Insufficient funds");
				}
				break;
			case 2:
				System.out.println("Enter deposit amt:");
				double depamount = sc.nextDouble();
				if (depamount > 0) {
					balance += depamount;
					System.out.println("Deposited successfully");
				} else {
					System.out.println("Invalid amount");
				}
				break;
			case 3:
				System.out.println("Current balance: " + balance);
				break;
			case 4:
				System.out.println("Thanks for visiting!..");
				isrunning = false;
				break;
			default:
				System.out.println("Enter valid operation");
			}
		} 
		
		sc.close(); 
	}
}
