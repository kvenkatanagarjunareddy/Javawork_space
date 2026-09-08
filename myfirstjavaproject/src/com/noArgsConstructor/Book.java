package com.noArgsConstructor;

public class Book {
	String title;
	String author;
	double price;
	
	Book() {
		title="JAVA";
		author="James Gosling";
		price=356645;
		
		
	}
	void display() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	public static void main(String[] args) {
		Book obj=new Book();
		obj.display();
	}

}
