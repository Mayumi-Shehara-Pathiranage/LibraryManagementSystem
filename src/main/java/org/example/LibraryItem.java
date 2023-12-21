package org.example;

// LibraryItem interface
public interface LibraryItem {
    // Method to mark the library item as checked out
    void checkOut();

    // Method to mark the library item as checked in
    void checkIn();

    // Method to check if the library item is checked out
    boolean isCheckedOut();
}


