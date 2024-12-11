package ru.job4j.pojo;

import java.time.LocalDateTime;

public class Student {
    private String lastFirsPatronName;
    private String group;
    private LocalDateTime dateOfReceipt;

    public String getLastFirsPatronName() {
        return lastFirsPatronName;
    }

    public void setLastFirsPatronName(String lastFirsPatronName) {
        this.lastFirsPatronName = lastFirsPatronName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDateTime getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(LocalDateTime dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }
}
