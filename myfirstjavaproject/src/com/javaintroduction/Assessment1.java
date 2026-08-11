package com.javaintroduction;

public class Assessment1 {
	void method1() {
		method2();
		System.out.println("method 1 call");
		

	}

	static void method2() {
		
		System.out.println("method 2 call");
		Assessment1 n = new Assessment1();

		n.method3();
	}

	void method3() {
		System.out.println("method 3 call");
		method4();
	}

	static void method4() {
		
		System.out.println("method 4 call");
		Assessment1 n = new Assessment1();

		n.method5();

	}

	void method5() {
		System.out.println("method 5 call");
		method6();
	}

	static void method6() {
		
		System.out.println("method 6 call");
		Assessment1 n = new Assessment1();

		n.method7();
	}

	void method7() {
		System.out.println("method 7 call");
		method8();
	}

	static void method8() {
		System.out.println("method 8 call");
		Assessment1 n = new Assessment1();

		n.method9();
	}

	void method9() {
		System.out.println("method 9 call");
		method10();
	}

	static void method10() {
		System.out.println("method 10 call");
	}

	public static void main(String[] args) {
		Assessment1 n = new Assessment1();

		n.method1();

	}

}
