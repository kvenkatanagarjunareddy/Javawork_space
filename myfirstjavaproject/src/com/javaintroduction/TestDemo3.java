package com.javaintroduction;

public class TestDemo3 {
	//static TestDemo3 obj=new TestDemo3();
	{
		System.out.println("instance block called");
		//TestDemo3 obj=new TestDemo3(); //instance block is not call
	}
	static {
		System.out.println("static bloack call");
		//TestDemo3 obj=new TestDemo3();
	}
	static TestDemo3 obj=new TestDemo3();
	public static void main(String[] args) {
//		TestDemo3 obj=new TestDemo3();
		System.out.println("main method started");
		System.out.println("main method ended");
	}

}
