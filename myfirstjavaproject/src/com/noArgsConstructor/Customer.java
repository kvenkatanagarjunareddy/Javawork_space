package com.noArgsConstructor;

public class Customer {
	int customerId;
	String customerName;
	String city;
	Customer(){
		customerId=1;
		customerName="Nagarjuna";
		city="Hyd";
	}
	void display() {
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(city);
	}

	public static void main(String[] args) {
		Customer obj=new Customer();
		obj.display();
	}

}
