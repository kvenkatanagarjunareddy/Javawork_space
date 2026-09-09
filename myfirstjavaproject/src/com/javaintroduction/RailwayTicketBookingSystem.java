package com.javaintroduction;

class Railway {
    String passengerName;
    int age;
    String source;
    String destination;

    // Parent Constructor
    public Railway(String passengerName, int age, String source, String destination) {
        this.passengerName = passengerName;
        this.age = age;
        this.source = source;
        this.destination = destination;
    }
}

class Ticket extends Railway {
    int numOfTickets;
    int price = 500;

    // Target Constructor: Calls the parent class using super()
    public Ticket(String passengerName, int age, String source, String destination, int numOfTickets) {
        super(passengerName, age, source, destination); // Invokes the parent constructor
        this.numOfTickets = numOfTickets;
    }

    // Chaining Constructor: Uses this() to handle default single-ticket bookings
    public Ticket(String passengerName, int age, String source, String destination) {
        this(passengerName, age, source, destination, 1); // Chains to the 5-parameter constructor
    }

    // Method to calculate total cost and print status
    public void bookTicket() {
        int totalAmount = this.numOfTickets * this.price;
        System.out.println("🎉 Booking Successful! Ticket(s) confirmed.");
        System.out.println("Total Amount Paid: ₹" + totalAmount);
    }

    // Method to display all transaction details
    public void displayBookingDetails() {
        System.out.println("\n========= TICKET DETAILS =========");
        System.out.println("Passenger Name   : " + passengerName);
        System.out.println("Age              : " + age);
        System.out.println("Route            : " + source + " ➔ " + destination);
        System.out.println("Number of Tickets: " + numOfTickets);
        System.out.println("Price per Ticket : ₹" + price);
        System.out.println("==================================");
    }
}

public class RailwayTicketBookingSystem {
    public static void main(String[] args) {
        // Example 1: Standard booking using the primary constructor
        Ticket booking1 = new Ticket("Amit Sharma", 28, "Hyderabad", "Delhi", 3);
        booking1.bookTicket();
        booking1.displayBookingDetails();

        System.out.println("\n----------------------------------");

       // Example 2: single-ticket booking using the constructor chained via this()
        Ticket booking2 = new Ticket("Priya Patel", 34, "Mumbai", "Goa");
        booking2.bookTicket();
        booking2.displayBookingDetails();
    }
}
