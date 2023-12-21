package org.example;

// Abstract class Book implementing LibraryItem interface
abstract class Book implements LibraryItem {
    // Instance variables
    String title;
    String author;
    boolean checkedOut;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    // Concrete subclass FictionBook
    static class FictionBook extends Book {
        public FictionBook(String title, String author) {
            super(title, author);
        }
    }

    // Concrete subclass NonFictionBook
    static class NonFictionBook extends Book {
        public NonFictionBook(String title, String author) {
            super(title, author);
        }
    }

    // Implementation of checkOut method
    @Override
    public void checkOut() {
        checkedOut = true;
    }

    // Implementation of checkIn method
    @Override
    public void checkIn() {
        checkedOut = false;
    }

    // Implementation of isCheckedOut method
    @Override
    public boolean isCheckedOut() {
        return checkedOut;
    }
}

