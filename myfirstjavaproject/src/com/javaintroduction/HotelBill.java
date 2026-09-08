package com.javaintroduction;

import java.util.Scanner;

public class HotelBill {
    
    double roomCost;
    double finalBill;
    String roomType;
    int numOfDays;
    double roomPrice;
    double foodCharges;
    
    // No-argument constructor
    HotelBill() {
        this("Unknown");
    }
    
    // 1-argument constructor
    HotelBill(String roomType) {
        this(roomType, 0);
    }
    
    // 2-argument constructor
    HotelBill(String roomType, int numOfDays) {
        this(roomType, numOfDays, 0.0);
    }
    
    // 3-argument constructor
    HotelBill(String roomType, int numOfDays, double roomPrice) {
        this(roomType, numOfDays, roomPrice, 0.0);
    }
    
    // 4-argument constructor (Master constructor)
    HotelBill(String roomType, int numOfDays, double roomPrice, double foodCharges) {
        this.roomType = roomType;
        this.numOfDays = numOfDays;
        this.roomPrice = roomPrice;
        this.foodCharges = foodCharges;
        
        
        this.roomCost = this.numOfDays * this.roomPrice;
        this.finalBill = this.roomCost + this.foodCharges;
        
       
        System.out.println("\n----- Hotel Bill -----");
        System.out.println("Room Type      : " + this.roomType);
        System.out.println("Room Price     : " + this.roomPrice);
        System.out.println("Number of Days : " + this.numOfDays);
        System.out.println("Room Cost      : " + this.roomCost);
        System.out.println("Food Charges   : " + this.foodCharges);
        System.out.println("Final Bill     : " + this.finalBill);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Room Type: ");
        String inputRoomType = sc.next();
        
        System.out.print("Enter Number of Days: ");
        int inputDays = sc.nextInt();
        
        System.out.print("Enter Room Price: ");
        double inputPrice = sc.nextDouble();
        
        System.out.print("Enter Food Charges: ");
        double inputFood = sc.nextDouble();
        
      
        HotelBill bill = new HotelBill(inputRoomType, inputDays, inputPrice, inputFood);
        
        sc.close(); 
}
}
