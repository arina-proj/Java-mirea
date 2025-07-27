package ru.mirea.lab7.task5_6;

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        String testString = "Hello World!";

        System.out.println("Исходная строка: " + testString);
        System.out.println("Количество символов: " + processor.countCharacters(testString));
        System.out.println("Символы на нечетных позициях: " + processor.getOddPositionCharacters(testString));
        System.out.println("Инвертированная строка: " + processor.reverseString(testString));
    }
}