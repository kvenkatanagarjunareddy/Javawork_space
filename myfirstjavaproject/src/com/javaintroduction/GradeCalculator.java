package com.javaintroduction;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks!: ");
		int marks=sc.nextInt();
		if(marks<0 || marks>100 ){
			System.out.println(" plase enter the valid marks");
		}
		else if(marks>90 && marks<=100) {
			 System.out.println("Congratulations!.. you got grade (A)");
		 }else if(marks>75 && marks<=90) {
			 System.out.println("Good you got grade (B)");
		 }else if(marks>60 && marks<75) {
			 System.out.println("you got grade (C)");
		 }else if(marks>40 && marks<60) {
			 System.out.println("you got grade (D)");
		 }else {
			 System.out.println("you are fail! study more");
		 }
		sc.close();

	}

}
