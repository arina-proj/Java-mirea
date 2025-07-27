package ru.mirea.lab6.task13;

import java.util.ArrayList;
import java.util.List;

interface StringBuilderObserver {
    void onStringChanged(String newValue);
}

public class ObservableStringBuilder {
    private final StringBuilder stringBuilder;
    private final List<StringBuilderObserver> observers;

    public ObservableStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.observers = new ArrayList<>();
    }

    public void addObserver(StringBuilderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StringBuilderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        String currentValue = stringBuilder.toString();
        for (StringBuilderObserver observer : observers) {
            observer.onStringChanged(currentValue);
        }
    }


    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder reverse() {
        stringBuilder.reverse();
        notifyObservers();
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}