/**
 * Name: Mehmet Karatas
 * Class: Java Programming
 * Assignment: Bookshelf
 *
 * Description: This is a "bookshelf" program. We can add, remove the books to the
 * Bookshelf and it is limited to 5 books. We also have isFull, isEmpty and isDuplicate to
 * check if it is empty or full and prevent us to add duplicated books.
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Benim Adim Kirmizi", "Orhan Pamuk", "Alfred A. Knopf", 34.50, 1987);
        Book b2 = new Book("Karamazow Kardesler", "Fyodor Dostoyevsky", "The Russian Messenger ", 12.99, 1879);
        Book b3 = new Book("War and Peace", "Leo Tolstoy", "The Russian Messenger ", 12.99, 1879);
        Book b4 = new Book("Don Quixote", "Miguel de Cervantes", "Francisco de Robles", 10.00, 1605);
        Book b5 = new Book("Les Misérables", "Victor Hugo", "A. Lacroix, Verboeckhoven & Cie.", 17.65, 1862);
        Book b6 = new Book("A Tale of Two Cities", "Charles Dickens", "Weekly serial", 30.43, 1859);

        Bookshelf bookFunction = new Bookshelf();

        // Calling toString() method to print output.

        System.out.println("\nIs it empty: ");
        System.out.println(bookFunction.isEmpty());
        System.out.println("Is it full: ");
        System.out.println(bookFunction.isFull());
        System.out.println("\n");

        bookFunction.adds(b1);
        bookFunction.adds(b2);
        bookFunction.adds(b3);
        bookFunction.adds(b4);
        bookFunction.adds(b5);

        bookFunction.toString();

        bookFunction.remove(b2);
        bookFunction.remove(b5);

        bookFunction.toString();

        System.out.println("Is it empty: ");
        System.out.println(bookFunction.isEmpty());
        System.out.println("Is it full: ");
        System.out.println(bookFunction.isFull());
        System.out.println("\n");



    }


}
