package ru.mirea.lab6.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ru.mirea.lab6.task10.Shop.scanner;

interface ComputerInput {
    static Computer inputComputer() {
        System.out.println("\n=== Добавление нового компьютера ===");

        // Ввод бренда компьютера
        ComputerBrand brand = inputComputerBrand();

        // Ввод модели
        System.out.print("Введите модель компьютера: ");
        String model = scanner.nextLine();

        // Ввод процессора
        Processor processor = inputProcessor();

        // Ввод памяти
        Memory memory = inputMemory();

        // Ввод монитора
        Monitor monitor = inputMonitor();

        // Создание и добавление компьютера
        System.out.println("Компьютер успешно добавлен!");
        return new Computer(brand, model, processor, memory, monitor);
    }
    static ComputerBrand inputComputerBrand() {
        while (true) {
            try {
                System.out.println("Доступные бренды:");
                for (ComputerBrand brand : ComputerBrand.values()) {
                    System.out.println("- " + brand);
                }
                System.out.print("Выберите бренд компьютера: ");
                return ComputerBrand.valueOf(scanner.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: такого бренда нет в списке. Попробуйте еще раз.");
            }
        }
    }
    static Processor inputProcessor() {
        System.out.println("\n-- Ввод данных процессора --");
        ProcessorBrand brand;
        while (true) {
            try {
                System.out.println("Доступные бренды процессоров:");
                for (ProcessorBrand pb : ProcessorBrand.values()) {
                    System.out.println("- " + pb);
                }
                System.out.print("Выберите бренд процессора: ");
                brand = ProcessorBrand.valueOf(scanner.nextLine().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: такого бренда нет в списке. Попробуйте еще раз.");
            }
        }
        System.out.print("Введите модель процессора: ");
        String model = scanner.nextLine();
        // Тактовая частота
        double clockSpeed = inputDouble("Введите базовую частоту процессора (ГГц): ", 1.0, 6.0);
        // Количество ядер
        int cores = inputInt("Введите количество ядер: ", 1, 128);
        return new Processor(brand, model, clockSpeed, cores);
    }
    static Memory inputMemory() {
        System.out.println("\n-- Ввод данных памяти --");
        MemoryType type;
        while (true) {
            try {
                System.out.println("Доступные типы памяти:");
                for (MemoryType mt : MemoryType.values()) {
                    System.out.println("- " + mt);
                }
                System.out.print("Выберите тип памяти: ");
                type = MemoryType.valueOf(scanner.nextLine().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: такого типа нет в списке. Попробуйте еще раз.");
            }
        }
        int size = inputInt("Введите объем памяти (ГБ): ", 1, 256);
        int speed = inputInt("Введите частоту памяти (МГц): ", 1600, 10000);
        return new Memory(type, size, speed);
    }
    static Monitor inputMonitor() {
        System.out.println("\n-- Ввод данных монитора --");
        System.out.print("Введите модель монитора: ");
        String model = scanner.nextLine();
        MonitorType type;
        while (true) {
            try {
                System.out.println("Доступные типы мониторов:");
                for (MonitorType mt : MonitorType.values()) {
                    System.out.println("- " + mt);
                }
                System.out.print("Выберите тип монитора: ");
                type = MonitorType.valueOf(scanner.nextLine().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: такого типа нет в списке. Попробуйте еще раз.");
            }
        }
        double size = inputDouble("Введите диагональ монитора (дюймы): ", 10.0, 50.0);
        int width = inputInt("Введите ширину экрана (пиксели): ", 800, 8000);
        int height = inputInt("Введите высоту экрана (пиксели): ", 600, 8000);
        return new Monitor(model, type, size, width, height);
    }

    static int inputInt(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.printf("Ошибка: введите число от %d до %d\n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число");
            }
        }
    }
    static double inputDouble(String prompt, double min, double max) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine());
                if (value >= min && value <= max) {
                    return value;
                }
                System.out.printf("Ошибка: введите число от %.1f до %.1f\n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число");
            }
        }
    }
}

