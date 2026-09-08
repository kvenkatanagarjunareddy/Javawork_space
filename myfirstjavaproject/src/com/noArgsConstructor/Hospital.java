package com.noArgsConstructor;

public class Hospital {
	String hospitalName;
	String loc;
	int beds;

	Hospital() {
		hospitalName = "care";
		loc = "hyd";
		beds = 4;
	}

	void display() {
		System.out.println(hospitalName);
		System.err.println(loc);
		System.out.println(4);
	}

	public static void main(String[] args) {
		Hospital obj = new Hospital();
	}

}
