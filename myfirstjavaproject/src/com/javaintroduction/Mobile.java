package com.javaintroduction;

public class Mobile {
	// 1. STATIC VARIABLES (Shared by all phones)
	static String brand = "MI";
	static int Ram;

	// 2. INSTANCE VARIABLES (Unique to each phone)
	String Model;
	int Price;

	// 3. STATIC BLOCK (Runs once when the class loads)
	static {
		System.out.println("--- Mobile Management System Started ---");
		System.out.println("Default Company Brand: " + brand);
		System.out.println("----------------------------------------");
	}

	// 4. INSTANCE BLOCK (Runs every time a new object is created)
	{
		Price = 15000; // Sets a basic default price before assignment
	}

	// 5. STATIC METHOD (Handles shared static data)
	static void Mobile_RAm(int ramSize) {
		Ram = ramSize;
		System.out.println("Shared RAM config set to: " + Ram + "GB");
	}

	// 6. INSTANCE METHOD (Displays individual phone information)
	void displayMobileDetails() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + Model);
		System.out.println("RAM: " + Ram + "GB");
		System.out.println("Price: ₹" + Price);
		System.out.println("----------------------------------------");
	}

	public static void main(String[] args) {
		
		// Set the shared RAM configuration using the static method
		Mobile_RAm(8);
		System.out.println();

		// 7. OBJECT CREATION (3 Mobile Objects)

		// Object 1
		Mobile obj1 = new Mobile();
		obj1.Model = "MI 11X";
		obj1.Price = 27999;

		// Object 2
		Mobile obj2 = new Mobile();
		obj2.Model = "Redmi Note 12";
		obj2.Price = 18499;

		// Object 3
		Mobile obj3 = new Mobile();
		obj3.Model = "Xiaomi 13 Pro";
		obj3.Price = 74999;

		// Display information for all 3 objects
		System.out.println("--- DISPLAYING MOBILE DETAILS ---");
		obj1.displayMobileDetails();
		obj2.displayMobileDetails();
		obj3.displayMobileDetails();
	}
}
