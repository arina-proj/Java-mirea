package ru.mirea.lab11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Student {
    private String firstName;
    private String lastName;
    private int course;
    private String group;
    private double gpa;
    private LocalDate birthDate;

    public Student(String firstName, String lastName, int course, String group, double gpa, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.birthDate = birthDate;
    }

    public String getFormattedBirthDate(String formatStyle) {
        DateTimeFormatter formatter;
        switch (formatStyle.toLowerCase()) {
            case "short":
                formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
                break;
            case "medium":
                formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
                break;
            case "full":
                formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
                break;
            case "long":
                formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
                break;
            default:
                formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        }
        return birthDate.format(formatter);
    }

    @Override
    public String toString() {
        return String.format("%s %s (Группа: %s, Курс: %d, Средний балл: %.1f, Дата рождения: %s)",
                lastName, firstName, group, course, gpa,
                getFormattedBirthDate("medium"));  // Средний формат по умолчанию
    }

    // Пример использования
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", 2, "ИВТ-202", 4.5,
                LocalDate.of(2000, 5, 15));

        System.out.println(student);
        System.out.println("Короткий формат: " + student.getFormattedBirthDate("short"));
        System.out.println("Полный формат: " + student.getFormattedBirthDate("full"));
    }
}