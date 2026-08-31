
package com.javaintroduction;

import java.util.Scanner;

public class ATM {

    // Static variable - common for all users
    static String bankName = "Nagarjuna Bank";

    // Instance variables - separate for each account
    long accountNumber;
    double balance;

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Amount: " + amount);
    }

    // Withdrawal method
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn Amount: " + amount);
    }

    // Check balance method
    void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to " + bankName);

        // First ATM account object
        ATM obj1 = new ATM();

        System.out.println("Enter account number for first account:");
        obj1.accountNumber = sc.nextLong();

        System.out.println("Enter initial balance for first account:");
        obj1.balance = sc.nextDouble();

        System.out.println("Enter deposit amount for first account:");
        double deposit1 = sc.nextDouble();
        obj1.deposit(deposit1);

        System.out.println("Enter withdrawal amount for first account:");
        double withdraw1 = sc.nextDouble();
        obj1.withdraw(withdraw1);

        // Display first account balance
        System.out.println("\nFirst Account Details:");
        obj1.checkBalance();


        // Second ATM account object
        ATM obj2 = new ATM();

        System.out.println("Enter account number for second account:");
        obj2.accountNumber = sc.nextLong();

        System.out.println("Enter initial balance for second account:");
        obj2.balance = sc.nextDouble();

        System.out.println("Enter deposit amount for second account:");
        double deposit2 = sc.nextDouble();
        obj2.deposit(deposit2);

        System.out.println("Enter withdrawal amount for second account:");
        double withdraw2 = sc.nextDouble();
        obj2.withdraw(withdraw2);

        // Display second account balance
        System.out.println("\nSecond Account Details:");
        obj2.checkBalance();

        sc.close();
    }
}

