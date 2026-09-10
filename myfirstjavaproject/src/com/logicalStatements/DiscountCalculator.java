package com.logicalStatements;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your purchase amount: ");
        int money = sc.nextInt();
        
        if (money < 0) {
            System.out.println("Enter a valid amount");
        } else if (money < 1000) {
            System.out.println("No discount");
        } else if (money <= 4999) {
            System.out.println("You got 10% discount");
        } else if (money <= 9999) {
            System.out.println("You got 20% discount");
        } else {
            System.out.println("You got 30% discount");
        }
        
        sc.close();
    }
}
