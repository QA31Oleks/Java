package org.Lessons.Lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitLesson {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson10\\waits.html");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMinutes(10));

    }
}
