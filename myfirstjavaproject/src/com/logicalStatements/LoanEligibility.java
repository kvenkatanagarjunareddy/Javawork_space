package com.logicalStatements;

import java.util.Scanner;

public class LoanEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();
        
        if (age < 0 || salary < 0) {
            System.out.println("Enter valid input values");
        } else if (age < 21 || salary < 25000) {
            System.out.println("Not eligible");
        } else {
            System.out.println("You are eligible for the loan.");
        }
        
        sc.close();
    }
}
