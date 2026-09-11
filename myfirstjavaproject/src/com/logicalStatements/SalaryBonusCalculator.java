package com.logicalStatements;

import java.util.Scanner;

public class SalaryBonusCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();
        
        System.out.print("Enter experience: ");
        int exp = sc.nextInt();
        
        if (sal < 0 || exp < 0) {
            System.out.println("Enter valid input values");
        } else if (exp < 2) {
            System.out.println("You are eligible for a 5% bonus.");
        } else if (exp <= 5) {
            System.out.println("You are eligible for a 10% bonus.");
        } else if (exp <= 10) {
            System.out.println("You are eligible for a 15% bonus.");
        } else {
            System.out.println("You are eligible for a 20% bonus.");
        }
        
        sc.close();
    }
}
