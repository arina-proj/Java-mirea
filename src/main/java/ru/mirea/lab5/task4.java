package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/*
для запуска:
cd /Users/arina/IdeaProjects/untitled5
javac src/main/java/ru/mirea/lab5/task4.java
java -cp src/main/java ru.mirea.lab5.task4 /Users/arina/Desktop/p1.png /Users/arina/Desktop/p2.png /Users/arina/Desktop/p3.png /Users/arina/Desktop/p4.png /Users/arina/Desktop/p5.png /Users/arina/Desktop/p6.png /Users/arina/Desktop/p7.png /Users/arina/Desktop/p8.png
 */

public class task4 {
    private static List<ImageIcon> images = new ArrayList<>();
    private static int currentIndex = 0;
    private static JLabel imageLabel;
    private static final int SLIDE_DELAY = 200; // 2 секунды между сменами

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Не указаны пути к изображениям!");
            System.err.println("Использование: java SlideshowApp путь1 путь2 ...");
            System.exit(1);
        }

        // Загрузка всех изображений
        for (String path : args) {
            ImageIcon icon = new ImageIcon(path);
            if (icon.getIconWidth() == -1) {
                System.err.println("Ошибка загрузки: " + path);
                continue;
            }
            images.add(icon);
        }

        if (images.isEmpty()) {
            System.err.println("Не удалось загрузить ни одного изображения!");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Слайд-шоу");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            imageLabel = new JLabel(images.get(0), JLabel.CENTER);
            frame.add(imageLabel, BorderLayout.CENTER);

            // Таймер для смены изображений
            Timer timer = new Timer(SLIDE_DELAY, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentIndex = (currentIndex + 1) % images.size();
                    imageLabel.setIcon(images.get(currentIndex));
                }
            });
            timer.start();

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}