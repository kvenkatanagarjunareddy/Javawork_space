package com.poc.switchstatement;

import java.util.Scanner;

public class KPHB_PG_Finder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        do {

            System.out.println("\n=================================");
            System.out.println("   KPHB PG FINDER MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Co-Living PGs");
            System.out.println("2. Girls PGs");
            System.out.println("3. Boys PGs");
            System.out.println("4. Exit");
            System.out.print("Enter a number you want: ");

            num = sc.nextInt();

            switch (num) {

            // =========================================================
            // CO-LIVING
            // =========================================================

            case 1 -> {

                System.out.println("\n========== CO-LIVING PGs ==========");
                System.out.println("1. Zolo Styx");
                System.out.println("2. Stayinn Co Living & PG Hostel");
                System.out.println("3. Sky In Co Living & PG");
                System.out.println("4. HelloWorld Falak");
                System.out.println("5. AVR Co-Living PG");
                System.out.println("6. Madineni Co-Living");
                System.out.println("7. HelloWorld Firdaus");
                System.out.println("8. Zolo Sierra");
                System.out.println("9. Back");

                System.out.print("Enter number to select PG: ");
                int pg = sc.nextInt();

                switch (pg) {

                case 1 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println("       ZOLO STYX");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : Zolo Styx");
                            System.out.println("Type         : Co-Living / Unisex");
                            System.out.println("Area         : KPHB Phase 1");
                            System.out.println("Road         : Road No. 1");
                            System.out.println("Address      : Plot No. 434 MIG-1, 1&2, Road Number 1,");
                            System.out.println("               Kukatpally Housing Board Colony,");
                            System.out.println("               Hyderabad, Telangana - 500072");
                            System.out.println("Rent         : Starts at ₹8,333");
                            System.out.println("Room Options : Private Room, 2 Sharing");
                            System.out.println("Food         : Not Available");
                            System.out.println("Facilities   : Parking, Refrigerator, Power Backup,");
                            System.out.println("               Almirah, CCTV, Housekeeping, AC, Wi-Fi, Lift");
                        }

                        case 2 -> {
                            System.out.println("\n------- ROOM SHARING -------");
                            System.out.println("1. Single Sharing");
                            System.out.println("2. 2 Sharing");
                            System.out.println("3. 3 Sharing");
                            System.out.println("4. 4 Sharing");
                            System.out.println("5. 5 Sharing");
                            System.out.println("6. 6 Sharing");
                            System.out.println("7. Back");

                            System.out.print("Select room sharing: ");
                            int room = sc.nextInt();

                            switch (room) {
                            case 1 -> System.out.println("Single Sharing selected");
                            case 2 -> System.out.println("2 Sharing selected");
                            case 3 -> System.out.println("3 Sharing selected");
                            case 4 -> System.out.println("4 Sharing selected");
                            case 5 -> System.out.println("5 Sharing selected");
                            case 6 -> System.out.println("6 Sharing selected");
                            case 7 -> System.out.println("Back");
                            default -> System.out.println("Invalid room choice");
                            }
                        }

                        case 3 -> {
                            System.out.println("\n---------- FOOD MENU ----------");
                            System.out.println("Food is NOT AVAILABLE in Zolo Styx.");
                        }

                        case 4 -> {
                            System.out.println("\n---------- FACILITIES ----------");
                            System.out.println("Parking");
                            System.out.println("Refrigerator");
                            System.out.println("Power Backup");
                            System.out.println("Almirah");
                            System.out.println("CCTV");
                            System.out.println("Housekeeping");
                            System.out.println("AC");
                            System.out.println("Wi-Fi");
                            System.out.println("Lift");
                        }

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");

                        }

                    } while (option != 5);
                }

                case 2 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println("   STAYINN CO LIVING & PG HOSTEL");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : Stayinn Co Living & PG Hostel");
                            System.out.println("Type         : Co-Living / Unisex");
                            System.out.println("Area         : Addagutta Society");
                            System.out.println("Road         : Road No. 7");
                            System.out.println("Address      : Road No. 7, Addagutta Society,");
                            System.out.println("               JNTU Road, Kukatpally,");
                            System.out.println("               Hyderabad, Telangana - 500072");
                            System.out.println("Rent         : ₹7,500 - ₹9,000");
                            System.out.println("Room Options : 2, 3, 4, 5, 6 Sharing");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Wi-Fi, Parking, Power Backup,");
                            System.out.println("               CCTV, Housekeeping, Water, Laundry");
                        }

                        case 2 -> {
                            System.out.println("\n------- ROOM SHARING -------");
                            System.out.println("1. Single Sharing");
                            System.out.println("2. 2 Sharing");
                            System.out.println("3. 3 Sharing");
                            System.out.println("4. 4 Sharing");
                            System.out.println("5. 5 Sharing");
                            System.out.println("6. 6 Sharing");
                            System.out.println("7. Back");

                            System.out.print("Select room sharing: ");
                            int room = sc.nextInt();

                            switch (room) {
                            case 1 -> System.out.println("Single Sharing selected");
                            case 2 -> System.out.println("2 Sharing selected");
                            case 3 -> System.out.println("3 Sharing selected");
                            case 4 -> System.out.println("4 Sharing selected");
                            case 5 -> System.out.println("5 Sharing selected");
                            case 6 -> System.out.println("6 Sharing selected");
                            case 7 -> System.out.println("Back");
                            default -> System.out.println("Invalid room choice");
                            }
                        }

                        case 3 -> {
                            System.out.println("\n---------- FOOD MENU ----------");
                            System.out.println("Breakfast : Check Availability");
                            System.out.println("Lunch     : Check Availability");
                            System.out.println("Dinner    : Check Availability");
                        }

                        case 4 -> {
                            System.out.println("\n---------- FACILITIES ----------");
                            System.out.println("Wi-Fi");
                            System.out.println("Parking");
                            System.out.println("Power Backup");
                            System.out.println("CCTV");
                            System.out.println("Housekeeping");
                            System.out.println("Water");
                            System.out.println("Laundry");
                        }

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 3 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println("      SKY IN CO LIVING & PG");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : Sky In Co Living & PG");
                            System.out.println("Type         : Co-Living / Unisex");
                            System.out.println("Area         : HMT Sathavahana Nagar");
                            System.out.println("Road         : HMT Sathavahana Nagar");
                            System.out.println("Address      : HMT Sathavahana Nagar,");
                            System.out.println("               Kukatpally, Hyderabad,");
                            System.out.println("               Telangana - 500072");
                            System.out.println("Rent         : ₹7,000 - ₹8,500");
                            System.out.println("Room Options : 2, 3, 4, 5, 6 Sharing");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Wi-Fi, Parking, CCTV, Power Backup,");
                            System.out.println("               Housekeeping, Water, Laundry");
                        }

                        case 2 -> {

                            System.out.println("\n------- ROOM SHARING -------");
                            System.out.println("1. Single Sharing");
                            System.out.println("2. 2 Sharing");
                            System.out.println("3. 3 Sharing");
                            System.out.println("4. 4 Sharing");
                            System.out.println("5. 5 Sharing");
                            System.out.println("6. 6 Sharing");
                            System.out.println("7. Back");

                            System.out.print("Select room sharing: ");
                            int room = sc.nextInt();

                            switch (room) {
                            case 1 -> System.out.println("Single Sharing selected");
                            case 2 -> System.out.println("2 Sharing selected");
                            case 3 -> System.out.println("3 Sharing selected");
                            case 4 -> System.out.println("4 Sharing selected");
                            case 5 -> System.out.println("5 Sharing selected");
                            case 6 -> System.out.println("6 Sharing selected");
                            case 7 -> System.out.println("Back");
                            default -> System.out.println("Invalid room choice");
                            }
                        }

                        case 3 -> {
                            System.out.println("\n---------- FOOD MENU ----------");
                            System.out.println("Breakfast : Check Availability");
                            System.out.println("Lunch     : Check Availability");
                            System.out.println("Dinner    : Check Availability");
                        }

                        case 4 -> {
                            System.out.println("\n---------- FACILITIES ----------");
                            System.out.println("Wi-Fi");
                            System.out.println("Parking");
                            System.out.println("CCTV");
                            System.out.println("Power Backup");
                            System.out.println("Housekeeping");
                            System.out.println("Water");
                            System.out.println("Laundry");
                        }

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 4 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println("       HELLOWORLD FALAK");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : HelloWorld Falak");
                            System.out.println("Type         : Co-Living / Unisex");
                            System.out.println("Area         : KPHB / Kukatpally");
                            System.out.println("Road         : Gokul Plots");
                            System.out.println("Address      : Sri Sai Lakshmi Plaza, Plot No. 1758,");
                            System.out.println("               Gokul Plots, Venkataramana Colony,");
                            System.out.println("               KPHB, Kukatpally, Hyderabad - 500085");
                            System.out.println("Rent         : Starts at ₹7,000");
                            System.out.println("Room Options : Classic, Comfort");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Washing Machine, Refrigerator,");
                            System.out.println("               RO Drinking Water, Microwave,");
                            System.out.println("               Dining Area, Lift, Power Backup");
                        }

                        case 2 -> {

                            System.out.println("\n------- ROOM SHARING -------");
                            System.out.println("1. Single Sharing");
                            System.out.println("2. 2 Sharing");
                            System.out.println("3. 3 Sharing");
                            System.out.println("4. 4 Sharing");
                            System.out.println("5. 5 Sharing");
                            System.out.println("6. 6 Sharing");
                            System.out.println("7. Back");

                            System.out.print("Select room sharing: ");
                            int room = sc.nextInt();

                            switch (room) {
                            case 1 -> System.out.println("Single Sharing selected");
                            case 2 -> System.out.println("2 Sharing selected");
                            case 3 -> System.out.println("3 Sharing selected");
                            case 4 -> System.out.println("4 Sharing selected");
                            case 5 -> System.out.println("5 Sharing selected");
                            case 6 -> System.out.println("6 Sharing selected");
                            case 7 -> System.out.println("Back");
                            default -> System.out.println("Invalid room choice");
                            }
                        }

                        case 3 -> {
                            System.out.println("\n---------- FOOD MENU ----------");
                            System.out.println("Breakfast : Check Availability");
                            System.out.println("Lunch     : Check Availability");
                            System.out.println("Dinner    : Check Availability");
                        }

                        case 4 -> {
                            System.out.println("\n---------- FACILITIES ----------");
                            System.out.println("Washing Machine");
                            System.out.println("Refrigerator");
                            System.out.println("RO Drinking Water");
                            System.out.println("Microwave");
                            System.out.println("Dining Area");
                            System.out.println("Lift");
                            System.out.println("Power Backup");
                        }

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 5 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println("        AVR CO-LIVING PG");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : AVR (Venkatadri) Co-Living PG");
                            System.out.println("Type         : Co-Living / Unisex");
                            System.out.println("Area         : Addagutta Society / KPHB");
                            System.out.println("Road         : Road No. 9 / HMT Hills Road");
                            System.out.println("Address      : Plot No. 210/A, Road Number 9,");
                            System.out.println("               HMT Hills Road, Opposite JNTU,");
                            System.out.println("               Addagutta Society, Western Hills,");
                            System.out.println("               KPHB, Kukatpally, Hyderabad - 500085");
                            System.out.println("Rent         : ₹7,500 - ₹9,000");
                            System.out.println("Room Options : 2, 3, 4, 5, 6 Sharing");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Wi-Fi, Parking, CCTV, Power Backup,");
                            System.out.println("               Housekeeping, Water, Laundry");
                        }

                        case 2 -> {
                            System.out.println("\n------- ROOM SHARING -------");
                            System.out.println("1. Single Sharing");
                            System.out.println("2. 2 Sharing");
                            System.out.println("3. 3 Sharing");
                            System.out.println("4. 4 Sharing");
                            System.out.println("5. 5 Sharing");
                            System.out.println("6. 6 Sharing");
                            System.out.println("7. Back");

                            System.out.print("Select room sharing: ");
                            int room = sc.nextInt();

                            switch (room) {
                            case 1 -> System.out.println("Single Sharing selected");
                            case 2 -> System.out.println("2 Sharing selected");
                            case 3 -> System.out.println("3 Sharing selected");
                            case 4 -> System.out.println("4 Sharing selected");
                            case 5 -> System.out.println("5 Sharing selected");
                            case 6 -> System.out.println("6 Sharing selected");
                            case 7 -> System.out.println("Back");
                            default -> System.out.println("Invalid room choice");
                            }
                        }

                        case 3 -> {
                            System.out.println("\n---------- FOOD MENU ----------");
                            System.out.println("Breakfast : Check Availability");
                            System.out.println("Lunch     : Check Availability");
                            System.out.println("Dinner    : Check Availability");
                        }

                        case 4 -> {
                            System.out.println("\n---------- FACILITIES ----------");
                            System.out.println("Wi-Fi");
                            System.out.println("Parking");
                            System.out.println("CCTV");
                            System.out.println("Power Backup");
                            System.out.println("Housekeeping");
                            System.out.println("Water");
                            System.out.println("Laundry");
                        }

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 6 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println("       MADINENI CO-LIVING");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : Madineni Co-Living");
                            System.out.println("Type         : Co-Living / Unisex");
                            System.out.println("Area         : Addagutta Society");
                            System.out.println("Road         : Street No. 8");
                            System.out.println("Address      : 238 C, Street Number 8,");
                            System.out.println("               Addagutta Society, Western Hills,");
                            System.out.println("               Jal Vayu Vihar, Kukatpally,");
                            System.out.println("               Hyderabad - 500085");
                            System.out.println("Rent         : ₹8,000 - ₹10,000");
                            System.out.println("Room Options : 2, 3, 4, 5, 6 Sharing");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Wi-Fi, Parking, CCTV, Power Backup,");
                            System.out.println("               Housekeeping, Water, Laundry");
                        }

                        case 2 -> {

                            System.out.println("\n------- ROOM SHARING -------");
                            System.out.println("1. Single Sharing");
                            System.out.println("2. 2 Sharing");
                            System.out.println("3. 3 Sharing");
                            System.out.println("4. 4 Sharing");
                            System.out.println("5. 5 Sharing");
                            System.out.println("6. 6 Sharing");
                            System.out.println("7. Back");

                            System.out.print("Select room sharing: ");
                            int room = sc.nextInt();

                            switch (room) {
                            case 1 -> System.out.println("Single Sharing selected");
                            case 2 -> System.out.println("2 Sharing selected");
                            case 3 -> System.out.println("3 Sharing selected");
                            case 4 -> System.out.println("4 Sharing selected");
                            case 5 -> System.out.println("5 Sharing selected");
                            case 6 -> System.out.println("6 Sharing selected");
                            case 7 -> System.out.println("Back");
                            default -> System.out.println("Invalid room choice");
                            }
                        }

                        case 3 -> {
                            System.out.println("\n---------- FOOD MENU ----------");
                            System.out.println("Breakfast : Check Availability");
                            System.out.println("Lunch     : Check Availability");
                            System.out.println("Dinner    : Check Availability");
                        }

                        case 4 -> {
                            System.out.println("\n---------- FACILITIES ----------");
                            System.out.println("Wi-Fi");
                            System.out.println("Parking");
                            System.out.println("CCTV");
                            System.out.println("Power Backup");
                            System.out.println("Housekeeping");
                            System.out.println("Water");
                            System.out.println("Laundry");
                        }

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 7 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println("       HELLOWORLD FIRDAUS");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : HelloWorld Firdaus");
                            System.out.println("Type         : Co-Living / Unisex");
                            System.out.println("Area         : KPHB Border");
                            System.out.println("Road         : Gokul Plots");
                            System.out.println("Address      : Gokul Plots, KPHB Border,");
                            System.out.println("               Kukatpally, Hyderabad, Telangana");
                            System.out.println("Rent         : Starts at ₹7,500");
                            System.out.println("Room Options : Classic, Comfort");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Wi-Fi, Refrigerator, Washing Machine,");
                            System.out.println("               RO Water, Power Backup, Dining Area,");
                            System.out.println("               Lift, Housekeeping");
                        }

                        case 2 -> {

                            System.out.println("\n------- ROOM SHARING -------");
                            System.out.println("1. Single Sharing");
                            System.out.println("2. 2 Sharing");
                            System.out.println("3. 3 Sharing");
                            System.out.println("4. 4 Sharing");
                            System.out.println("5. 5 Sharing");
                            System.out.println("6. 6 Sharing");
                            System.out.println("7. Back");

                            System.out.print("Select room sharing: ");
                            int room = sc.nextInt();

                            switch (room) {
                            case 1 -> System.out.println("Single Sharing selected");
                            case 2 -> System.out.println("2 Sharing selected");
                            case 3 -> System.out.println("3 Sharing selected");
                            case 4 -> System.out.println("4 Sharing selected");
                            case 5 -> System.out.println("5 Sharing selected");
                            case 6 -> System.out.println("6 Sharing selected");
                            case 7 -> System.out.println("Back");
                            default -> System.out.println("Invalid room choice");
                            }
                        }

                        case 3 -> {
                            System.out.println("\n---------- FOOD MENU ----------");
                            System.out.println("Breakfast : Check Availability");
                            System.out.println("Lunch     : Check Availability");
                            System.out.println("Dinner    : Check Availability");
                        }

                        case 4 -> {
                            System.out.println("\n---------- FACILITIES ----------");
                            System.out.println("Wi-Fi");
                            System.out.println("Refrigerator");
                            System.out.println("Washing Machine");
                            System.out.println("RO Water");
                            System.out.println("Power Backup");
                            System.out.println("Dining Area");
                            System.out.println("Lift");
                            System.out.println("Housekeeping");
                        }

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 8 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println("          ZOLO SIERRA");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : Zolo Sierra");
                            System.out.println("Type         : Co-Living / Unisex");
                            System.out.println("Area         : KPHB");
                            System.out.println("Road         : 6th Phase Road");
                            System.out.println("Address      : KPHB 6th Phase Road,");
                            System.out.println("               Kukatpally Housing Board Colony,");
                            System.out.println("               Kukatpally, Hyderabad - 500072");
                            System.out.println("Rent         : Starts at ₹5,999");
                            System.out.println("Room Options : 2 Sharing, 3 Sharing");
                            System.out.println("Food         : Not Available");
                            System.out.println("Facilities   : Parking, TV, Refrigerator, Power Backup,");
                            System.out.println("               Almirah, Bed Sheet, CCTV, Housekeeping,");
                            System.out.println("               AC, Wi-Fi, Lift, Drinking Water");
                        }

                        case 2 -> {

                            System.out.println("\n------- ROOM SHARING -------");
                            System.out.println("1. Single Sharing");
                            System.out.println("2. 2 Sharing");
                            System.out.println("3. 3 Sharing");
                            System.out.println("4. 4 Sharing");
                            System.out.println("5. 5 Sharing");
                            System.out.println("6. 6 Sharing");
                            System.out.println("7. Back");

                            System.out.print("Select room sharing: ");
                            int room = sc.nextInt();

                            switch (room) {
                            case 1 -> System.out.println("Single Sharing selected");
                            case 2 -> System.out.println("2 Sharing selected");
                            case 3 -> System.out.println("3 Sharing selected");
                            case 4 -> System.out.println("4 Sharing selected");
                            case 5 -> System.out.println("5 Sharing selected");
                            case 6 -> System.out.println("6 Sharing selected");
                            case 7 -> System.out.println("Back");
                            default -> System.out.println("Invalid room choice");
                            }
                        }

                        case 3 -> {
                            System.out.println("\n---------- FOOD MENU ----------");
                            System.out.println("Food is NOT AVAILABLE in Zolo Sierra.");
                        }

                        case 4 -> {
                            System.out.println("\n---------- FACILITIES ----------");
                            System.out.println("Parking");
                            System.out.println("TV");
                            System.out.println("Refrigerator");
                            System.out.println("Power Backup");
                            System.out.println("Almirah");
                            System.out.println("Bed Sheet");
                            System.out.println("CCTV");
                            System.out.println("Housekeeping");
                            System.out.println("AC");
                            System.out.println("Wi-Fi");
                            System.out.println("Lift");
                            System.out.println("Drinking Water");
                        }

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 9 -> System.out.println("Back to Main Menu");

                default -> System.out.println("Invalid PG choice");
                }
            }

            // =========================================================
            // GIRLS
            // =========================================================

            case 2 -> {

                System.out.println("\n========== GIRLS PGs ==========");
                System.out.println("1. Manikanta's Liv Space Luxury Women's Hostel");
                System.out.println("2. Tirumala Women's PG & Hostel");
                System.out.println("3. Amma Women's PG & Hostel");
                System.out.println("4. Sailaja Women's PG Hostel");
                System.out.println("5. Sri Vigneshwara Luxury PG for Women");
                System.out.println("6. Sri Sindhu Womens PG & Hostel");
                System.out.println("7. Flora Luxury Women's PG");
                System.out.println("8. Back");

                System.out.print("Enter number to select PG: ");
                int pg = sc.nextInt();

                switch (pg) {

                case 1 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println(" MANIKANTA'S LIV SPACE");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : Manikanta's Liv Space Luxury Women's Hostel");
                            System.out.println("Type         : Girls Only");
                            System.out.println("Area         : KPHB Phase 1");
                            System.out.println("Road         : Road No. 1");
                            System.out.println("Address      : 60, Road Number 1,");
                            System.out.println("               Kukatpally Housing Board Colony,");
                            System.out.println("               KPHB Phase 1, Kukatpally,");
                            System.out.println("               Hyderabad, Telangana - 500072");
                            System.out.println("Rent         : ₹7,500 - ₹9,500");
                            System.out.println("Room Options : Check Availability");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Check Availability");
                        }

                        case 2 -> roomMenu(sc);

                        case 3 -> foodMenu();

                        case 4 -> facilitiesMenu();

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 2 -> {

                    int option;

                    do {
                        System.out.println("\n================================");
                        System.out.println("       TIRUMALA WOMEN'S PG");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : Tirumala Women's PG & Hostel");
                            System.out.println("Type         : Girls Only");
                            System.out.println("Area         : Addagutta Society");
                            System.out.println("Road         : Street No. 2");
                            System.out.println("Address      : Plot No. 2-22-311/8A,");
                            System.out.println("               Sri Krishna Residency, Street No. 2,");
                            System.out.println("               Opposite JNTU Road,");
                            System.out.println("               Addagutta Society, Kukatpally,");
                            System.out.println("               Hyderabad, Telangana - 500085");
                            System.out.println("Rent         : ₹6,500 - ₹8,500");
                            System.out.println("Room Options : Check Availability");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Check Availability");
                        }

                        case 2 -> roomMenu(sc);
                        case 3 -> foodMenu();
                        case 4 -> facilitiesMenu();
                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 3, 4, 5, 6, 7 -> {

                    int option;

                    do {

                        System.out.println("\n================================");
                        System.out.println("          GIRLS PG");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\nPG details are available from the selected PG.");
                            System.out.println("Room Options : Check Availability");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Check Availability");
                        }

                        case 2 -> roomMenu(sc);
                        case 3 -> foodMenu();
                        case 4 -> facilitiesMenu();
                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 8 -> System.out.println("Back to Main Menu");

                default -> System.out.println("Invalid PG choice");
                }
            }

            // =========================================================
            // BOYS
            // =========================================================

            case 3 -> {

                System.out.println("\n========== BOYS PGs ==========");
                System.out.println("1. Arunachaleshwara Boys Hostel & PG");
                System.out.println("2. TLR Deluxe Boys Hostel");
                System.out.println("3. AMMA Mens PG");
                System.out.println("4. Comfort Hub Luxury Men's PG");
                System.out.println("5. Kings Luxury Men's PG");
                System.out.println("6. RK Men's PG Accommodation");
                System.out.println("7. Back");

                System.out.print("Enter number to select PG: ");
                int pg = sc.nextInt();

                switch (pg) {

                case 1 -> {

                    int option;

                    do {

                        System.out.println("\n================================");
                        System.out.println("   ARUNACHALESWARA BOYS HOSTEL");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : Arunachaleshwara Boys Hostel & PG");
                            System.out.println("Type         : Boys Only");
                            System.out.println("Area         : KPHB");
                            System.out.println("Road         : Sai Nagar");
                            System.out.println("Address      : H.No.16-2-153/141B, Sai Nagar,");
                            System.out.println("               Kukatpally Housing Board Colony,");
                            System.out.println("               Kukatpally, Hyderabad,");
                            System.out.println("               Telangana - 500085");
                            System.out.println("Rent         : ₹7,000 - ₹8,500");
                            System.out.println("Room Options : Check Availability");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Check Availability");
                        }

                        case 2 -> roomMenu(sc);
                        case 3 -> foodMenu();
                        case 4 -> facilitiesMenu();
                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 2 -> {

                    int option;

                    do {

                        System.out.println("\n================================");
                        System.out.println("       TLR DELUXE BOYS HOSTEL");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\n---------- PG DETAILS ----------");
                            System.out.println("Name         : TLR Deluxe Boys Hostel");
                            System.out.println("Type         : Boys Only");
                            System.out.println("Area         : KPHB");
                            System.out.println("Road         : 6th Lane");
                            System.out.println("Address      : H No. 537, K.P.H.B 6th Lane,");
                            System.out.println("               Near Forum Mall,");
                            System.out.println("               Kukatpally, Hyderabad,");
                            System.out.println("               Telangana - 500072");
                            System.out.println("Rent         : ₹6,500 - ₹8,000");
                            System.out.println("Room Options : 2 Sharing, 3 Sharing, 4 Sharing");
                            System.out.println("Food         : Available");
                            System.out.println("Facilities   : Attached Toilet, Hot Water, TV,");
                            System.out.println("               Wardrobe, Washing Machine, Cots,");
                            System.out.println("               Mattress, Pillows, Safety Lockers,");
                            System.out.println("               Power Backup, Electricity, Wi-Fi");
                        }

                        case 2 -> roomMenu(sc);

                        case 3 -> {
                            System.out.println("\n---------- FOOD MENU ----------");
                            System.out.println("Breakfast : Available");
                            System.out.println("Lunch     : Available");
                            System.out.println("Dinner    : Available");
                        }

                        case 4 -> {
                            System.out.println("\n---------- FACILITIES ----------");
                            System.out.println("Attached Toilet");
                            System.out.println("Hot Water");
                            System.out.println("TV");
                            System.out.println("Wardrobe");
                            System.out.println("Washing Machine");
                            System.out.println("Cots");
                            System.out.println("Mattress");
                            System.out.println("Pillows");
                            System.out.println("Safety Lockers");
                            System.out.println("Power Backup");
                            System.out.println("Electricity");
                            System.out.println("Wi-Fi");
                        }

                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 3, 4, 5, 6 -> {

                    int option;

                    do {

                        System.out.println("\n================================");
                        System.out.println("           BOYS PG");
                        System.out.println("================================");
                        System.out.println("1. View PG Details");
                        System.out.println("2. Select Room Sharing");
                        System.out.println("3. View Food Menu");
                        System.out.println("4. View Facilities");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");

                        option = sc.nextInt();

                        switch (option) {

                        case 1 -> {
                            System.out.println("\nPG details are available from the selected PG.");
                            System.out.println("Room Options : Check Availability");
                            System.out.println("Food         : Check Availability");
                            System.out.println("Facilities   : Check Availability");
                        }

                        case 2 -> roomMenu(sc);
                        case 3 -> foodMenu();
                        case 4 -> facilitiesMenu();
                        case 5 -> System.out.println("Back to PG menu");

                        default -> System.out.println("Invalid option");
                        }

                    } while (option != 5);
                }

                case 7 -> System.out.println("Back to Main Menu");

                default -> System.out.println("Invalid PG choice");
                }
            }

            case 4 -> System.out.println("\nThank you for using KPHB PG Finder!");

            default -> System.out.println("\nInvalid main menu choice.");

            }

        } while (num != 4);

        sc.close();
    }


    // =========================================================
    // ROOM SHARING METHOD
    // =========================================================

    public static void roomMenu(Scanner sc) {

        System.out.println("\n------- ROOM SHARING -------");
        System.out.println("1. Single Sharing");
        System.out.println("2. 2 Sharing");
        System.out.println("3. 3 Sharing");
        System.out.println("4. 4 Sharing");
        System.out.println("5. 5 Sharing");
        System.out.println("6. 6 Sharing");
        System.out.println("7. Back");

        System.out.print("Select room sharing: ");
        int room = sc.nextInt();

        switch (room) {

        case 1 -> System.out.println("Single Sharing selected");
        case 2 -> System.out.println("2 Sharing selected");
        case 3 -> System.out.println("3 Sharing selected");
        case 4 -> System.out.println("4 Sharing selected");
        case 5 -> System.out.println("5 Sharing selected");
        case 6 -> System.out.println("6 Sharing selected");
        case 7 -> System.out.println("Back");

        default -> System.out.println("Invalid room choice");

        }
    }


    // =========================================================
    // FOOD MENU
    // =========================================================

    public static void foodMenu() {

        System.out.println("\n---------- FOOD MENU ----------");
        System.out.println("1. Breakfast");
        System.out.println("2. Lunch");
        System.out.println("3. Dinner");
        System.out.println("4. Full Day");
        System.out.println("5. No Food");

        System.out.println("\nFood pricing for POC:");
        System.out.println("Breakfast : ₹50/day");
        System.out.println("Lunch     : ₹80/day");
        System.out.println("Dinner    : ₹80/day");
        System.out.println("Full Day  : ₹210/day");
        System.out.println("No Food   : ₹0/day");
    }


    // =========================================================
    // FACILITIES
    // =========================================================

    public static void facilitiesMenu() {

        System.out.println("\n---------- FACILITIES ----------");
        System.out.println("1. Wi-Fi");
        System.out.println("2. Laundry");
        System.out.println("3. AC");
        System.out.println("4. Parking");
        System.out.println("5. Housekeeping");
        System.out.println("6. No Facility");

        System.out.println("\nPOC Monthly Charges:");
        System.out.println("Wi-Fi        : ₹300/month");
        System.out.println("Laundry      : ₹500/month");
        System.out.println("AC           : ₹1,000/month");
        System.out.println("Parking      : ₹300/month");
        System.out.println("Housekeeping : ₹500/month");
        System.out.println("No Facility  : ₹0/month");
    }
}