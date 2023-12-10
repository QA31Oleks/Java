package org.Lessons.Lesson5.OOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.defaultMethod();

        Dog dog1 = new Dog();
        dog1.isHasATail();
    }
}
