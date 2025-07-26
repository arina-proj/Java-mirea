package ru.mirea.lab1;
/*
git add .
git commit -m "Ваш комментарий"
git pull origin main
git push origin main
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum = 0;
        System.out.println("Введите элеметны массива: ");
        for(int i=0; i< size; i++){
            numbers[i] = scanner.nextInt();
            sum+= numbers[i];
        }
        System.out.println("Сумма чисел = " + sum + "\nСреднее арифметическое = " + (double)(sum/size));


    }
}