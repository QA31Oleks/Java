package org.GeneralPractice.CSSPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SeleniumPlusCSS {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        Actions actions = new Actions(webDriver);
        webDriver.get("D:\\Dad\\STEPOleksandr\\IntelliJ\\SeleniumJunit\\src\\main\\java\\org\\CSSPractice\\FirstPage.html");
        //webDriver.findElement(By.tagName("a")).click();
        //webDriver.findElement(By.cssSelector("csstest")).click(); НЕ ПРАЦЮЄ!
        actions.pause(500).perform();
        System.out.println(webDriver.findElement(By.cssSelector(".csstest")).getAttribute("href"));
        webDriver.quit();
    }
}
