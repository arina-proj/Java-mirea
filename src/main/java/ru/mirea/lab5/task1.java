package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

/*
одна кнопка JButton подписана “AC Milan”
• другая JButton подписана “Real Madrid”
• надпись JLabel содержит текст “Result: 0 X 0”
• надпись JLabel содержит текст “Last Scorer: N/A”
• надпись Label содержит текст “Winner: DRAW”
*/
public class task1 {
    static String lastScorer = "N/A";
    String winner = "DRAW";
    static int milan = 0;
    static int madrid = 0;
    public static void main(String args[]) {


        JFrame frame = new JFrame("Match Results");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JPanel panel1= new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JPanel panel2= new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));


        panel1.setPreferredSize( new Dimension(200,300));
        panel1.setBorder(BorderFactory.createEmptyBorder(40, 20, 20, 20));

        panel2.setPreferredSize( new Dimension(200,300));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");

        button1.setPreferredSize(new Dimension(150, 60));

        button1.setOpaque(true);
        button1.setBorderPainted(false);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.RED);
        button1.setFocusPainted(false); // убирает стандартную рамку фокуса


        button2.setPreferredSize(new Dimension(150, 60));
        button2.setOpaque(true); // для отображения цвета
        button2.setBorderPainted(false); // для отображения цвета
        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.WHITE);

        panel1.add(button1);
        panel1.add(button2);

        JLabel label1 = new JLabel("Result: 0 X 0");
        JLabel label2 = new JLabel("Last Scorer: N/A");
        JLabel label3 = new JLabel("Winner: DRAW");
        panel2.add(label1);
        panel2.add(label2);
        panel2.add(label3);

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        button1.addActionListener(e -> {
            task1.milan++;
            task1.lastScorer = "AC Milan";
            updateLabels(label1, label2, label3, milan, madrid, lastScorer);
        });

        button2.addActionListener(e -> {
            task1.madrid++;
            lastScorer = "Real Madrid";
            updateLabels(label1, label2, label3, milan, madrid, lastScorer);
        });

        frame.setLocationRelativeTo(null); //центрирование окна
        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }

    private static void updateLabels(JLabel result, JLabel scorer, JLabel winner,
                                     int milan, int madrid, String last) {
        result.setText("Result: " + milan + " X " + madrid);
        scorer.setText("Last Scorer: " + last);

        if (milan > madrid) {
            winner.setText("Winner: AC Milan");
        } else if (madrid > milan) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }
}
