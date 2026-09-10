package com.logicalStatements;

import java.util.Scanner;

public class ATMWithdrawal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        
        if (balance < 0) {
            System.out.println("Enter a valid amount");
        } else {
            System.out.print("Enter withdrawal amount: ");
            double withdrawal = sc.nextDouble();
            
            if (withdrawal < 0) {
                System.out.println("Enter a valid withdrawal amount");
            } else if (withdrawal > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= withdrawal;
                System.out.println("Withdrawal successful.");
                System.out.println("Remaining balance: " + balance);
            }
        }
        
        sc.close();
    }
}
