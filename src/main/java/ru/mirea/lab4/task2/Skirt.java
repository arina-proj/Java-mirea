package ru.mirea.lab4.task2;

public class Skirt extends AClothes implements IWomenClothing{
    @Override
    public void dressWoman() {
        System.out.printf("Юбка: размер %s, цвет %s, цена %.2f руб.%n",
                getSize(), getColor(), getPrice());
    }

    public Skirt(task.Size size, double price, String color) {
        super(size, price, color);
    }


}
