package ru.job4j.pojo;

public class Book {
    private String name;
    private int numberOfPages;

    public Book(String name, int numPages) {
        this.name = name;
        this.numberOfPages = numPages;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
