package ru.mirea.lab10;

import java.util.*;

public class SortingStudentsByGPA {
    private List<Student> iDNumber = new ArrayList<>();
    //1) заполнения массива setArray()
    public void setArray(List<Student> students) {
        this.iDNumber = new ArrayList<>(students);
    }

    //2) метод для сортировки по среднему баллу студентов quicksort()

    //----быстрая сортировка
    public void quicksort() {
        quicksort(0, iDNumber.size() - 1, Comparator.comparingDouble(Student::getGpa).reversed());
    }
    private void quicksort(int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(low, high, comparator);
            quicksort(low, pi - 1, comparator);
            quicksort(pi + 1, high, comparator);
        }
    }
    private int partition(int low, int high, Comparator<Student> comparator) {
        Student pivot = iDNumber.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(iDNumber.get(j), pivot) < 0) {
                i++;
                Collections.swap(iDNumber, i, j);
            }
        }
        Collections.swap(iDNumber, i + 1, high);
        return i + 1;
    }

    //---сортировка слиянием
    public static List<Student> sortArray(List<Student> arrayA, Comparator<Student> comparator) {
        if (arrayA == null) {
            return null;
        }
        if (arrayA.size() < 2) {
            return new ArrayList<>(arrayA); // Возвращаем копию
        }

        // Разделяем список на две части
        List<Student> arrayB = new ArrayList<>(arrayA.subList(0, arrayA.size() / 2));
        List<Student> arrayC = new ArrayList<>(arrayA.subList(arrayA.size() / 2, arrayA.size()));

        // Рекурсивная сортировка
        arrayB = sortArray(arrayB, comparator);
        arrayC = sortArray(arrayC, comparator);

        // Слияние отсортированных списков
        return mergeArray(arrayB, arrayC, comparator);
    }

    private static List<Student> mergeArray(List<Student> left, List<Student> right,
                                            Comparator<Student> comparator) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) < 0) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));

        return result;
    }

    //3)метод для вывода массива студентов outArray()
    public void outArray(){
        for(Student student:iDNumber){
            System.out.println(student.toString());
        }
    }

    public static Comparator<Student> byFirstName() {
        return Comparator.comparing(Student::getFirstName);
    }
    public static Comparator<Student> byGpaDesc() {
        return Comparator.comparingDouble(Student::getGpa).reversed();
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", "Информатика", 2, "ИВТ-202", 4.5));
        students.add(new Student("Петр", "Петров", "Математика", 3, "МАТ-301", 3.8));
        students.add(new Student("Анна", "Сидорова", "Физика", 1, "ФИЗ-101", 4.9));
        students.add(new Student("Мария", "Смирнова", "Химия", 4, "ХИМ-401", 4.2));



        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        //Тестируем быструю сортировку по GPA
        System.out.println("Сортировка по среднему баллу (убывание):");
        sorter.setArray(students);
        sorter.quicksort();
        sorter.outArray();

        System.out.println("По среднему баллу (убывание):");
        List<Student> byGpa =SortingStudentsByGPA.sortArray(students, SortingStudentsByGPA.byGpaDesc());
        byGpa.forEach(s -> System.out.println(s.getLastName() + " - " + s.getGpa()));

        // 2. Сортировка по имени (А-Я)
        System.out.println("\nПо имени:");
        List<Student> byName = SortingStudentsByGPA.sortArray(students, SortingStudentsByGPA.byFirstName());
        byName.forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName()));
    }
}
