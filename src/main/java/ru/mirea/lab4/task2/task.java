package ru.mirea.lab4.task2;

public class task {
    public enum Size{
        XXS(32){
            @Override
            public String getDescription(){
                return "Детский размер";
            }
        },
        XS(34),
        S(36),
        M(38),
        L(40);
        public String getDescription(){
            return "Взрослый размер";
        }
        public final int euroSize;

        public int getEuroSize() {
            return euroSize;
        }

        Size(int euroSize) {
            this.euroSize = euroSize;
        }
    }
    public static void main(String[] args) {
        // Создаем футболку детского размера
        TShirt kidsShirt = new TShirt(Size.XXS, 999.99, "синий");
        kidsShirt.dressMan();
        kidsShirt.dressWoman();

        // Создаем футболку взрослого размера
        TShirt adultShirt = new TShirt(Size.L, 1999.99, "черный");
        adultShirt.dressMan();
        adultShirt.dressWoman();

        // Выводим информацию о всех размерах
        System.out.println("\nДоступные размеры:");
        for (Size size : Size.values()) {
            System.out.printf("%s: EU %d, %s%n",
                    size, size.getEuroSize(), size.getDescription());
        }
    }
}
