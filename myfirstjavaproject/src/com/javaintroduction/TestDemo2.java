package com.javaintroduction;

public class TestDemo2 {
	static String couchingCenter="cvcrop";
	static int countryCode=92;
	int phn=7585;
	String name="hello";
	

	public static void main(String[] args) {
		System.out.println("***object 1 is created***");
		TestDemo2 frnd1=new TestDemo2();
		couchingCenter="Vcube";
		countryCode=91;
		frnd1.phn=5465;
		frnd1.name="Gopi";
		System.out.println(couchingCenter);
		System.out.println(countryCode);
		System.out.println(frnd1.phn);
		System.out.println(frnd1.name);
		System.out.println("***object 2 is created***");
		TestDemo2 frnd2=new TestDemo2();
		couchingCenter="Vcube";
		countryCode=91;
		frnd2.phn=5566;
		frnd2.name="naga";
		System.out.println(couchingCenter);
		System.out.println(countryCode);
		System.out.println(frnd2.phn);
		System.out.println(frnd2.name);
		System.out.println("***object 3 is created***");
		TestDemo2 frnd3=new TestDemo2();
		couchingCenter="Vcube";
		countryCode=93;
		frnd3.phn=5465;
		frnd3.name="reddy";
		System.out.println(couchingCenter);
		System.out.println(countryCode);
		System.out.println(frnd3.phn);
		System.out.println(frnd3.name);
		System.out.println("***object 4 is created***");
		TestDemo2 frnd4=new TestDemo2();
	
		System.out.println(couchingCenter);
		System.out.println(countryCode);
		System.out.println(frnd4.phn);
		System.out.println(frnd4.name);

	}

}
