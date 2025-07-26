package ru.mirea.lab3;

public class Shells_task1 {
    public static void main(String[] args) {
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        String strValue = "5.25";
        double primitiveDouble = Double.parseDouble(strValue);

        Double doubleObj = 123.456;
        byte byteValue = doubleObj.byteValue();
        short shortValue = doubleObj.shortValue();
        int intValue = doubleObj.intValue();
        long longValue = doubleObj.longValue();
        float floatValue = doubleObj.floatValue();
        double doubleValue = doubleObj.doubleValue();

        System.out.println("Значение Double: " + doubleObj);

        String d = Double.toString(3.14);
        System.out.println("Строковое представление: " + d);

        // Дополнительный вывод для демонстрации всех преобразований
        System.out.println("\nРезультаты преобразований:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
    }
}