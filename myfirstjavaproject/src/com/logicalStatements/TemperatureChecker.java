package com.logicalStatements;

import java.util.Scanner;

public class TemperatureChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the temperature: ");
        int num = sc.nextInt();
        
        if (num >= 45) {
            System.out.println("Very Hot");
        } else if (num >= 38) {
            System.out.println("Hot");
        } else if (num >= 28) {
            System.out.println("Normal");
        } else if (num >= 20) {
            System.out.println("Cold");
        } else {
            System.out.println("Very Cold");
        }
        
        sc.close();
    }
}
