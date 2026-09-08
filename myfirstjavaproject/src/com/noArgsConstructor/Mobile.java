package com.noArgsConstructor;

public class Mobile {
	String brand;
	int model;
	double price;
	Mobile(){
			brand="MI";
			model=2024;
			price=23000;
		
	}
	void display() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}

	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.display();
	}

}
