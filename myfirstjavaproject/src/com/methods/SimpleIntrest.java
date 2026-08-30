package com.methods;

import java.util.Scanner;

public class SimpleIntrest {
	void calculateSimpleInterest(double p, double r, double t) {
		double Si=(p*t*r)/100;
		System.out.println("Simple intrest is: "+Si);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value: ");
		double a=sc.nextDouble();
		System.out.println("Enter the b value: ");
		double b=sc.nextDouble();
		System.out.println("Enter the c value: ");
		double c=sc.nextDouble();
		SimpleIntrest obj=new SimpleIntrest();
		obj.calculateSimpleInterest(a, b, c);

	}

}
