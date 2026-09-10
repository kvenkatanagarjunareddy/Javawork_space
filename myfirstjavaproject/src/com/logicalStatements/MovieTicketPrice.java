package com.logicalStatements;

import java.util.Scanner;

public class MovieTicketPrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        
        if (age < 0) {
            System.out.println("Enter a valid age");
        } else if (age < 12) {
            System.out.println("The price of the ticket is ₹100");
        } else if (age <= 59) {
            System.out.println("The price of the ticket is ₹200");
        } else {
            System.out.println("The price of the ticket is ₹120");
        }
        
        sc.close();
    }
}
