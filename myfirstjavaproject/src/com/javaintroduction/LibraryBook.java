package com.javaintroduction;

public class LibraryBook {

    int bookId;
    String bookTitle;
    String authorName;
    int availableCopies;
    static String libraryName = "Vcube";
    String librarianName;

    void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Available Copies: " + availableCopies);
    }

    void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Librarian Name: " + librarianName);
    }

    void changeLibrarian(String newLibrarianName) {
        librarianName = newLibrarianName;
    }

    public static void main(String[] args) {

        // First object
        LibraryBook obj1 = new LibraryBook();

        obj1.bookId = 1;
        obj1.bookTitle = "Java";
        obj1.authorName = "James Gosling";
        obj1.availableCopies = 10;
        obj1.librarianName = "Gopi";

        // Second object
        LibraryBook obj2 = new LibraryBook();

        obj2.bookId = 2;
        obj2.bookTitle = "Python";
        obj2.authorName = "Guido van Rossum";
        obj2.availableCopies = 15;
        obj2.librarianName = "Ravi";

        // Display first book details
        System.out.println("----- Book 1 -----");
        obj1.displayBookDetails();
        obj1.displayLibraryDetails();

        // Display second book details
        System.out.println("\n----- Book 2 -----");
        obj2.displayBookDetails();
        obj2.displayLibraryDetails();

        // Change librarian
        System.out.println(" After Changing Librarian -----");
        obj1.changeLibrarian("Nagarjuna");
        obj1.displayLibraryDetails();
    }
}