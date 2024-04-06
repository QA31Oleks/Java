package org.lessons.Lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\HomeTasks\\HTML\\TagAtributeElement.html");

        WebElement h1 = webDriver.findElement(By.tagName("h1"));
        webDriver.findElement(By.tagName("h1"));
        System.out.println("h1.getText = " + h1.getText());
    }
}
