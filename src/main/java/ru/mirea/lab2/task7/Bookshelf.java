package ru.mirea.lab2.task7;

import java.util.Arrays;

public class Bookshelf {
    private Book[] books;
    private int count;

    public Bookshelf(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Книжная полка заполнена!");
        }
    }

    public String getEarliestBook() {
        if (count == 0) return null;

        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }
        return earliest.toString();
    }

    public String getLatestBook() {
        if (count == 0) return null;

        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }
        return latest.toString();
    }

    public void displayBooks() {
        System.out.println("\nКниги на полке:");
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + ". " + books[i].toString());
        }
    }
    public void sortByYear() {
        Arrays.sort(books, 0, count, (b1, b2) -> Integer.compare(b1.getYear(), b2.getYear()));
    }

}

