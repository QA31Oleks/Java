package org.lessons.Lesson5.OOP;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.defaultMethod();

        Dog dog1 = new Dog();
        dog1.isHasATail();
    }
}
