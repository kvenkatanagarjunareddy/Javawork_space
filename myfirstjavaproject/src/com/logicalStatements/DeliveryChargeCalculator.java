package com.logicalStatements;

import java.util.Scanner;

public class DeliveryChargeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter order amount: ");
        double amount = sc.nextDouble();
        
        if (amount < 0) {
            System.out.println("Entered amount is not valid");
        } else if (amount < 500) {
            System.out.println("₹100 delivery charge");
        } else if (amount <= 999) {
            System.out.println("₹50 delivery charge");
        } else {
            System.out.println("Free Delivery.");
        }
        
        sc.close();
    }
}
