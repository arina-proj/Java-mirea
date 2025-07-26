package ru.mirea.lab5;

import javax.swing.*;

/*
для запуска:
cd /Users/arina/IdeaProjects/untitled5
javac src/main/java/ru/mirea/lab5/task3.java
java -cp src/main/java ru.mirea.lab5.task3 /Users/arina/Desktop/picture.jpg
 */

public class task3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Не указан путь к изображению!");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Просмотр изображения");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            try{
                ImageIcon imageIcon = new ImageIcon(args[0]);
                if (imageIcon.getIconWidth() == -1) { // возвращает: ширину изображения в пикселях / -1 при ошибке
                    throw new Exception("Не удалось загрузить изображение: " + args[0]);
                }

                frame.add(new JLabel(imageIcon));
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }catch (Exception e){
                System.out.println("Ошибка - "+ e);
            }
        });
    }
}


