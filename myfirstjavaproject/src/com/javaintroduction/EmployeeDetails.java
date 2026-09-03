package com.javaintroduction;

public class EmployeeDetails {
	static String CompanyName = "Vcube";
	
	
	void display(String Employee,double salary,String CompanyName) {
		System.out.println("Employee Name is: "+Employee);
		System.out.println("Employee salary is: "+salary);
		System.out.println("Companey Name is: "+CompanyName);
	}

	public static void main(String[] args) {
     EmployeeDetails obj=new EmployeeDetails();
      obj.display("Nagarjuna",10000.00,CompanyName);
	
	}

}
