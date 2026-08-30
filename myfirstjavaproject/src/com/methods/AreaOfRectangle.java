package com.methods;

import java.util.Scanner;

public class AreaOfRectangle {
	void calculateAreaOfRectangle(double length, double width) {
		double area=length*width;
		System.out.println("area of the rectangle: "+area);
		
	}

	public static void main(String[] args) {
		AreaOfRectangle obj=new AreaOfRectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the  rectangle: ");
		double length=sc.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		double width=sc.nextDouble();
		obj.calculateAreaOfRectangle(length, width);
		
		
		}

}
