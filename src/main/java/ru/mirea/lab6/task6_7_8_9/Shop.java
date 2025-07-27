package ru.mirea.lab6.task6_7_8_9;

public class Shop implements IPrintable {
    private String name;
    private String address;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void print() {
        System.out.println("Магазин: " + name + ", Адрес: " + address);
    }
}
