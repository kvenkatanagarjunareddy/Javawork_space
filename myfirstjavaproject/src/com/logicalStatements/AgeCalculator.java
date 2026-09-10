package com.logicalStatements;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age < 0) {
            System.out.println("Enter a valid age.");
        } else if (age > 65) {
            System.out.println("Senior Citizen");
        } else if (age >= 25) { 
            System.out.println("Adult");
        } else if (age >= 16) { 
            System.out.println("Teenager");
        } else if (age >= 10) { 
            System.out.println("Child");
        } else {                
            System.out.println("Kid");
        }
        
        sc.close(); 
    }
}
