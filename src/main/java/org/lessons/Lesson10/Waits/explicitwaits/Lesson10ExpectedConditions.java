package org.lessons.Lesson10.Waits.explicitwaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lesson10ExpectedConditions {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson10\\Waits\\waits.html");

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMinutes(10));

        //реализация через анонимные классы
        String h1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1"))).getText();
        System.out.println("h1 = " + h1);


        //реализация через лямбла выражентия
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();


    }
}
