package com.logicalStatements;

import java.util.Scanner;

public class TrafficFineCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter vehicle speed: ");
        int speed = sc.nextInt();
        
        if (speed < 0) {
            System.out.println("Enter a valid speed");
        } else if (speed < 60) {
            System.out.println("No fine");
        } else if (speed <= 79) {
            System.out.println("You have to pay a fine of ₹500.");
        } else if (speed <= 99) {
            System.out.println("You have to pay a fine of ₹1000.");
        } else {
            System.out.println("You have to pay a fine of ₹2000.");
        }

        sc.close();
    }
}
