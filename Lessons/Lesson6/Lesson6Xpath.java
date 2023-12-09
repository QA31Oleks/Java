package org.Lessons.Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson6Xpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\Evgeniy\\IdeaProjects\\QA31Selenium\\src\\main\\java\\org\\example\\Lesson6\\xpath\\xpath.html");

        WebElement div = webDriver.findElement(By.xpath("//div[@id='first']"));
        System.out.println("div.getText() = " + div.getText());

        WebElement button = webDriver.findElement(By.xpath("//button[@id='button']"));
        System.out.println("button.getText() = " + button.getText());

        webDriver.findElement(By.xpath("//a[text()='Link4']")).click();

        Thread.sleep(2000);

        webDriver.navigate().back();

        WebElement div1 = webDriver.findElement(By.xpath("//div[contains(text(), 'Autem')]"));
        System.out.println("div1.getText() = " + div1.getText());


        WebElement div2 = webDriver.findElement(By.xpath("//div[contains(@class, 'red')]"));
        System.out.println("div2.getText() = " + div2.getText());


        WebElement olx = webDriver.findElement(By.xpath("//ul[contains(@class, 'links')]//a[text()='Link3']"));
        olx.click();


        //parent::
        //child::
        //following-sibling::



    }
}
