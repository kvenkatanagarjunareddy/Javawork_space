package com.logicalStatements;

import java.util.Scanner;

public class WaterBillCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter water usage: ");
        int usage = sc.nextInt();
        
        if (usage < 0) {
            System.out.println("Enter a valid usage value");
        } else if (usage <= 100) {
            System.out.println("You are in the Low Usage category.");
        } else if (usage <= 200) {
            System.out.println("You are in the Medium Usage category.");
        } else if (usage <= 300) {
            System.out.println("You are in the High Usage category.");
        } else {
            System.out.println("You are in the Very High Usage category.");
        }
        
        sc.close();
    }
}
