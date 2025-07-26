package ru.mirea.lab3.Formatting_task3;


public class Report {
    public static void printEmployee(Employee[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.printf("%-1d. Сотрудник: %-18s заработная плата - %,10.2f руб%n",
                    i+1,arr[i].getFullName(),arr[i].getSalary());
        }
    }
}
