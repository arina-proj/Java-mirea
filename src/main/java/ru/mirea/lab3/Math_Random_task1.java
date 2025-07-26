package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Math_Random_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива для генерации при помощи класса Random: ");
        int size_Random = scanner.nextInt();
        double[] array_Random = new double[size_Random];
        for(int i=0;i<size_Random;i++){
            array_Random[i] = rand.nextDouble();
        }
        System.out.println("Введите размер массива для генерации при помощи метода random(): ");
        int size_random = scanner.nextInt();
        double[] array_random = new double[size_random];
        for(int i=0;i<size_random;i++){
            array_random[i] = rand.nextDouble();
        }
        System.out.println("Массив сгенирированный при помощи класса Random: ");
        printAndSortArray(array_Random);
        System.out.println("Массив сгенирированный при помощи метода random(): ");
        printAndSortArray(array_random);

    }
    public static void printAndSortArray(double[] arr){
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}
