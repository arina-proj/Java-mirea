package ru.mirea.lab2;

import java.util.Scanner;

public class task8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int size = scanner.nextInt();
            String[] array = new String[size];
            System.out.println("Введите элеметны массива: ");
            for(int i=0; i< size; i++){
                array[i] = scanner.nextLine();
            }
            System.out.println("Исходный массив: " + java.util.Arrays.toString(array));


            reverseArray(array);

            System.out.println("Перевёрнутый массив: " + java.util.Arrays.toString(array));
        }

        public static void reverseArray(String[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                // Меняем местами элементы
                String temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // Сдвигаем указатели
                left++;
                right--;
            }
        }

}
