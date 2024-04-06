package org.lessons.Lesson10.Waits.implicitwaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Lesson10Implicit {
    public static void main(String[] args) {


        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson10\\Waits\\waits.html");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
        //webDriver.manage().timeouts().scriptTimeout(Duration.ofMinutes(1));
        //webDriver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));


        WebElement h1 = webDriver.findElement(By.tagName("h1"));
        System.out.println("h1 = " + h1.getText());


        //неявные ожидания не умеют работать с алертами
        Alert alert = webDriver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();



    }
}