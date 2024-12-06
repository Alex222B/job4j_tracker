package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() { }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность: " + this.active);
        System.out.println("Статус: " + this.status);
        System.out.println("Сообщение: " + this.message);
    }

    public static void main(String[] args) {
        Error err1 = new Error();
        Error err2 = new Error(true, 2, "Ошибка2");
        System.out.println();
        System.out.println("Объект с дефолтным конструктором:");
        err1.printInfo();
        System.out.println();
        System.out.println("Объект, где применен конструктор с параметрами:");
        err2.printInfo();

    }
}
