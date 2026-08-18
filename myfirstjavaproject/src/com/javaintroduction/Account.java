package com.javaintroduction;

public class Account {
	String Name;
	int Balance ;
	boolean Account_Status;
	static int Account_Number=100;
	{
		Account_Number++;
	}
	void displaydetails() {
		System.out.println(Name);
		System.out.println(Balance);
		System.out.println(Account_Status);
		System.out.println(Account_Number);
		System.out.println("----------------");

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj1 = new Account();
		obj1.Name = "Nagarjuna";
		obj1.Balance = 34000;
		obj1.Account_Status = true;
		obj1.displaydetails();
		
		Account obj2 = new Account();
		obj2.Name = "Nagarjuna";
		obj2.Balance = 34000;
		obj2.Account_Status = false;
		obj2.displaydetails();

		System.out.println(obj1.Account_Status);
		Account obj3 = new Account();
		obj3.Name = "Nagarjuna";
		obj3.Balance = 34000;
		obj3.Account_Status = true;
		
		obj3.displaydetails();

	}

}
