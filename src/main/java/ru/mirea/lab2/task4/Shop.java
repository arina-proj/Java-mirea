package ru.mirea.lab2.task4;

import java.util.Scanner;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    //метод добваления компьютера
    public void addComputer(){
        System.out.println("Добавление нового компьютера: ");
        System.out.print("Бренд: ");
        String brand = scanner.nextLine();

        System.out.print("Модель: ");
        String model = scanner.nextLine();

        System.out.print("Цена: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        computers.add(new Computer(brand, model, price));
        System.out.println("Компьютер добавлен!");
    }
    //удаление компьютера
    public void removeComputer(){
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст!");
            return;
        }

        System.out.println("\nСписок компьютеров:");
        listComputers();

        System.out.print("Введите номер для удаления: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < computers.size()) {
            computers.remove(index);
            System.out.println("Компьютер удалён!");
        } else {
            System.out.println("Неверный номер!");
        }
    }
    //поиск компьютера
    public void searchComputer() {
        System.out.println("\nПоиск компьютера:");
        System.out.print("Введите бренд или модель: ");
        String query = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Computer computer : computers) {
            if (computer.getBrand().toLowerCase().contains(query) ||
                    computer.getModel().toLowerCase().contains(query)) {
                System.out.println("Найден: " + computer);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ничего не найдено!");
        }
    }
    // Вывод списка
    public void listComputers() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст!");
            return;
        }

        System.out.println("\nСписок компьютеров:");
        for (int i = 0; i < computers.size(); i++) {
            System.out.println((i+1) + ". " + computers.get(i));
        }
    }
    public void runShop() {
        while (true) {
            System.out.println("\nМеню магазина:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Показать все компьютеры");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addComputer(); break;
                case 2: removeComputer(); break;
                case 3: searchComputer(); break;
                case 4: listComputers(); break;
                case 5: return;
                default: System.out.println("Неверный выбор!");
            }
        }
    }

    public static void main(String[] args) {
            Shop myShop = new Shop();
            myShop.runShop();
    }

}
