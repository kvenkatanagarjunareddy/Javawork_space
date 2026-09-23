package com.logicalStatements.forloops;

import java.util.Scanner;

public class NthPrimeNumber {

  
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Nth prime number position you want (e.g., 5 for 5th prime): ");
        int targetNthPrime = scanner.nextInt();
        
        int primeCount = 0;   
        int currentNumber = 2; 

        while (true) {
            if (isPrime(currentNumber)) {
                primeCount++;
                if (primeCount == targetNthPrime) {
                    System.out.println("The " + targetNthPrime + "th prime number is: " + currentNumber);
                    break;
                }
            }
            currentNumber++;
        }
        
        scanner.close(); 
    }
}
