package com.javaintroduction;

public class HowGarbageCollecterWorks {
	@Override
	protected void finalize() {
		System.out.println("Garbage is collected");
		
	}
	

	public static void main(String[] args) {
		HowGarbageCollecterWorks s1=new HowGarbageCollecterWorks();
		HowGarbageCollecterWorks s2=new HowGarbageCollecterWorks();
		s1=null;
		s2=s1;
		
	
		new HowGarbageCollecterWorks();
		System.gc();
		

	}
	

}
