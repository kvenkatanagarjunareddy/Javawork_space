package com.javaintroduction;

public class ZoomCarRental {
    
    int days = 3;
    
    static String getCompanyname() {
        return "ZoomCar Rentals";
    }
 
    int getDisplayRate() {
        return 1500;
    }
    
    int calculateBaseRentalCost() {
        return getDisplayRate() * days; 
    }

    
    int getInsuranceFee() {
        return 500;
    }

    double calculateTotalCost(double baseCost, double insuranceFee) {
        return baseCost + insuranceFee;
    }

    String getWelcomeMessage(String customerName) {
        return customerName;  
    }

    public static void main(String[] args) {
        ZoomCarRental obj = new ZoomCarRental();
        
        System.out.println("Welcome to ZoomCar Rentals, " + obj.getWelcomeMessage("Nagarjuna") + "! Enjoy your ride.");
        System.out.println("Company name: " + getCompanyname());
        System.out.println("Original rate per day: " + obj.getDisplayRate());
        System.out.println("Total rental rate: " + obj.calculateBaseRentalCost());
        System.out.println("Insurance fee: " + obj.getInsuranceFee());
        
        double final_cost = obj.calculateTotalCost(obj.calculateBaseRentalCost(), obj.getInsuranceFee());
        System.out.println("Total cost of the rent is: " + final_cost);
    }
}
