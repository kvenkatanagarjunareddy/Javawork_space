package com.logicalStatements;

import java.util.Scanner;

public class EmployeeTaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter annual salary: ");
        double salary = sc.nextDouble();
        
        if (salary < 0) {
            System.out.println("Enter a valid salary");
        } else if (salary < 300000) {
            System.out.println("No tax");
        } else if (salary <= 600000) {
            System.out.println("You are in the 10% tax slab.");
        } else if (salary <= 1000000) {
            System.out.println("You are in the 20% tax slab.");
        } else {
            System.out.println("You are in the 30% tax slab.");
        }
        
        sc.close();
    }
}
