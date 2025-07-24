package ru.mirea.lab1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите элементы массива: ");
        for(int i=0; i<size;i++){
            numbers[i] = scanner.nextInt();
        }
        //сумма при помощи цикла do-while
        int sum_do_while = 0;
        int i =0;
        do {
            sum_do_while += numbers[i];
            i++;
        }while(i<size);
        //сумма при помощи цикла while
        int sum_while = 0;
        i =0;
        while(i<size){
            sum_while += numbers[i];
            i++;
        }
        //нахождение минимума и максимума
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(i=0; i<size; i++){
            if (numbers[i]<min) min = numbers[i];
            if (numbers[i]>max) max = numbers[i];
        }

        System.out.println("Сумма при помощи цикла do-while = " + sum_do_while);
        System.out.println("Сумма при помощи цикла while = " + sum_while);
        System.out.println("Минимальный элемент = " + min + ", максимальный элемент = " + max);
    }
}
