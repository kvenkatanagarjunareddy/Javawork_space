package com.logicalStatements;

import java.util.Scanner;

public class FoodsOrderingSystem {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("          Welcome to My Hotel!           ");
        System.out.println("=========================================");
        
        Scanner sc = new Scanner(System.in);
        double totalBill = 0;
        String choice;
        
        do {
            System.out.println("\nMenu Card:");
            System.out.println("1 -> Pizza   - ₹200");
            System.out.println("2 -> Burger  - ₹120");
            System.out.println("3 -> Biryani - ₹180");
            System.out.println("4 -> Noodles - ₹100");
            System.out.print("Select an item (1-4): ");
            int num = sc.nextInt();
            
            switch (num) {
                case 1 -> {
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    int price = 200;
                    int amount = quantity * price;
                    totalBill += amount;
                    System.out.println("\nOrdered: Pizza | Price: ₹" + price + " | Quantity: " + quantity + " | Item Total: ₹" + amount);   
                }
                
                case 2 -> {
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    int price = 120;
                    int amount = quantity * price;
                    totalBill += amount;
                    System.out.println("\nOrdered: Burger | Price: ₹" + price + " | Quantity: " + quantity + " | Item Total: ₹" + amount);
                }
                    
                case 3 -> {
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    int price = 180;
                    int amount = quantity * price;
                    totalBill += amount;
                    System.out.println("\nOrdered: Biryani | Price: ₹" + price + " | Quantity: " + quantity + " | Item Total: ₹" + amount);
                }
                    
                case 4 -> {
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    int price = 100;
                    int amount = quantity * price;
                    totalBill += amount;
                    System.out.println("\nOrdered: Noodles | Price: ₹" + price + " | Quantity: " + quantity + " | Item Total: ₹" + amount);
                }
                    
                default -> System.out.println("⚠️ Invalid selection. Please enter a valid number (1-4).");
            }
            
            System.out.print("\nDo you want to add more items? (Y/N): ");
            choice = sc.next();
            
        } while (choice.equalsIgnoreCase("y"));
        
        System.out.println("\n=========================================");
        System.out.println("  Thank you for ordering! Total Bill: ₹" + totalBill);
        System.out.println("=========================================");
        
        sc.close(); // Closed the scanner resource
    }
}
