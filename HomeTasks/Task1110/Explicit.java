package org.HomeTasks.Task1110;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Explicit {
    public static void main(String[] args) {
        System.out.println(getTextOfAds());
    }
    public static String getTextOfAds(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://kiev.itstep.org/");
        WebElement ads = webDriver.findElement(By.xpath(
                "//*[@id=\"academy_page\"]/div[3]/div[1]/div[1]/div/div/h3"));
        Wait<WebDriver> wait = new FluentWait<>(webDriver)
                .withTimeout(Duration.ofMinutes(1))
                .pollingEvery(Duration.ofSeconds(1));
        wait.until(webDriver1 -> ads.isDisplayed());
        String adsText = ads.getText();
        webDriver.quit();
        return adsText;
    }
}
