package ru.mirea.lab5.task2;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

class Generation extends JPanel {
    private static ArrayList<AShape> shapes;
    private Random random;

    public Generation() {
        shapes = new ArrayList<>();
        random = new Random();

        // Создаем 20 случайных фигур
        for (int i = 0; i < 20; i++) {
            Color color = new Color(
                    random.nextInt(256),
                    random.nextInt(256),
                    random.nextInt(256)
            );

            int x = random.nextInt(700);
            int y = random.nextInt(500);

            switch (random.nextInt(3)) {
                case 0:
                    shapes.add(new Circle(color, x, y,  random.nextInt(50)));
                    break;
                case 1:
                    shapes.add(new Rectangle(color, x, y,
                            random.nextInt(100),
                             random.nextInt(100)));
                    break;
                case 2:
                    shapes.add(new Triangle(color, x, y,  random.nextInt(80)));
                    break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (AShape shape : shapes) {
            shape.draw(g);
        }
    }}