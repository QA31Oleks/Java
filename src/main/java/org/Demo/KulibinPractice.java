package org.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class KulibinPractice {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        Actions actions = new Actions(webDriver);
        webDriver.get("https://kulibin.com.ua/ua/");
        actions.pause(1000).perform();
        try {
            webDriver.findElement(with(By.linkText("Українська"))
                            .toLeftOf(By.linkText("Русский"))).click();
        } catch (Exception e) {
        }
    }
}
