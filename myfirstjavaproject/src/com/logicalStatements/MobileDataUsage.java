package com.logicalStatements;

import java.util.Scanner;

public class MobileDataUsage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter data used: ");
        int usage = sc.nextInt();
        
        if (usage < 0) {
            System.out.println("Enter a valid usage");
        } else if (usage <= 2) {
            System.out.println("You have used a Low amount of data.");
        } else if (usage <= 5) {
            System.out.println("You have used a Moderate amount of data.");
        } else if (usage <= 10) {
            System.out.println("You have used a Medium amount of data.");
        } else {
            System.out.println("You have used a High amount of data.");
        }

        sc.close();
    }
}
