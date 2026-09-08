package com.noArgsConstructor;

public class Employee {
	int employeeId;
	String name;
	double  salary;
	Employee() {
		employeeId=1234;
		name="Nagarjuna";
		salary=456364;
	}
	void display() {
		System.out.println(employeeId);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.display();
		
	}

}
