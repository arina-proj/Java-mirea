package ru.mirea.lab2.task5;
import java.util.Scanner;
public class DogKennels {
    private Dog[] dogs;
    private int count;
    Scanner scanner = new Scanner(System.in);

    public DogKennels(int capacity) {
        dogs = new Dog[capacity];
        count = 0;
    }

    // Добавление собаки с вводом данных
    public void addDog() {
        if (count >= dogs.length) {
            System.out.println("Питомник переполнен!");
            return;
        }

        System.out.print("Введите кличку собаки: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст собаки: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        dogs[count++] = new Dog(name, age);
        System.out.println("Собака добавлена!");
    }

    // Вывод всех собак
    public void listDogs() {
        if (count == 0) {
            System.out.println("Питомник пуст!");
            return;
        }

        System.out.println("\nСписок собак в питомнике:");
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + ". " + dogs[i]);
        }
    }

    // Тестовый метод
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вместимость питомника: ");
        int size = scanner.nextInt();
        DogKennels kennel = new DogKennels(size);

        while (true) {
            System.out.println("\nМеню питомника:");
            System.out.println("1. Добавить собаку");
            System.out.println("2. Показать всех собак");
            System.out.println("3. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    kennel.addDog();
                    break;
                case 2:
                    kennel.listDogs();
                    break;
                case 3:
                    System.out.println("Выход из программы...");
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }
}
