package ru.mirea.lab6.task6_7_8_9;

public class Book implements IPrintable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title + ", Автор: " + author);
    }
    public static void main(String[] args) {
        IPrintable[] printables = new IPrintable[] {
                new Book("Война и мир", "Лев Толстой"),
                new Magazine("Наука и техника", 42),
                new Book("Преступление и наказание", "Фёдор Достоевский"),
                new Magazine("Космос", 10),
                new Shop("Книжный мир", "ул. Пушкина, 10")
        };

        for (IPrintable item : printables) {
            item.print();
        }
    }
}
