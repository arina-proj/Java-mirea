package ru.mirea.lab3;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Math_Random_task4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            try {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Число должно быть больше 0. Попробуйте еще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Это не натуральное число. Попробуйте еще раз.");
                scanner.next();
            }
        }

        int[] firstArray = new int[n];
        Random random = new Random();
        System.out.print("Первый массив: [");
        for (int i = 0; i < n; i++) {
            firstArray[i] = i;
            System.out.print(firstArray[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int num : firstArray) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        if (evenNumbers.isEmpty()) {
            System.out.println("В первом массиве нет четных чисел.");
        } else {
            System.out.print("Второй массив (четные числа): [");
            for (int i = 0; i < evenNumbers.size(); i++) {
                System.out.print(evenNumbers.get(i));
                if (i < evenNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        scanner.close();
    }
}