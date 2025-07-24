package ru.mirea.lab2;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова одной строкой (разделяя пробелами):");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Вы не ввели ни одного слова!");
        } else {
            String[] words = input.trim().split("\\s+");
            System.out.println("Вы ввели " + words.length + " слов(а)");
        }

        scanner.close();
    }
}
