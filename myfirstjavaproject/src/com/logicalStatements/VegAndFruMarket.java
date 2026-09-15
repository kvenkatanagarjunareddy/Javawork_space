package com.logicalStatements;

import java.util.Scanner;

public class VegAndFruMarket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = 0; 
        String mainChoice;       

        System.out.println("--- Welcome to my Market ---");

        do {
            System.out.println("\nEnter the category (veg/fru): ");
            String catg = sc.nextLine().trim().toLowerCase(); 

            switch (catg) {
                case "veg" -> {
                    String vegChoice; 
                    do {
                        System.out.println("\nEnter vegetable name (tmt / carrot / potato / onion / spinach / garlic / ginger / chili): ");
                        String vegName = sc.nextLine().trim().toLowerCase();

                        // Using modern switch expressions for vegetable names
                        switch (vegName) {
                            case "tmt" -> {
                                System.out.println("Tomato added! Price: 50");
                                totalBill += 50;
                            }
                            case "carrot" -> {
                                System.out.println("Carrot added! Price: 60");
                                totalBill += 60;
                            }
                            case "potato" -> {
                                System.out.println("Potato added! Price: 40");
                                totalBill += 40;
                            }
                            case "onion" -> {
                                System.out.println("Onion added! Price: 45");
                                totalBill += 45;
                            }
                            case "spinach" -> {
                                System.out.println("Spinach added! Price: 30");
                                totalBill += 30;
                            }
                            case "garlic" -> {
                                System.out.println("Garlic added! Price: 150");
                                totalBill += 150;
                            }
                            case "ginger" -> {
                                System.out.println("Ginger added! Price: 120");
                                totalBill += 120;
                            }
                            case "chili" -> {
                                System.out.println("Green Chili added! Price: 35");
                                totalBill += 35;
                            }
                            default -> System.out.println("❌ Invalid vegetable name.");
                        }

                        System.out.println("Do you want to add more vegetables? (y/n):");
                        vegChoice = sc.nextLine().trim();
                    } while (vegChoice.equalsIgnoreCase("y"));
                }

                case "fru" -> {
                    String fruChoice; 
                    do {
                        System.out.println("\nEnter a fruit name (app / pro / mango / banana / orange / grapes / papaya / watermelon): ");
                        String fruName = sc.nextLine().trim().toLowerCase();

                        // Using modern switch expressions for fruit names
                        switch (fruName) {
                            case "app" -> {
                                System.out.println("Apple added! Price: 70");
                                totalBill += 70;
                            }
                            case "pro" -> {
                                System.out.println("Pomegranate added! Price: 90");
                                totalBill += 90;
                            }
                            case "mango" -> {
                                System.out.println("Mango added! Price: 120");
                                totalBill += 120;
                            }
                            case "banana" -> {
                                System.out.println("Banana added! Price: 40");
                                totalBill += 40;
                            }
                            case "orange" -> {
                                System.out.println("Orange added! Price: 80");
                                totalBill += 80;
                            }
                            case "grapes" -> {
                                System.out.println("Grapes added! Price: 100");
                                totalBill += 100;
                            }
                            case "papaya" -> {
                                System.out.println("Papaya added! Price: 60");
                                totalBill += 60;
                            }
                            case "watermelon" -> {
                                System.out.println("Watermelon added! Price: 50");
                                totalBill += 50;
                            }
                            default -> System.out.println("❌ Enter a valid fruit name.");
                        }

                        System.out.println("Do you want to add more fruits? (y/n):");
                        fruChoice = sc.nextLine().trim();
                    } while (fruChoice.equalsIgnoreCase("y")); 
                }

                default -> System.out.println("❌ Enter a valid category name.");
            }
            
            System.out.println("\n-------------------------------------------");
            System.out.println("Do you want to change categories or exit? \nPress 'Y' to stay in the market or 'N' to check out:");
            mainChoice = sc.nextLine().trim();

        } while (mainChoice.equalsIgnoreCase("y")); 
       
        System.out.println("\n==================================");
        System.out.println("Thank you for shopping! Your total bill is: " + totalBill + " Rupees.");
        System.out.println("==================================");
        
        sc.close();
    }
}
