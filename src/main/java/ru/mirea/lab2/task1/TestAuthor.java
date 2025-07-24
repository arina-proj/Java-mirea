package ru.mirea.lab2.task1;

public class TestAuthor {
    public static void main(String args[]) {
        Author author = new Author("Лев Толстой", "wfm@chiu.cdc", 'M');
        System.out.println("Имя автора: " + author.getName());
        System.out.println("Email автора: "+ author.getEmail());
        author.setEmail("wfhbbuwe@suc.sdc");
        System.out.println("Новый email автора: "+ author.getEmail());
        System.out.println("Гендер автора: "+ author.getGender());
        System.out.println(author.toString());

    }
}
