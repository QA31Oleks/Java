package org.HomeTasks.Task1110;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Implicit {
    public static void main(String[] args) {
        System.out.println(getTextOfAds());
    }
    public static String getTextOfAds(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://kiev.itstep.org/");
        WebElement ads = webDriver.findElement(By.xpath(
                "//*[@id=\"academy_page\"]/div[3]/div[1]/div[1]/div/div/h3"));
        webDriver
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(35));
        ads.click();
        String adsText = ads.getText();
        webDriver.quit();
        return adsText;
    }
}
