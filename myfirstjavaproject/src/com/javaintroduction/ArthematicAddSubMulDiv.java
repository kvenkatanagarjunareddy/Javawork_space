package com.javaintroduction;

import java.util.Scanner;

public class ArthematicAddSubMulDiv {

	void Addtion(int a, int b) {
			System.out.println("Addtion is: "+(a+b));		
	}

	void Subtraction(int a, int b) {
		System.out.println("Subtraction is: "+(a-b));

	}

	void Multiplication(int a, int b) {
		System.out.println("multiplication is: "+(a*b));

	}

	void Division(int a, int b) {
		System.out.println("Division is: "+(a/b));

	}

	public static void main(String[] args) {
		System.out.println("Welcome to my calculator!..");
		ArthematicAddSubMulDiv obj=new ArthematicAddSubMulDiv();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the (A) value: ");
		int a = sc.nextInt();
		System.out.println("Enter the (B) value: ");
		int b = sc.nextInt();
		obj.Addtion(a, b);
		obj.Subtraction(a, b);
		obj.Division(a, b);
		obj.Multiplication(a, b);
		

	}

}
