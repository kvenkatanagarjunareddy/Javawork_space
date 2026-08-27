package com.javaintroduction;

import java.util.Scanner;

public class Bank {

    double balance = 50000;

    public static void main(String[] args) {

        System.out.println("Welcome to Nagarjuna Bank");

        Bank bank = new Bank();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the deposit amount:");
        double depositAmount = scanner.nextDouble();

        bank.deposit(depositAmount);

        System.out.println("Enter the withdrawal amount:");
        double withdrawalAmount = scanner.nextDouble();

        bank.withdraw(withdrawalAmount);

        scanner.close();
    }

    void deposit(double depositAmount) {

        balance += depositAmount;

        System.out.println("Total amount is:");
        display();
    }

    void withdraw(double withdrawalAmount) {

        balance -= withdrawalAmount;

        System.out.println("After withdrawal, amount is:");
        display();
    }

    void display() {

        System.out.println(balance);
        System.out.println("Thank you!!");
    }
}