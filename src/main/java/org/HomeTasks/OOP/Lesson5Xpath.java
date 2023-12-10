package org.HomeTasks.OOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson5Xpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.pravda.com.ua/");

        WebDriver.Navigation navigation = webDriver.navigate();


        WebElement checkbox = webDriver.findElement(By.xpath("/html/body/nav[1]/ul/li[5]/a"));
        checkbox.click();

        Thread.sleep(1500);

        webDriver.quit();


    }
}
