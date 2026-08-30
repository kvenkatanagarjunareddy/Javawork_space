package com.methods;

import java.util.Scanner;

public class AreaofTriangle {
	void calculateAreaOfTriangle(double base, double height) {
		double area=0.5*base*height;
		System.out.println("Area of the triangle is: "+area);
		
	}

	public static void main(String[] args) {
		AreaofTriangle obj=new AreaofTriangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value: ");
		double base=sc.nextDouble();
		System.out.println("Enter the height value: ");
		double height=sc.nextDouble();
		obj.calculateAreaOfTriangle(base, height);
		
		
		
		

	}

}
