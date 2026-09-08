package com.noArgsConstructor;

public class Student {
	String studentName;
	long rollNumber;
	String course;
	Student(){
		studentName="Nagarjuna";
		rollNumber=123455668899990l;
		course="Java";
	}
	void display() {
		System.out.println(studentName);
		System.out.println(rollNumber);
		System.out.println(course);
	}
	
	public static void main(String[] args) {
		Student obj=new Student();
		
		obj.display();
	}

}
