package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book tempBook;
        Book[] books = new Book[4];
        books[0] = new Book("firstBook", 500);
        books[1] = new Book("secondBook", 700);
        books[2] = new Book("Clean code", 800);
        books[3] = new Book("fourthBook", 1000);
        System.out.println("Исходная библиотека книг");
        for (int index = 0; index < books.length; index++) {
            tempBook = books[index];
            System.out.printf("Книга %d : %s - %dстр%n", index, tempBook.getName(), tempBook.getNumberOfPages());
        }
        System.out.println("После смены 0 и 3 позиций");
        tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        for (int index = 0; index < books.length; index++) {
            tempBook = books[index];
            System.out.printf("Книга %d : %s - %dстр%n", index, tempBook.getName(), tempBook.getNumberOfPages());
        }
        System.out.println("Только книги Clean code");
        for (int index = 0; index < books.length; index++) {
            tempBook = books[index];
            if (tempBook.getName().equals("Clean code")) {
                System.out.printf("Книга %d : %s - %dстр%n", index, tempBook.getName(), tempBook.getNumberOfPages());
            }
        }

    }
}
