package ru.mirea.lab5.task2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("20 Random Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            Generation panel = new Generation();
            frame.add(panel);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}