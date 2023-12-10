package org.Lessons.Lesson7.iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson7Alert {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();


        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson8\\alert.html");


        WebDriver.TargetLocator targetLocator = webDriver.switchTo();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Alert alert = targetLocator.alert();
        System.out.println("Alert text = " + alert.getText());
        alert.accept();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Confirm text = " + alert.getText());
        alert.dismiss();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Prompt text = " + alert.getText());
        alert.sendKeys("Tomas");
        alert.accept();

    }
}
