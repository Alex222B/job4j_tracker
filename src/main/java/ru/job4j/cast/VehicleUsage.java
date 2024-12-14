package ru.job4j.cast;

public class VehicleUsage {

    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle[] transport = new Vehicle[]{bus, plane, train};
        for (Vehicle vehicle : transport) {
            vehicle.move();
        }
    }
}

