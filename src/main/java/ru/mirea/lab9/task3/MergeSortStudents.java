package ru.mirea.lab9.task3;

import java.util.ArrayList;
import java.util.List;


public class MergeSortStudents {

    public static List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        // Делим список на две части
        List<Student> left = mergeSort(list.subList(0, mid));
        List<Student> right = mergeSort(list.subList(mid, list.size()));
        // Сливаем отсортированные части
        return merge(left, right);
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).gpa >= right.get(j).gpa) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }
        // Добавляем оставшиеся элементы
        while (i < left.size()) {
            merged.add(left.get(i++));
        }
        while (j < right.size()) {
            merged.add(right.get(j++));
        }
        return merged;
    }

    public static void main(String[] args) {
        List<Student> group1 = new ArrayList<>();
        group1.add(new Student("Иванов", 4.2));
        group1.add(new Student("Петров", 3.8));

        List<Student> group2 = new ArrayList<>();
        group2.add(new Student("Сидорова", 4.8));
        group2.add(new Student("Козлов", 3.5));
        group2.add(new Student("Николаев", 4.5));

        // Объединяем списки
        List<Student> allStudents = new ArrayList<>();
        allStudents.addAll(group1);
        allStudents.addAll(group2);

        List<Student> sorted = mergeSort(allStudents);

        System.out.println("Студенты (по убыванию GPA):");
        for (Student s : sorted) {
            System.out.println(s);
        }
    }
}