package com.javaintroduction;

public class Movie {
	int movieId;
	String movieName;
	String heroName;
	int availableSeats;
	static String theaterName = "Asian CineSquare";
	static String managerName = "Ramesh";

	void displayMovieDetails() {

		System.out.println("Movie ID: " + movieId);
		System.out.println("Movie Name: " + movieName);
		System.out.println("Hero Name: " + heroName);
		System.out.println("Available Seats: " + availableSeats);
		System.out.println("-----------------------------------");

	}

	void bookseat() {
		if (availableSeats > 0) {
			availableSeats--;
			System.out.println("Ticket booked successfully for " + movieName + "!");
			System.out.println("Remaining seats: " + availableSeats);
		} else {
			System.out.println("Sorry, " + movieName + " is housefull!");
		}
		System.out.println("-----------------------------------");
	}

	static void displayTheaterDeatils() {
		System.out.println("--- Theater Information ---");
		System.out.println("Theater Name: " + theaterName);
		System.out.println("Manager Name: " + managerName);
		System.out.println("-----------------------------------");

	}

	static void changeManager(String newManager) {
		managerName = newManager;
		System.out.println("Manager successfully updated to: " + managerName);
		System.out.println("-----------------------------------");

	}

	public static void main(String[] args) {
		Movie obj1 = new Movie();
		Movie obj2 = new Movie();

		obj1.movieId = 101;
		obj1.movieName = "Devara";
		obj1.heroName = "Jr NTR";
		obj1.availableSeats = 150;

		obj2.movieId = 102;
		obj2.movieName = "Pushpa 2";
		obj2.heroName = "Allu Arjun";
		obj2.availableSeats = 85;

		obj1.displayMovieDetails();
		displayTheaterDeatils();
		obj2.displayMovieDetails();

		displayTheaterDeatils();

		changeManager("Suresh");

	}

}
