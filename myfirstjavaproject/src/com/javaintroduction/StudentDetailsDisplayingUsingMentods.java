package com.javaintroduction;

public class StudentDetailsDisplayingUsingMentods {
	  Integer studentId;
	    String studentName;
	    Character gender;
	    String branchName;
	    String collegeName;
	
			
	
	    public void displayStudentDetails() {
	        System.out.println("------------------------------------");
	        System.out.println("Student ID    : " + studentId);
	        System.out.println("Student Name  : " + studentName);
	        System.out.println("Gender        : " + gender);
	        System.out.println("Branch Name   : " + branchName);
	        System.out.println("College Name  : " + collegeName);
	    }

	public static void main(String[] args) {
		StudentDetailsDisplayingUsingMentods student1=new StudentDetailsDisplayingUsingMentods();
		
        student1.studentId =101;
        student1.studentName = "Rahul";
        student1.gender = Character.valueOf('M');
        student1.branchName = "Computer Science";
        student1.collegeName = "Vcube Institute";

        
    	StudentDetailsDisplayingUsingMentods student2=new StudentDetailsDisplayingUsingMentods();
        student2.studentId = 102;
        student2.studentName = "Priya";
        student2.gender = Character.valueOf('F');
        student2.branchName = "Data Science";
        student2.collegeName = "Vcube Institute";
        student1.displayStudentDetails();
        student2.displayStudentDetails();

	}

}
