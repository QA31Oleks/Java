package org.lessons.Lesson7.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson7Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson7\\alert.html");

        WebDriver.TargetLocator targetLocator = webDriver.switchTo();

        Thread.sleep(2000);
        Alert alert = targetLocator.alert();
        System.out.printf("Alert text: %s%n", alert.getText());
        alert.accept();

        Thread.sleep(2000);
        System.out.printf("Confirm text: %s%n", alert.getText());
        alert.accept();

        System.out.printf("Prompt text: %s%n", alert.getText());
        alert.sendKeys("Tomas");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

        Thread.sleep(2000);
        webDriver.quit();
    }
}
