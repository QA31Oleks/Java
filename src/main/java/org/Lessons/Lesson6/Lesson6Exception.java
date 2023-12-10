package org.Lessons.Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson6Exception {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();

        try {
            webDriver.get("https://www.google.com/");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }


        WebElement hello = webDriver.findElement(By.id("hello"));
        System.out.println(hello.getText());


    }
}
