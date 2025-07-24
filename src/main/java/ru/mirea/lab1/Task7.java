package ru.mirea.lab1;
import java.util.Scanner;

public class Task7 {
    //метод для вычисления факторила
    public static long calculateFactorial(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }
        long res = 1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
    //метод для тестирования
    public static void testFactorial(){
        System.out.println("Тестирование результатов работы методов:");
        System.out.printf("%5s %15s %15s%n", "Число", "Ожидаемый", "Полученный");
        int[] testNumbers = {0, 1, 5, 10, 12};
        long[] expectedResults = {1, 1, 120, 3628800, 479001600};
        for (int i = 0; i < testNumbers.length; i++) {
            long actual = calculateFactorial(testNumbers[i]);
            System.out.printf("%5d %,15d %,15d %s%n",
                    testNumbers[i], expectedResults[i], actual,
                    (expectedResults[i] == actual) ? "✓" : "✗");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();
        try{
            long factorial = calculateFactorial(number);
            System.out.printf("Факториал числа %d равен %,d%n", number, factorial);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        testFactorial();
        scanner.close();

    }
}
