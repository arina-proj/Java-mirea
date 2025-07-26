package ru.mirea.lab4.task2;

public class Tie extends AClothes implements IMenClothing{
    @Override
    public void dressMan() {
        System.out.printf("Галстук: размер %s, цвет %s, цена %.2f руб.%n",
                getSize(), getColor(), getPrice());
    }

    public Tie(task.Size size, double price, String color) {
        super(size, price, color);
    }


}
