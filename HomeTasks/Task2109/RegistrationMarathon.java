package org.HomeTasks.Task2109;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationMarathon {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://chernivtsi.itstep.org/events/bezkostovnij-marafon-z-graficnogo-dizajnu");

        WebElement name = webDriver.findElement(By.xpath("/html/body/main/div/section[2]/div/form/div[1]/div[1]/input"));
        name.sendKeys("Jack");
        Thread.sleep(1000);

        WebElement phone = webDriver.findElement(By.xpath("/html/body/main/div/section[2]/div/form/div[1]/div[2]/div[2]/input"));
        phone.sendKeys("999999999");
        Thread.sleep(1000);

        WebElement email = webDriver.findElement(By.xpath("/html/body/main/div/section[2]/div/form/div[1]/div[3]/input"));
        email.sendKeys("jack@mail.com");
        Thread.sleep(2000);

        webDriver.quit();
    }
}
