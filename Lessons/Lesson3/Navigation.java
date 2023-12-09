package org.Lessons.Lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) {
        String[] url1 = {"https://www.google.com/", "https://auto.ria.com/", "https://rozetka.com.ua/ua/"};
        String[] title = {"Google", "AUTO.RIA™ — Автобазар №1. Купити і продати авто легко як ніколи", "Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого онлайн-гіпермаркету в Україні"};

        WebDriver webDriver = new ChromeDriver();
        WebDriver.Navigation navigation = webDriver.navigate();

        for (int i = 0; i < url1.length; i++) {
            navigation.to(url1[i]);


            if (webDriver.getTitle().equals(title[i])) {
                System.out.println("Title " + title[i] + " Ok");
            } else {
                System.out.println("Title ERROR");
                System.out.println("Expected title = " + title[i]);
                System.out.println("Actual title = " + webDriver.getTitle());
                }
            System.out.println("* * * * * * * * * * * *");

            if (webDriver.getCurrentUrl().equals(url1[i])) {
                System.out.println("URL " + url1[i] + " Ok");

            } else {
                System.out.println("URL ERROR");
                System.out.println("Expected url = " + url1[i]);
                System.out.println("Actual url = " + webDriver.getCurrentUrl());
            }
            System.out.println("=========================");
        }
        navigation.back();
        navigation.back();

        navigation.forward();
        navigation.forward();

        navigation.refresh(); // reload page

        webDriver.quit();
    }
}
