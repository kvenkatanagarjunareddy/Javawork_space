package com.noArgsConstructor;

public class Product {
	int productId;
	String productName;
	double price;
	 Product() {
		productId=1;
		productName="Fridge";
		price=500;
	}
	 void  display() {
		 System.out.println(productId);
		 System.out.println(productName);
		 System.out.println(price);
	 }
	

	public static void main(String[] args) {
		
		Product obj=new Product();
		obj.display();
	}

}
