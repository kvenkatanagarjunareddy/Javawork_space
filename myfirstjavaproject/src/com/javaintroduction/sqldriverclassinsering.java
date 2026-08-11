package com.javaintroduction;

public class sqldriverclassinsering {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method executed");
		System.out.println(Class.forName("com.javaintroduction.Welcome"));
		System.out.println(Class.forName("java.lang.String"));
		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		

	}

}
