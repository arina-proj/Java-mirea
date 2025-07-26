package ru.mirea.lab3;

import java.util.HashMap;
import java.util.Map;

public class Formatting_task1 {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.93);
        exchangeRates.put("GBP", 0.80);
        exchangeRates.put("JPY", 151.50);
        exchangeRates.put("RUB", 92.50);
    }

    public static double convert(double amount, String fromCurrency, String toCurrency) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Неизвестная валюта");
        }

        double amountInUSD = amount / exchangeRates.get(fromCurrency);
        return amountInUSD * exchangeRates.get(toCurrency);
    }

    public static void printAvailableCurrencies() {
        System.out.println("Доступные валюты:");
        for (String currency : exchangeRates.keySet()) {
            System.out.println("- " + currency);
        }
    }


}