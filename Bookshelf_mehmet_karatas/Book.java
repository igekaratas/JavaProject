package com.company;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private double price;
    private int copyrightDate;


    // Constructor for the Book class.
    public Book(String title, String author, String publisher, double price, int copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.copyrightDate = copyrightDate;
    }

    // Setter and Getter for each element.

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCopyrightDate() {
        return copyrightDate;
    }

    public void setCopyrightDate(int copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    @Override
    public String toString() {

        // I formatted the output using the style I like.
        return " { \n" +
                "Title: " + title + '\n' +
                "Author: " + author + '\n' +
                "Publisher: " + publisher + '\n' +
                "Price: $" + price + "\n" +
                "Copyright Date: " + copyrightDate + "\n" +
                '}';
    }
}
