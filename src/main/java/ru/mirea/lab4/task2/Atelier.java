package ru.mirea.lab4.task2;

public class Atelier {
    public void dressWomen(AClothes[] clothes) {
        System.out.println("\n=== Женская одежда ===");
        for (AClothes item : clothes) {
            if (item instanceof IWomenClothing) {
                ((IWomenClothing) item).dressWoman();
            }
        }
    }

    public void dressMan(AClothes[] clothes) {
        System.out.println("\n=== Мужская одежда ===");
        for (AClothes item : clothes) {
            if (item instanceof IMenClothing) {
                ((IMenClothing) item).dressMan();
            }
        }
    }
}
