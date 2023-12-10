package org.Lessons.Lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
    public static void main(String[] args) {
        String url1 = "https://www.google.com/";
        String title = "Google";

        String url2 = "";

        WebDriver webDriver = new ChromeDriver();
        webDriver.get(url1);

        if (webDriver.getTitle().equals(title)){
            System.out.println("Title " + title + " Ok");
        }
        else {
            System.out.println("Title ERROR");
            System.out.println("Expected title = " + title);
            System.out.println("Actual title = " + webDriver.getTitle());
        }
        if (webDriver.getCurrentUrl().equals(url1)){
            System.out.println("URL " + title + " Ok");
        }
        else {
            System.out.println("URL ERROR");
            System.out.println("Expected url = " + url1);
            System.out.println("Actual url = " + webDriver.getCurrentUrl());
        }
        webDriver.quit();
    }
}
