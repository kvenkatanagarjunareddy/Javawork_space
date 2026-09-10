package com.logicalStatements;

import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        if (num == 0) {
            System.out.println("Zero");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
        
        sc.close(); 
    }
}
