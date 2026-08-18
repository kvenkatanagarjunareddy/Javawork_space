package com.javaintroduction;

public class Account {
	String Name;
	int Balance;
	boolean Account_Status;
	
	static int Account_Number = 100;
	
	
	{
		Account_Number++;
	}
	
	void displaydetails() {
		System.out.println(Name);
		System.out.println(Balance);
		System.out.println(Account_Status);
		System.out.println(Account_Number);
		System.out.println("--------------------");
	}

	public static void main(String[] args) {
		
	
		Account obj1 = new Account();
		obj1.Name = "Virat";
		obj1.Balance = 45000;
		obj1.Account_Status = true;
		obj1.displaydetails(); 
		
		
		Account obj2 = new Account();
		obj2.Name = "Rohit";
		obj2.Balance = 52000;
		obj2.Account_Status = false;
		System.out.println(obj1.Account_Status); 
		obj2.displaydetails(); 
		
		Account obj3 = new Account();
		obj3.Name = "Rahul";
		obj3.Balance = 28000;
		obj3.Account_Status = true;
		obj3.displaydetails(); 
	}
}
