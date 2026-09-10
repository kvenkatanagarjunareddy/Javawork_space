package com.logicalStatements;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the units: ");
        int unit = sc.nextInt();
        
        if (unit < 0) {
            System.out.println("Enter a valid unit");
        } else if (unit <= 100) {
            System.out.println("₹2/unit");
        } else if (unit <= 200) {
            System.out.println("₹4/unit");
        } else if (unit <= 300) {
            System.out.println("₹6/unit");
        } else {
            System.out.println("₹8/unit");
        }
        
        sc.close();
    }
}
