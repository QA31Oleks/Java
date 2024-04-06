package org.generalPractice.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoClass {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        Actions actions = new Actions(webDriver);
        webDriver.get("https://www.youtube.com/");
/*        actions
                .pause(4000)
                .click(webDriver.findElement(By.id("guide-icon")))
                .sendKeys("gigachat")
                .pause(2500)
                .click(webDriver.findElement(By.className("style-scope ytd-guide-entry-renderer")))
                .keyDown(Keys.ENTER)
                .pause(300)
                .keyUp(Keys.ENTER)
                .perform();*/
    }
}
