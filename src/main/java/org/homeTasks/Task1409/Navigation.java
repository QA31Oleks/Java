package org.homeTasks.Task1409;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) {
        String[] url1 = {
                "https://www.google.com/",
                "https://auto.ria.com/",
                "https://rozetka.com.ua/ua/",
                "https://www.facebook.com/",
                "https://www.youtube.com/",
                "https://allo.ua/"};
        String[] title = {
                "Google",
                "AUTO.RIA™ — Автобазар №1. Купити і продати авто легко як ніколи",
                "Інтернет-магазин ROZETKA™: офіційний сайт найпопулярнішого онлайн-гіпермаркету в Україні",
                "Facebook - log in or sign up",
                "YouTube",
                "АЛЛО - національний маркетплейс із найширшим асортиментом"};

        WebDriver webDriver = new ChromeDriver();
        WebDriver.Navigation navigation = webDriver.navigate();

        for (int i = 0; i < url1.length; i++) {
            navigation.to(url1[i]);
            if (webDriver.getTitle().equals(title[i])) {
                System.out.printf("%s Ok%n", title[i]);
            } else {
                System.out.printf("Title ERROR%n");
                System.out.printf("Expected title = %s%n", title[i]);
                System.out.printf("Actual title = %s%n", webDriver.getTitle());
            }
            System.out.println("=========================");
        }

        for (int j = url1.length; j > 0; j--) {
            if (webDriver.getCurrentUrl().equals(url1[j - 1])) {
                System.out.println("URL " + url1[j - 1] + " Ok");
            } else {
                System.out.println("URL ERROR");
                System.out.println("Expected url = " + url1[j - 1]);
                System.out.println("Actual url = " + webDriver.getCurrentUrl());
            }
            System.out.println("=========================");
            navigation.back();
        }

        for (int i = 0; i < url1.length; i++) {
            navigation.forward();
        }

        webDriver.quit();
    }
}
