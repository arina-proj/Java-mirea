package ru.mirea.lab3;

import java.util.*;

public class Formatting_task2 {
    private static final Map<String, Double> products = new HashMap<>();
    private static final Formatting_task1 converter = new Formatting_task1();
    static {
        products.put("Ноутбук", 999.99);
        products.put("Смартфон", 699.99);
        products.put("Наушники", 199.99);
        products.put("Планшет", 499.99);
        products.put("Флешка", 19.99);
    }
    private static void displayProducts() {
        System.out.println("\nДоступные товары:");
        int i = 1;
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.printf("%d. %s - %.2f USD%n", i++, entry.getKey(), entry.getValue());
        }
    }
    private static void addProductToCart(List<String> cart, int choice, double currentTotal) {
        String product = getProductName(choice);
        cart.add(product);
        System.out.printf("%s добавлен в корзину. Текущая сумма: %.2f USD%n",
                product, currentTotal + getProductPrice(choice));
    }

    private static String getProductName(int index) {
        return (String)products.keySet().toArray()[index-1];
    }

    private static double getProductPrice(int index) {
        return products.get(getProductName(index));
    }

    private static void displayCart(List<String> cart, double totalUSD) {
        System.out.println("\nВаша корзина:");
        for (String item : cart) {
            System.out.println("- " + item);
        }
        System.out.printf("Итого: %.2f USD%n", totalUSD);
    }

    private static void processPayment(double totalUSD, Scanner scanner) {
        System.out.println("\nДоступные валюты для оплаты:");
        converter.printAvailableCurrencies();

        System.out.print("Выберите валюту для оплаты (код, например EUR): ");
        String currency = scanner.next().toUpperCase();

        try {
            double convertedAmount = converter.convert(totalUSD, "USD", currency);
            System.out.printf("\nИтого к оплате: %.2f %s%n", convertedAmount, currency);
            System.out.println("Спасибо за покупку!");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.printf("Итого к оплате: %.2f USD%n", totalUSD);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cart = new ArrayList<>();
        double totalUSD = 0.0;
        System.out.println("Добро пожаловать в наш интернет-магазин!");

        // Главный цикл выбора товаров
        while (true) {
            displayProducts();

            System.out.println("\n0. Перейти к оплате");
            System.out.print("Выберите товар (номер): ");
            int choice = scanner.nextInt();

            if (choice == 0) break;

            if (choice < 1 || choice > products.size()) {
                System.out.println("Неверный выбор!");
                continue;
            }
            addProductToCart(cart, choice, totalUSD);
            totalUSD += getProductPrice(choice);
        }
        displayCart(cart, totalUSD);
        processPayment(totalUSD, scanner);
    }
}
