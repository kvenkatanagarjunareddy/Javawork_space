package com.javaintroduction;

import java.util.Scanner;

public class MobileBill {
	String mobile_Model;
	int quantity;
	double price;
	double mobile_cost;
	double delivery_charge;
	double final_Bill;

	MobileBill(String mobile_Model, int quantity) {
		this(mobile_Model, quantity, 0.0, 0.0);

	}

	public MobileBill(String mobile_Model, int quantity, double price, double delivery_charge) {
		this.mobile_Model = mobile_Model;
		this.quantity = quantity;
		this.price = price;
		this.delivery_charge = delivery_charge;

		this.mobile_cost = this.price * this.quantity;
		this.final_Bill = this.mobile_cost + this.delivery_charge;
		
		displayBill();

	}

	public void displayBill() {
		System.out.println("========= MOBILE BILL =========");
		System.out.println("Mobile Model    : " + mobile_Model);
		System.out.println("Price           : $" + price);
		System.out.println("Quantity        : " + quantity);
		System.out.println("Mobile Cost     : $" + mobile_cost);
		System.out.println("Delivery Charge : $" + delivery_charge);
		System.out.println("-------------------------------");
		System.out.println("Final Bill      : $" + final_Bill);
		System.out.println("===============================");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Model of the mobile: ");
		String model = sc.nextLine();

		System.out.print("Enter the quantity of the mobile: ");
		int qty = sc.nextInt();

		System.out.print("Enter the price of the mobile: ");
		double prc = sc.nextDouble();

		System.out.print("Enter the delivery charge: ");
		double delivery = sc.nextDouble();

		new MobileBill(model, qty, prc, delivery);
		sc.close();

	}

}
