package ru.mirea.lab6.task3_4;

public class NameableDemo {
    public static void main(String[] args) {
        INameable earth = new Planet("Earth", 5.97e24);
        INameable tesla = new Car("Tesla Model S", 2022);

        printName(earth);
        printName(tesla);
    }

    public static void printName(INameable obj) {
        System.out.println("Object name: " + obj.getName());
    }
}