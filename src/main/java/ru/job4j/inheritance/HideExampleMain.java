package ru.job4j.inheritance;

public class HideExampleMain {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        Cat.staticInvoke();
        Animal other = null;
        other.staticInvoke();
        Cat kitty = new Cat();
        kitty.staticInvoke();
    }
}
