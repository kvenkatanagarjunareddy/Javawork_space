package com.logicalStatements;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter BMI: ");
        double bmi = sc.nextDouble();
        
        if (bmi < 0) {
            System.out.println("Enter a valid BMI");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
        sc.close();
    }
}
