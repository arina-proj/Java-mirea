package ru.mirea.lab3.Formatting_task3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван Иванов", 75000);
        employees[1] = new Employee("Мария Петрова", 82000);
        employees[2] = new Employee("Алексей Сидоров", 68000);
        employees[3] = new Employee("Елена Козлова", 91000);
        employees[4] = new Employee("Дмитрий Волков", 79000);
        Report.printEmployee(employees);
    }
}
