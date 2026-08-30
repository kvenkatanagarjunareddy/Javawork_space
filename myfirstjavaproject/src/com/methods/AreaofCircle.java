package com.methods;

import java.util.Scanner;

public class AreaofCircle {
	void calculateAreaOfCircle(double radius) {
		double rad=Math.PI*radius*radius;
		System.out.println("Radius is: "+rad);
		
		
	}
	public static void main(String[] args) {
		AreaofCircle c=new AreaofCircle();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		double num=sc.nextDouble();
		c.calculateAreaOfCircle(num);
		
		
		
		
	}

}
