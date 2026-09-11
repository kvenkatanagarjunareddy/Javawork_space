package com.logicalStatements;

import java.util.Scanner;

public class ExamResultCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        if (marks < 0 || marks > 100) {
            System.out.println("Enter valid marks");
        } else if (marks < 40) {
            System.out.println("Fail");
        } else if (marks <= 59) {
            System.out.println("Pass");
            System.out.println("Grade: C");
        } else if (marks <= 74) {
            System.out.println("Pass");
            System.out.println("Grade: B");
        } else if (marks <= 89) {
            System.out.println("Pass");
            System.out.println("Grade: A");
        } else {
            System.out.println("Pass");
            System.out.println("Grade: A+");
        }
        
        sc.close();
    }
}
		