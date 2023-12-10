package org.HomeTasks.Task0910;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndAlert {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        WebDriver.TargetLocator targetLocator = webDriver.switchTo();

        contexClickAndQuitClick(webDriver);

        Alert alert = targetLocator.alert();
        alert.accept();
        webDriver.quit();
    }
    // Метод клікає правою кнопкою миші на кнопку "right click me",
    // та натискає на кнопку "Quit" у контекстному меню.
    // Перевірка тексту повідомлення у "alert: clicked: quit"
    // реалізована у класі ActionsAndAlertTest
    public static void contexClickAndQuitClick(WebDriver webDriver) {
        Actions actions = new Actions(webDriver);
        webDriver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        actions
                .pause(300)
                .contextClick(webDriver
                        .findElement(By
                                .xpath("/html/body/div/section/div/div/div/p/span")))
                .pause(300)
                .click(webDriver
                        .findElement(By.xpath("/html/body/ul/li[7]")))
                .perform();
    }
}
