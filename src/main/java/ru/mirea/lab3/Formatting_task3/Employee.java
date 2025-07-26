package ru.mirea.lab3.Formatting_task3;

public class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
