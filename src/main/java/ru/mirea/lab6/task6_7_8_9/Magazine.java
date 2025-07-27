package ru.mirea.lab6.task6_7_8_9;

public class Magazine implements IPrintable {
    private String title;
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title + ", Номер: " + issueNumber);
    }
}
