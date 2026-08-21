package com.javaintroduction;

public class LibraryBook1 {
	int bookId;
	String bookTitle;
	String authorName;
	int availableCopies;
	// Static fields are shared across all instances
	static String libraryName = "Vcube"; 
	static String librarianName;

	// Prints instance-specific book data
	void displayBookDetails() {
		System.out.println("Book ID: " + bookId);
		System.out.println("Title: " + bookTitle);
		System.out.println("Author: " + authorName);
		System.out.println("Available Copies: " + availableCopies);
	}

	void issueBook() {
		System.out.println("Issuing book... Remaining copies before issue: " + availableCopies);
		availableCopies--;
	}

	// Prints shared library data
	void displayLibraryDetails() {
		System.out.println("Library Name: " + libraryName);
		System.out.println("Librarian Name: " + librarianName);
	}

	static void changeLibraryan(String newName) {
		librarianName = newName;
		System.out.println("Librarian name is successfully updated to: " + librarianName);
	}

	public static void main(String[] args) {
		// Initialize the shared static library name
		libraryName = "Central Library";
		
		// Create and populate Object 1
		LibraryBook1 obj1 = new LibraryBook1();
		obj1.bookId = 101;
		obj1.bookTitle = "Java Programming";
		obj1.authorName = "James Gosling";
		librarianName = "Nagarjuna"; // Static variable assignment
		obj1.availableCopies = 5;

		// Create and populate Object 2
		LibraryBook1 obj2 = new LibraryBook1();
		obj2.bookId = 102;
		obj2.bookTitle = "Effective Java";
		obj2.authorName = "Joshua Bloch";
		obj2.availableCopies = 3;

		System.out.println("--- Printing Details Before Actions ---");
		obj1.displayBookDetails();
		obj1.displayLibraryDetails();
		System.out.println();
		obj2.displayBookDetails();
		obj2.displayLibraryDetails();
		System.out.println();

		// Perform actions
		obj1.issueBook(); // Decrements obj1 copies from 5 to 4
		System.out.println();
		
		changeLibraryan("Siva"); // Changes librarian name for ALL objects
		System.out.println();

		System.out.println("--- Printing Details After Actions ---");
		obj1.displayBookDetails();
		obj1.displayLibraryDetails(); // Librarian will show "Siva"
		System.out.println("--------------------");
		obj2.issueBook();
		obj2.displayBookDetails();
		obj2.displayLibraryDetails();
		
	}
}
