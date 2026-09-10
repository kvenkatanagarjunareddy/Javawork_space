package com.javaintroduction;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        
        if (marks < 0 || marks > 100) {
            System.out.println("Please enter valid marks between 0 and 100.");
        } else if (marks > 90) {
            System.out.println("Congratulations!.. you got grade (A)");
        } else if (marks > 75) {
            System.out.println("Good, you got grade (B)");
        } else if (marks > 60) {
            System.out.println("You got grade (C)");
        } else if (marks >= 40) { 
            System.out.println("You got grade (D)");
        } else {
            System.out.println("You failed! Study harder next time.");
        }

        sc.close(); 
    }
}
