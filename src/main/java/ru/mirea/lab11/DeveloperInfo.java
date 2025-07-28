package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DeveloperInfo {
    public static void main(String[] args) throws InterruptedException { //Может выбросить InterruptedException
        String developerName = "Иванов Иван Иванович";
        Date startDate = new Date();
        TimeUnit.SECONDS.sleep(2);
        Date endDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Разработчик: " + developerName);
        System.out.println("Дата и время получения задания: " + dateFormat.format(startDate));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(endDate));
    }
}
