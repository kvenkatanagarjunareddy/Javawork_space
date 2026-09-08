package com.noArgsConstructor;

public class Car {
	String brand;
	int model;
	double price;
	Car(){
		brand="BMW";
		model=2020;
		price=2200000;
	}
	void display() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		
	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.display();

	}

}
