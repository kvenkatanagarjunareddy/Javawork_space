package com.javaintroduction;

import java.util.Scanner;

public class LoanManagement {
	String customerName;
	Double LoanAmount;
	Double IntrestRate;
	int Loantenure;
    
	double calculateIntrest(double principle, int timeInMonths, int rate) {
		  double simpleIntrest=(principle*timeInMonths*rate)/100;
		  return  simpleIntrest;
	 }
     
	 double claculateTotalAmount(double TotalIntrest,double orginalAmount){
		  double Total_Payable=TotalIntrest+orginalAmount;
		  return Total_Payable;
	  }
      
	 double calculateMonthlyEmi(double TotalAmount,int tenure){
		 double monthlyEmi=TotalAmount/tenure;
		 return  monthlyEmi;
	 }
	 
	 void displayLoanSummery(double Intrest,double TotalAmount,double Emi,String Name){
		 System.out.println("Name of the person is: "+Name);
		 System.out.println("TotalIntrest is: "+Intrest);
		 System.out.println("TotalAmout is: "+TotalAmount);
		 System.out.println("Emi is: "+Emi);
		 System.out.println(); 
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// ==================== OBJECT 1 ====================
		System.out.println("--- Entering Details for Object 1 ---");
		LoanManagement obj1=new LoanManagement();
		System.out.println("Enter the Name: ");
		String Name1=obj1.customerName=sc.nextLine();
		System.out.println("Enter your Loan amount: ");
		double totalAmount1=obj1.LoanAmount=sc.nextDouble();
		System.out.println("Enter the time (in years): ");
		int time1=sc.nextInt();
		time1=time1*12; 
		System.out.println("Enter the rate of intrest: ");
		int rate1=sc.nextInt();
		
		double Intrest1=obj1.calculateIntrest(totalAmount1, time1, rate1);
		double overalAmount1=obj1.claculateTotalAmount(Intrest1,totalAmount1);
		double monEmi1=obj1.calculateMonthlyEmi(overalAmount1, time1);
        
		System.out.println("\n--- Summary for Object 1 ---");
		obj1.displayLoanSummery(Intrest1, overalAmount1, monEmi1, Name1);
		
		// Clearing the scanner buffer after reading numbers
		sc.nextLine(); 
		
		// ==================== OBJECT 2 ====================
		System.out.println("--- Entering Details for Object 2 ---");
		LoanManagement obj2=new LoanManagement();
		System.out.println("Enter the Name: ");
		String Name2=obj2.customerName=sc.nextLine();
		System.out.println("Enter your Loan amount: ");
		double totalAmount2=obj2.LoanAmount=sc.nextDouble();
		System.out.println("Enter the time (in years): ");
		int time2=sc.nextInt();
		time2=time2*12; 
		System.out.println("Enter the rate of intrest: ");
		int rate2=sc.nextInt();
		
		double Intrest2=obj2.calculateIntrest(totalAmount2, time2, rate2);
		double overalAmount2=obj2.claculateTotalAmount(Intrest2, totalAmount2);
		double monEmi2=obj2.calculateMonthlyEmi(overalAmount2, time2);
		
		System.out.println("\n--- Summary for Object 2 ---");
		obj2.displayLoanSummery(Intrest2, overalAmount2, monEmi2, Name2);
        
		sc.close();
	}
}
