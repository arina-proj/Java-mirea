package ru.mirea.lab9.task1;

public class Student {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "iDNumber=" + iDNumber + ", name='" + name + '\'' + '}';
    }
}
