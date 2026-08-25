package com.javaintroduction;

public class LiteralsDeclaration {

	public static void main(String[] args) {

		// 1. Integer literal
		int integerVar = 25;

		// 2. Floating-point literal (requires 'f' suffix for float)
		float floatVar = 89.75f;
		float floatVar1 = 0456;
		float floatVar2=0x4366;
		float floatVar3=0x5554f;
		

		// 3. Character literal (enclosed in single quotes)
		char charVar = 'J';

		// 4. String literal (enclosed in double quotes)
		String stringVar = "Java Programming";

		// 5. Boolean literal (can be true or false)
		boolean booleanVar = true;

		// Displaying the variables
		System.out.println("Integer Value: " + integerVar);
		System.out.println("Floating-point Value: " + floatVar);
		System.out.println("Floating-point Value ocatal: " + floatVar1);
		System.out.println("Floating-point Value hexa: " + floatVar2);
		System.out.println("Floating-point Value hexa: " + floatVar3);
		System.out.println("Character Value: " + charVar);
		System.out.println("String Value: " + stringVar);
		System.out.println("Boolean Value: " + booleanVar);
		

	}

}
