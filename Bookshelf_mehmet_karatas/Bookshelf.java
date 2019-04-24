package com.company;

import java.util.Arrays;

public class Bookshelf {

    // For getting info from Book class.
    Book[] bookCount = new Book[5];
    String placeHolder = "";

    public Bookshelf() {
    }


    // Checks if it is duplicate
    public void isDuplicate(Book book) {

        for (int i = 0; i < bookCount.length; i++) {
            if (bookCount[i] == book && bookCount[i] != null) {
                System.out.println("You can not duplicate books.");
            } else {
                bookCount[i] = book;
            }
        }
    }


//    This is adds method that adding books that initialized in the main.
    public void adds(Book newBook) {

        for (int i = 0; i < bookCount.length; i++) {

            if (bookCount[i] != newBook && bookCount[i] != null) {
            } else {
                bookCount[i] = newBook;
                i = bookCount.length;
            }
        }
        // Getting title and letting us know which book is added.
        System.out.println("The book \"" + newBook.getTitle() + "\" has been added.");
    }

    // This method removes the books that added. It cannot remove
    // if it hasn't been added.
    public void remove(Book r) {

        for (int i = 0; i < bookCount.length; i++) {
            if (bookCount[i] == r && bookCount[i] != null) {
                System.out.println("\nThe book \"" + bookCount[i].getTitle() + "\" has been removed");
                bookCount[i] = null;
            }
        }
    }

    // Checks if it is full.
    // If we have 5  books it means it is full.
    public boolean isFull() {

        int c = 0;
        boolean tof = false;

        for (int i = 0; i < bookCount.length; i++) {
            if (bookCount[i] != null) {
                c++;
            }

        }

        if (c == 5) {
            tof = true;
        } else {
            tof = false;
        }
        return tof;

    }

    // Checks if it is empty
    public boolean isEmpty() {


        int c = 0;
        boolean tof = false;

        for (int i = 0; i < bookCount.length; i++) {
            if (bookCount[i] != null) {
                c++;
            }
        }

        if (c == 0) {
            tof = true;
        } else {
            tof = false;
        }
        return tof;

    }

    // toString() method for updating output.
    @Override
    public String toString() {

        System.out.println("\n|=========| Updated |=========| \n");


        String output = "";

        for (int i = 0; i < bookCount.length; i++) {

            if (bookCount[i] != null) {
                System.out.println("Book " + bookCount[i].toString() + "\n");

            } else {
                output = "It is Empty";
            }
        }

        return output;
    }
}

