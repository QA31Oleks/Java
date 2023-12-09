package org.Lessons.Lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationPractice {
    public static void main(String[] args) {
        String[] url1 = {"https://itstep.dp.ua/about-academy/", "https://itstep.dp.ua/ru/contacts", "https://itstep.dp.ua/ru/events", "https://itstep.dp.ua/ru/qa_course"};
        String[] title = {"ᐅ Про Академію", "ᐅ Контакты", "ᐅ Мероприятия", "Курсы QA тестировщиков в Днепре | Обучение QA тестированию ПО с нуля"};

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
