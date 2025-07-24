package ru.mirea.lab2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 1 || n > 10) {
            System.out.println("Количество игроков должно быть от 1 до 10");
            return;
        }

        List<String> deck = createDeck();
        // Перетасовываем колоду
        Collections.shuffle(deck);
        dealCards(deck, n);
    }

    private static List<String> createDeck() {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + suit);
            }
        }
        return deck;
    }

    private static void dealCards(List<String> deck, int players) {
        System.out.println("\nРезультат раздачи:");
        for (int i = 0; i < players; i++) {
            System.out.println("\nИгрок " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck.get(i * 5 + j));
            }
        }
    }
}