package ru.mirea.lab11;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class DateComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущая дата и время: " + currentDateTime.format(dateFormatter));

        System.out.println("Введите дату и время в формате ДД.ММ.ГГГГ ЧЧ:ММ (например, 25.12.2023 15:30):");

        try {
            LocalDateTime userDateTime = LocalDateTime.parse(scanner.nextLine(), dateFormatter);

            if (userDateTime.isAfter(currentDateTime)) {
                System.out.println("Введённая дата находится в БУДУЩЕМ");
            } else if (userDateTime.isBefore(currentDateTime)) {
                System.out.println("Введённая дата находится в ПРОШЛОМ");
            } else {
                System.out.println("Введённая дата СОВПАДАЕТ с текущей!");
            }

            Duration duration = Duration.between(userDateTime, currentDateTime);
            System.out.println("Разница: " +
                    Math.abs(duration.toDays()) + " дней " +
                    Math.abs(duration.toHoursPart()) + " часов " +
                    Math.abs(duration.toMinutesPart()) + " минут");

        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: неверный формат даты!");
        }

        scanner.close();
    }
}