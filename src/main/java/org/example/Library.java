package org.example;

// Concrete class Library managing an array of Book objects
public class Library {
    private Book[] books;
    private int bookCount;

    // Constructor to initialize the library with a specified capacity
    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to find a book in the library by its title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book != null && book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Method to find a book in the library by its author
    public Book findBookByAuthor(String author) {
        for (Book book : books) {
            if (book != null && book.author.equals(author)) {
                return book;
            }
        }
        return null;
    }
}
