package ru.mirea.lab6.task3_4;

public class PriceableDemo {
    public static void main(String[] args) {
        IPriceable laptop = new Product("Laptop", 999.99);
        IPriceable repair = new Service("Computer repair", 50.0, 2.5);

        printPrice(laptop);
        printPrice(repair);
    }
    public static void printPrice(IPriceable item) {
        System.out.printf("%s price: $%.2f%n",
                item.getClass().getSimpleName(), item.getPrice());
    }
}