package org.HomeTasks.Task0210;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class iframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

        String titleExpected = "W3Schools Online Web Tutorials";

        WebDriver frameInside = webDriver.switchTo().frame("iframeResult").switchTo().frame(webDriver.findElement(By.xpath("/html/body/iframe")));
        if (webDriver.findElement(By.tagName("title")).getAttribute("innerHTML").equals(titleExpected)) {
            System.out.println("Title " + webDriver.findElement(By.tagName("title")).getAttribute("innerHTML") + " OK");
        } else {
            System.out.println("Title ERROR");
            System.out.println("Expected Title: " + titleExpected);
            System.out.println("Actual Title: " + webDriver.findElement(By.tagName("title")).getAttribute("innerHTML"));
        }

        webDriver.quit();
    }
}
