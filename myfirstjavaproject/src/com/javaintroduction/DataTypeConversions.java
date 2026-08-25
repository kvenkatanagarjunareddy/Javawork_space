package com.javaintroduction;

public class DataTypeConversions {
	int a=40;

	public static void main(String[] args) {
		DataTypeConversions obj1=new DataTypeConversions();
		
		Integer b=obj1.a;
		int c=(int)b;
		
		System.out.println(b);
		System.out.println(c);
		
	}

}
