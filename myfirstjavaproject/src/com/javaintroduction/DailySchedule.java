package com.javaintroduction;

import java.util.Scanner;

public class DailySchedule {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the time (0-23 hours): ");
        int time = sc.nextInt();

        
        if (time < 0 || time > 23) {
            System.out.println("Invalid input! Please enter a time between 0 and 23.");
        } 
        
        else if (time == 5) { 
            System.out.println("Good morning! Waking up early.");
        } else if (time < 8) { 
            System.out.println("Time to freshen up and get ready!");
        } else if (time < 12) { 
            System.out.println("Time to go to the institute and attend classes.");
        } else if (time == 12) { 
            System.out.println("Lunch break.");
        } else if (time == 13) { 
            System.out.println("Time to revise the morning class topics.");
        } else if (time < 17) { 
            System.out.println("Time to practice coding problems.");
        } else if (time == 17) { 
            System.out.println("Heading outside for a quick chai break.");
        } else if (time < 20) { 
            System.out.println("Time to complete dinner and revise some concepts.");
        } else if (time < 22) { 
            System.out.println("Completing pending work and scheduling tasks for tomorrow.");
        } else { 
            System.out.println("I am sleeping now.");
        }

        sc.close(); 
    }
}
