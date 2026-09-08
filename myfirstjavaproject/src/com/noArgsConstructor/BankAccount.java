package com.noArgsConstructor;

public class BankAccount {
	double accountNumber;
	String holderName;
	int balance;
	BankAccount() {
		accountNumber=46346737;
		holderName="Nagarjuna";
		balance=45000;
	}
	
	void display() {
		System.out.println(accountNumber);
		System.out.println(holderName);
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		BankAccount obj=new BankAccount();
		obj.display();

	}

}
