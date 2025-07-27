package ru.mirea.lab9.task1;

public class StudentSortTest {
    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = {
                new Student(123, "Иванов"),
                new Student(101, "Петров"),
                new Student(134, "Сидоров"),
                new Student(115, "Кузнецов"),
                new Student(107, "Васильев")
        };

        System.out.println("До сортировки:");
        printStudents(students);

        // Сортировка вставками
        insertionSort(students);

        System.out.println("\nПосле сортировки:");
        printStudents(students);
    }
    public static void printStudents(Student[] students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getIDNumber() > current.getIDNumber()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
