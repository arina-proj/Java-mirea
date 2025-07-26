package ru.mirea.lab4;

public class task1 {
    public enum Season{
        WINTER(-11, "Морозно, выпадает снег, реки и озёра покрываются льдом"),
        SPRING(8, "Тает снег, с крыш капает вода, бегут ручьи"),
        SUMMER(22, "В это время года во многих регионах России становится жарко"){
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN(7, "Погода осенью пасмурная, часто идут холодные дожди.");

        public int getTemp() {
            return temp;
        }

        public String getDesc() {
            return desc;
        }

        private final int temp;
        private final String desc;

        Season(int temp, String desc) {
            this.temp = temp;
            this.desc = desc;
        }
        public static void printSeasonLove(Season season) {
            switch (season) {
                case WINTER:
                    System.out.println("Я люблю зиму");
                    break;
                case SPRING:
                    System.out.println("Я люблю весну");
                    break;
                case SUMMER:
                    System.out.println("Я люблю лето");
                    break;
                case AUTUMN:
                    System.out.println("Я люблю осень");
                    break;
            }
        }
        public String getDescription(){
            return "Холодное время года";
        }

    }


    public static void main(String[] args) {
        Season fav = Season.SPRING;
        System.out.printf("Мое любимое время года - %s. %s. Средняя температура - %d градусов%n", fav, fav.desc, fav.temp);
        System.out.println("Все времена года: ");
        for(Season seas:Season.values()){
            System.out.printf("%s: средняя температура %d°C, %s%n",
                    seas,
                    seas.getTemp(),
                    seas.getDesc());
        }
    }

}
