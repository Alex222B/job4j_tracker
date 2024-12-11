package ru.job4j.pojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class College {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        Student student = new Student();
        student.setLastFirsPatronName("Иванов Иван Иванович");
        student.setGroup("ABB2021");
        student.setDateOfReceipt(LocalDateTime.now());
        System.out.println("Студент:");
        System.out.println("ФИО: " + student.getLastFirsPatronName());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Дата поступления:" + student.getDateOfReceipt().format(formatter));
    }
}
