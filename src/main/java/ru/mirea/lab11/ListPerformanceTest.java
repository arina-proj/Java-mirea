package ru.mirea.lab11;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class ListPerformanceTest {
    private static final int ELEMENTS_COUNT = 100_000;

    public static void main(String[] args) {
        // Тестируем ArrayList
        System.out.println("Тестирование ArrayList:");
        testList(new ArrayList<>());

        // Тестируем LinkedList
        System.out.println("\nТестирование LinkedList:");
        testList(new LinkedList<>());
    }

    private static void testList(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(i);
        }
        printTime("Добавление в конец", start);

        start = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            list.add(0, i);
        }
        printTime("Вставка в начало (1000 элементов)", start);

        start = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            list.add(list.size()/2, i);
        }
        printTime("Вставка в середину (1000 элементов)", start);

        start = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            list.get(i);
        }
        printTime("Доступ по индексу (1000 элементов)", start);

        start = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            list.contains(i);
        }
        printTime("Поиск элемента (1000 элементов)", start);

        start = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            list.remove(0);
        }
        printTime("Удаление из начала (1000 элементов)", start);

        start = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            list.remove(list.size()-1);
        }
        printTime("Удаление из конца (1000 элементов)", start);
    }

    private static void printTime(String operation, long startTime) {
        long duration = System.nanoTime() - startTime;
        System.out.printf("%-40s %8d мкс%n", operation, duration/1000);
    }
}