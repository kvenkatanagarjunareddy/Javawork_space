package com.javaintroduction;

public class Mobile {
	static String brand = "MI";
	String Model;
	int Price;
	static int Ram;
	{
		Price = 200;
		System.out.println("Price is:- "+Price);

	}

	void Model() {
		System.out.println("Model is:- "+Model);
	}

	static {
		System.out.println("Brand is :- " + brand);
	}
	static void Mobile_RAm() {
		Ram=8;
		System.out.println("Ram is:- "+Ram);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj1 = new Mobile();
		obj1.Model = "mi345s";
		obj1.Model();
		Mobile_RAm();
	}

}
