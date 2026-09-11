package com.logicalStatements;

import java.util.Scanner;

public class ShoppingBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount you purchased: ");
        
        double amount = sc.nextDouble();
        double discountPercent = 0;
        
        if (amount < 0) {
            System.out.println("Invalid amount");
        } else {
            if (amount < 2000) {
                discountPercent = 5;
            } else if (amount <= 4999) {
                discountPercent = 10;
            } else if (amount <= 9999) {
                discountPercent = 20;
            } else {
                discountPercent = 25;
            }
            
            double discountAmount = (discountPercent / 100) * amount;
            double finalAmount = amount - discountAmount;
            
            System.out.println("You received a " + (int)discountPercent + "% discount.");
            System.out.println("Final amount: ₹" + finalAmount);
        }
        
        sc.close();
    }
}
