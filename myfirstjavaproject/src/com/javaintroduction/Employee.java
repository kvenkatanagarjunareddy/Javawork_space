package com.javaintroduction;

public class Employee {
	int Employee_ID;
	String Employee_Name;
	int salary;
	int Experience;
	char Grade;
	boolean Permanent_status;

	void displaydetails() {
		System.out.println("Employee ID: " + Employee_ID);
		System.out.println("Employee Name: " + Employee_Name);
		System.out.println("Grade: " + Grade);
		System.out.println("Permanent Status: " + Permanent_status);
		System.out.println("Salary: " + salary);
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee();
		obj1.Employee_ID = 101;
		obj1.Employee_Name = "Nagarjuna";
		obj1.Grade = 'A';
		obj1.Permanent_status = true;
		obj1.salary = 3500;
		Employee obj2 = new Employee();
		obj2.Employee_ID = 102;
		obj2.Employee_Name = "Gopi";
		obj2.Grade = 'B';
		obj2.Permanent_status = false;
		obj2.salary = 2800;

		Employee obj3 = new Employee();
		obj3.Employee_ID = 103;
		obj3.Employee_Name = "Anusha";
		obj3.Grade = 'A';
		obj3.Permanent_status = true;
		obj3.salary = 4200;
		obj1.displaydetails();
		obj2.displaydetails();
		obj3.displaydetails();

	}

}
