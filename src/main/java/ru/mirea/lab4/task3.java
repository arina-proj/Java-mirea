package ru.mirea.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


    public class task3{
        public enum Category {
            ELECTRONICS("Электроника"),
            CLOTHING("Одежда"),
            BOOKS("Книги"),
            FOOD("Продукты");

            private final String name;

            Category(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }

        static class Product {
            private String name;
            private double price;
            private Category category;

            public Product(String name, double price, Category category) {
                this.name = name;
                this.price = price;
                this.category = category;
            }

            public String getName() {
                return name;
            }

            public double getPrice() {
                return price;
            }

            public Category getCategory() {
                return category;
            }

            @Override
            public String toString() {
                return String.format("%s - %.2f руб.", name, price);
            }
        }

        static class User {
            private String username;
            private String password;
            private List<Product> cart = new ArrayList<>();

            public User(String username, String password) {
                this.username = username;
                this.password = password;
            }

            public boolean authenticate(String username, String password) {
                return this.username.equals(username) && this.password.equals(password);
            }

            public void addToCart(Product product) {
                cart.add(product);
            }

            public void clearCart() {
                cart.clear();
            }

            public List<Product> getCart() {
                return cart;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            User user = new User("admin", "12345");
            List<Product> products = Arrays.asList(
                    new Product("Смартфон", 29999.99, Category.ELECTRONICS),
                    new Product("Ноутбук", 59999.99, Category.ELECTRONICS),
                    new Product("Футболка", 1999.99, Category.CLOTHING),
                    new Product("Джинсы", 3999.99, Category.CLOTHING),
                    new Product("Java для начинающих", 999.99, Category.BOOKS),
                    new Product("Молоко", 89.99, Category.FOOD)
            );

            boolean authenticated = false;
            while (!authenticated) {
                System.out.print("Введите логин: ");
                String username = scanner.nextLine();
                System.out.print("Введите пароль: ");
                String password = scanner.nextLine();

                if (user.authenticate(username, password)) {
                    authenticated = true;
                    System.out.println("Авторизация успешна!\n");
                } else {
                    System.out.println("Неверный логин или пароль. Попробуйте снова.\n");
                }
            }

            boolean running = true;
            while (running) {
                System.out.println("1. Просмотреть каталоги товаров");
                System.out.println("2. Просмотреть товары в каталоге");
                System.out.println("3. Добавить товар в корзину");
                System.out.println("4. Просмотреть корзину");
                System.out.println("5. Оформить покупку");
                System.out.println("0. Выход");
                System.out.print("Выберите действие: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера

                switch (choice) {
                    case 1:
                        System.out.println("\nДоступные каталоги:");
                        for (Category category : Category.values()) {
                            System.out.println(category.ordinal() + 1 + ". " + category.getName());
                        }
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("\nВыберите каталог:");
                        for (Category category : Category.values()) {
                            System.out.println(category.ordinal() + 1 + ". " + category.getName());
                        }
                        System.out.print("Номер каталога: ");
                        int catChoice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (catChoice >= 0 && catChoice < Category.values().length) {
                            Category selectedCategory = Category.values()[catChoice];
                            System.out.println("\nТовары в каталоге " + selectedCategory.getName() + ":");

                            products.stream()
                                    .filter(p -> p.getCategory() == selectedCategory)
                                    .forEach(System.out::println);
                            System.out.println();
                        } else {
                            System.out.println("Неверный выбор каталога.\n");
                        }
                        break;

                    case 3:
                        System.out.println("\nДоступные товары:");
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println((i + 1) + ". " + products.get(i));
                        }
                        System.out.print("Выберите товар: ");
                        int productChoice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (productChoice >= 0 && productChoice < products.size()) {
                            user.addToCart(products.get(productChoice));
                            System.out.println("Товар добавлен в корзину.\n");
                        } else {
                            System.out.println("Неверный выбор товара.\n");
                        }
                        break;

                    case 4:
                        System.out.println("\nВаша корзина:");
                        if (user.getCart().isEmpty()) {
                            System.out.println("Корзина пуста.\n");
                        } else {
                            user.getCart().forEach(System.out::println);
                            double total = user.getCart().stream()
                                    .mapToDouble(Product::getPrice)
                                    .sum();
                            System.out.printf("Итого: %.2f руб.\n\n", total);
                        }
                        break;

                    case 5:
                        if (user.getCart().isEmpty()) {
                            System.out.println("\nКорзина пуста. Нечего покупать.\n");
                        } else {
                            System.out.println("\nОформление покупки:");
                            user.getCart().forEach(System.out::println);
                            double total = user.getCart().stream()
                                    .mapToDouble(Product::getPrice)
                                    .sum();
                            System.out.printf("Итого к оплате: %.2f руб.\n", total);
                            System.out.println("Покупка оформлена. Спасибо за заказ!\n");
                            user.clearCart();
                        }
                        break;

                    case 0:
                        running = false;
                        System.out.println("До свидания!");
                        break;

                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.\n");
                }
            }

            scanner.close();
        }
    }