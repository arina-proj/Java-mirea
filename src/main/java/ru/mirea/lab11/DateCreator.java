package ru.mirea.lab11;

import java.util.*;
import java.text.*;

public class DateCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате <Год> <Месяц> <Число> (например: 2006 10 25):");
        int year = scanner.nextInt() - 1900; // Для Date год отсчитывается с 1900
        int month = scanner.nextInt() - 1;   // Месяцы 0-11
        int day = scanner.nextInt();


        System.out.println("Введите время в формате <Часы> <Минуты> (например: 15 30):");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();


        Date date = new Date(year, month, day, hours, minutes);
        Calendar calendar = new GregorianCalendar(year + 1900, month, day, hours, minutes);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.println("\nСозданные объекты:");
        System.out.println("Date: " + dateFormat.format(date));
        System.out.println("Calendar: " + dateFormat.format(calendar.getTime()));

        scanner.close();
    }
}