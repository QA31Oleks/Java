package org.Lessons.Lesson10.Waits.explicitwaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class Lesson10WebDriverWait {


    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\Evgeniy\\IdeaProjects\\QA31Selenium\\src\\main\\java\\org\\example\\Lesson10\\waits.html");

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMinutes(10));

        //реализация через анонимные классы
        String h1 = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(By.tagName("h1"));
            }
        }).getText();
        System.out.println("h1 = " + h1);


        //реализация через лямбла выражентия
        wait.until((webDriver1) -> webDriver1.switchTo().alert());

    }
}
