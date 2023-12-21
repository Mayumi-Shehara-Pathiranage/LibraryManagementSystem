package org.example;

// Main class LibraryManagementSystem
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating a library with a capacity of 5 books
        Library library = new Library(5);

        // Adding books to the library
        Book book1 = new Book.FictionBook("The Night Circus", "Erin Morgenstern");
        Book book2 = new Book.FictionBook("Where the Crawdads Sing", " Delia Owens");
        Book book3 = new Book.NonFictionBook("Thinking, Fast and Slow", " Daniel Kahneman ");
        Book book4 = new Book.NonFictionBook("The Wright Brothers", "David McCullough");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Checking out a book
        book1.checkOut();

        // Finding books by title and author
        Book foundBookByTitle = library.findBookByTitle("The Wright Brothers");
        Book foundBookByAuthor = library.findBookByAuthor("Erin Morgenstern");

        // Printing information
        if (foundBookByTitle != null) {
            System.out.println("Book found by title: " + foundBookByTitle.title);
            System.out.println("Is checked out? " + foundBookByTitle.isCheckedOut());
        } else {
            System.out.println("Book not found by title.");
        }

        if (foundBookByAuthor != null) {
            System.out.println("Book found by author: " + foundBookByAuthor.title);
            System.out.println("Is checked out? " + foundBookByAuthor.isCheckedOut());
        } else {
            System.out.println("Book not found by author.");
        }
    }
}
