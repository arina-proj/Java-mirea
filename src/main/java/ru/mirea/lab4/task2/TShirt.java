package ru.mirea.lab4.task2;

public class TShirt extends AClothes implements IMenClothing, IWomenClothing{

    @Override
    public void dressMan() {
        System.out.printf("Мужские штаны: размер %s, цвет %s, цена %.2f руб.%n",
                getSize(), getColor(), getPrice());
    }

    @Override
    public void dressWoman() {
        System.out.printf("Женские штаны: размер %s, цвет %s, цена %.2f руб.%n",
                getSize(), getColor(), getPrice());
    }

    public TShirt(task.Size size, double price, String color) {
        super(size, price, color);
    }

}
