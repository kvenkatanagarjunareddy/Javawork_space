package com.javaintroduction;

import java.math.BigInteger;

public class StoringVaribles {
	String Student_name = "Nagarjuna";
	int Age = 21;
	int Admission_year = 2026;
	long Roll_number = 743177886L;
	String Mobile_number = "+917565333647";
	double Attendance_percentage = 90;
	long Total_fees = 29000;
	char Grade = 'A';
	boolean Status = true;

	BigInteger Large_student_ID = new BigInteger("25454654547765");
	void displayOf() {
		System.out.println("Student Name: " + Student_name);
		System.out.println("Age: " + Age);
		System.out.println("Admission Year: " + Admission_year);
		System.out.println("Roll Number: " + Roll_number);
		System.out.println("Mobile Number: " + Mobile_number);
		System.out.println("Attendance Percentage: " + Attendance_percentage);
		System.out.println("Total Fees: " + Total_fees);
		System.out.println("Grade: " + Grade);
		System.out.println("Status: " + Status);
		System.out.println("Large Student ID: " + Large_student_ID);
		
	}

	public static void main(String[] args) {
		StoringVaribles obj1=new StoringVaribles();
		
		obj1.Student_name = "Nagarjuna";
        obj1.Age = 21;
        obj1.Admission_year = 2026;
        obj1.Roll_number = 7431;
        obj1.Mobile_number = "+917565333647";
        obj1.Attendance_percentage = 90;
        obj1.Total_fees = 29000;
        obj1.Grade = 'A';
        obj1.Status = true;
        obj1.Large_student_ID = new BigInteger("25454654547765");
        obj1.displayOf();


	}

}