public class Shop implements ComputerInput {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Computer> computers = new ArrayList<Computer>();
    public static void initializeComputers() {
        Computer computer1 = new Computer(
                ComputerBrand.APPLE,
                "Mac Pro",
                new Processor(ProcessorBrand.INTEL, "Core i7-12700K", 3.6, 12),
                new Memory(MemoryType.DDR4, 32, 3200),
                new Monitor("ProDisplay XDR", MonitorType.IPS, 27.0, 5120, 2880)
        );
        Computer computer2 = new Computer(
                ComputerBrand.CUSTOM,
                "Ultra Gaming Rig",
                new Processor(ProcessorBrand.AMD, "Ryzen 9 7950X", 4.5, 16),
                new Memory(MemoryType.DDR5, 64, 5200),
                new Monitor("Predator X45", MonitorType.OLED, 45.0, 3440, 1440)
        );
        Computer computer3 = new Computer(
                ComputerBrand.DELL,
                "OptiPlex 3090",
                new Processor(ProcessorBrand.INTEL, "Core i3-12100", 3.3, 4),
                new Memory(MemoryType.DDR4, 8, 2666),
                new Monitor("P2219H", MonitorType.TN, 21.5, 1920, 1080)
        );
        Computer computer4 = new Computer(
                ComputerBrand.HP,
                "Z8 Fury G5",
                new Processor(ProcessorBrand.INTEL, "Xeon W9-3495X", 4.8, 56),
                new Memory(MemoryType.DDR5, 128, 4800),
                new Monitor("DreamColor Z32x", MonitorType.IPS, 31.5, 3840, 2160)
        );
        Computer computer5 = new Computer(
                ComputerBrand.LENOVO,
                "ThinkCentre M90n Nano",
                new Processor(ProcessorBrand.INTEL, "Core i5-1230U", 3.3, 10),
                new Memory(MemoryType.DDR4, 16, 3200),
                new Monitor("ThinkVision P27h-20", MonitorType.IPS, 27.0, 2560, 1440)
        );
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
    }
    public static void findComputer() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст. Нет компьютеров для поиска.");
            return;
        }

        System.out.println("\n=== Поиск и удаление компьютера ===");
        System.out.println("Выберите критерий поиска:");
        System.out.println("1. По бренду компьютера");
        System.out.println("2. По модели процессора");
        System.out.println("3. По объему памяти");
        System.out.println("4. По модели монитора");
        System.out.print("Ваш выбор: ");

        int choice = ComputerInput.inputInt("", 1, 4);

        List<Computer> foundComputers = new ArrayList<>();

        switch (choice) {
            case 1 -> {
                ComputerBrand brand = ComputerInput.inputComputerBrand();
                foundComputers = computers.stream()
                        .filter(c -> c.getBrand() == brand)
                        .toList();
            }
            case 2 -> {
                System.out.print("Введите модель процессора для поиска: ");
                String processorModel = scanner.nextLine();
                foundComputers = computers.stream()
                        .filter(c -> c.getProcessor().getModel().equalsIgnoreCase(processorModel))
                        .toList();
            }
            case 3 -> {
                int memorySize = ComputerInput.inputInt("Введите минимальный объем памяти (ГБ): ", 1, 256);
                foundComputers = computers.stream()
                        .filter(c -> c.getMemory().getSize() >= memorySize)
                        .toList();
            }
            case 4 -> {
                System.out.print("Введите модель монитора для поиска: ");
                String monitorModel = scanner.nextLine();
                foundComputers = computers.stream()
                        .filter(c -> c.getMonitor().getModel().equalsIgnoreCase(monitorModel))
                        .toList();
            }
        }

        if (foundComputers.isEmpty()) {
            System.out.println("Компьютеры по заданным критериям не найдены.");
            return;
        }

        System.out.println("\nНайдены следующие компьютеры:");
        for (Computer foundComputer : foundComputers) foundComputer.displaySpecifications();
    }
    public static void removeByIndex() {
        listAllComputers();
        int index = ComputerInput.inputInt("Введите номер компьютера для удаления: ", 1, computers.size()) - 1;
        Computer removed = computers.remove(index);
        System.out.println("Удален компьютер: " + removed.getBrand() + " " + removed.getModel());
    }
    public static void listAllComputers(){
        for (Computer computer : computers) {
            computer.displaySpecifications();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш магазин!");
        initializeComputers();
        while (true) {
            System.out.println("\n=== Меню управления магазином ===");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Показать все компьютеры");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1 -> computers.add(ComputerInput.inputComputer());
                case 2 -> removeByIndex();
                case 3 -> findComputer();
                case 4 -> listAllComputers();
                case 5 -> {
                    System.out.println("Выход из программы.");
                    return;
                }
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
