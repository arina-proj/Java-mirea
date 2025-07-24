package ru.mirea.lab2.task7;

public class BookTest {
    public static void main(String[] args) {
        // Создаем книги
        Book book1 = new Book("Лев Толстой", "Война и мир", 1869);
        Book book2 = new Book("Фёдор Достоевский", "Преступление и наказание", 1866);
        Book book3 = new Book("Антон Чехов", "Вишнёвый сад", 1904);
        Book book4 = new Book("Иван Тургенев", "Отцы и дети", 1862);

        // Создаем книжную полку
        Bookshelf shelf = new Bookshelf(10);
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);
        shelf.addBook(book4);

        // Тестируем методы
        shelf.displayBooks();

        System.out.println("\nСамая ранняя книга: " + shelf.getEarliestBook());
        System.out.println("Самая поздняя книга: " + shelf.getLatestBook());

        System.out.println("\nСортируем книги по году издания...");
        shelf.sortByYear();
        shelf.displayBooks();
    }
}
