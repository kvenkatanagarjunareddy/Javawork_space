package com.noArgsConstructor;

public class Laptop {
	String brand;
	int ram;
	double price;
	Laptop() {
		brand="asus";
		ram=8;
		price=75000;
	}
	void display() {
		System.out.println(brand);
		System.out.println(ram);
		System.out.println(price);
		
	}

	public static void main(String[] args) {
		Laptop obj=new Laptop();
		obj.display();

	}

}
