package ru.mirea.lab10.task3;

public class Student {
    private String name;
    double gpa; // средний балл

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + gpa;
    }
}