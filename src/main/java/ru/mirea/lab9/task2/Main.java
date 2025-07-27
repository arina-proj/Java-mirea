package ru.mirea.lab9.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иванов", 3.8),
                new Student("Петров", 4.2),
                new Student("Сидорова", 4.8),
                new Student("Козлов", 3.5),
                new Student("Николаев", 4.5)
        };

        System.out.println("До сортировки:");
        Arrays.stream(students).forEach(System.out::println);

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("\nПосле сортировки:");
        Arrays.stream(students).forEach(System.out::println);
    }
}