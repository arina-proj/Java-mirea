package ru.mirea.lab7.task7_8;

import java.awt.print.Printable;

public class Book {
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                System.out.println(((Book)item).getTitle());
            }
        }
    }
    private String title;
    public String getTitle() {
        return title;
    }
}
