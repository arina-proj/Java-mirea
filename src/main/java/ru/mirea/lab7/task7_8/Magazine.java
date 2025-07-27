package ru.mirea.lab7.task7_8;

import java.awt.print.Printable;

public class Magazine {
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                System.out.println(((Magazine)item).getName());
            }
        }
    }
    private String name;
    public String getName() {
        return name;
    }
}
