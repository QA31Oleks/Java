package org.HomeTasks.Task0910;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionsHomeTask {
    public static void main(String[] args) {
        /*
        * В класі ActionsHomeTask знаходяться тільки методи для переходу
        * до текстового поля (iframe), а також введення "text", "bold", "italic".
        * Методи щодо перевірки вмісту текстового поля,
        * а також перевірки кількості і вмісту параграфів
        * знаходяться в класі ActionsHomeTaskTest
        * */
        WebDriver webDriver = new ChromeDriver();
        Actions actions = new Actions(webDriver);
        webDriver.get("http://the-internet.herokuapp.com/tinymce");
        webDriver.switchTo().defaultContent();
        clickNewDocument(webDriver, actions);
        enteringTextBoldItalic(webDriver, actions);
        webDriver.quit();
    }
    public static void clickNewDocument(WebDriver webDriver, Actions actions){
        actions
                .pause(1000)
                .click(webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[1]/button[1]")))
                .pause(1000)
                .perform();
        actions
                .click(webDriver.findElement(By.className("tox-collection__item-label")))
                .pause(1000)
                .perform();
    }
    public static void enteringTextBoldItalic(WebDriver webDriver, Actions actions){
        actions
                .sendKeys("text")
                .pause(500)
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .keyDown(Keys.CONTROL)
                .sendKeys("b")
                .keyUp(Keys.CONTROL)
                .sendKeys("bold")
                .pause(500)
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .keyDown(Keys.CONTROL)
                .sendKeys("b")
                .sendKeys("i")
                .keyUp(Keys.CONTROL)
                .sendKeys("italic")
                .pause(500)
                .perform();
    }
}
