package ru.job4j.polymorphism;

public class Bus implements Transport {

    private int count;
    private int fuel;

    @Override
    public void move() {
        if (fuel > 0) {
            System.out.println("Автобус едет.");
        } else {
            System.out.println("Автобус остановлен - нет топлива.");
        }
    }

    @Override
    public void passengers(int count) {
        this.count = count;
    }

    @Override
    public int refuel(int fuel) {
        int price = 2;
        this.fuel += fuel;
        return price * fuel;
    }
}
