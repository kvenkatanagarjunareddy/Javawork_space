package com.logicalStatements;

import java.util.Scanner;

public class EmployeePerformance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the performance score: ");
        int score = sc.nextInt();
        
        if (score < 0 || score > 100) {
            System.out.println("Enter a valid score");
        } else if (score < 40) {
            System.out.println("Poor");
        } else if (score <= 59) {
            System.out.println("Average");
        } else if (score <= 74) {
            System.out.println("Good");
        } else if (score <= 89) {
            System.out.println("Excellent");
        } else {
            System.out.println("Outstanding");
        }
        
        sc.close();
    }
}
