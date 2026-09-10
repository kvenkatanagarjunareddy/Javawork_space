package com.logicalStatements;

import java.util.Scanner;

public class DrivingLicense {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age < 0) {
            System.out.println("Enter a valid age");
        } else if (age < 18) {
            System.out.println("Not Eligible");
        } else {
            System.out.println("Eligible");
        }
        
        sc.close();
    }
}
