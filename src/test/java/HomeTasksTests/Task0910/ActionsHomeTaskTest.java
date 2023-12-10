package HomeTasksTests.Task0910;

//import org.example.Task0910.ActionsHomeTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/*public class ActionsHomeTaskTest {

    // метод для пошуку тексту в iframe до створення New document
    @Test
    public void isTextInFrame1() {
        WebDriver webDriver = new ChromeDriver();
        ActionsHomeTask actionsHomeTask = new ActionsHomeTask();
        Actions actions = new Actions(webDriver);
        webDriver.get("http://the-internet.herokuapp.com/tinymce");
        actions.pause(1000).perform();
        Assertions.assertEquals("Your content goes here.",
                webDriver
                        .switchTo().frame("mce_0_ifr")
                        .findElement(By.id("tinymce"))
                        .findElement(By.tagName("p"))
                        .getText());
        webDriver.quit();
    }
    // метод для пошуку тексту в iframe після створення New document
    @Test
    public void isTextInFrame2() {
        WebDriver webDriver = new ChromeDriver();
        ActionsHomeTask actionsHomeTask = new ActionsHomeTask();
        Actions actions = new Actions(webDriver);
        webDriver.get("http://the-internet.herokuapp.com/tinymce");
        actionsHomeTask.clickNewDocument(webDriver, actions);
        actions.pause(1000).perform();
        Assertions.assertEquals("",
                webDriver
                        .switchTo().frame("mce_0_ifr")
                        .findElement(By.id("tinymce"))
                        .findElement(By.tagName("p"))
                        .getText());
        webDriver.quit();
    }
    // метод для перевірки наявності трьох параграфів
    // після введення "text", "bold", "italic"
    @Test
    public void isThreeParagraphs() {
        WebDriver webDriver = new ChromeDriver();
        ActionsHomeTask actionsHomeTask = new ActionsHomeTask();
        Actions actions = new Actions(webDriver);
        webDriver.get("http://the-internet.herokuapp.com/tinymce");
        actionsHomeTask.clickNewDocument(webDriver, actions);
        actionsHomeTask.enteringTextBoldItalic(webDriver, actions);
        List<WebElement> p = webDriver
                .switchTo().defaultContent()
                .switchTo().frame("mce_0_ifr")
                .findElements(By.tagName("p"));
        Assertions.assertEquals(3, p.size());
        webDriver.quit();
    }
    // метод для пошуку "text" в першому параграфі
    @Test
    public void isTextInFirstParagraph() {
        WebDriver webDriver = new ChromeDriver();
        ActionsHomeTask actionsHomeTask = new ActionsHomeTask();
        Actions actions = new Actions(webDriver);
        webDriver.get("http://the-internet.herokuapp.com/tinymce");
        actionsHomeTask.clickNewDocument(webDriver, actions);
        actionsHomeTask.enteringTextBoldItalic(webDriver, actions);
        Assertions.assertEquals("text",
                webDriver
                        .switchTo().defaultContent()
                        .switchTo().frame("mce_0_ifr")
                        .findElement(By.xpath("//*[@id=\"tinymce\"]/p[1]")).getText());
        webDriver.quit();
    }
    // метод для пошуку "bold" в другому параграфі
    @Test
    public void isBoldInSecondParagraph() {
        WebDriver webDriver = new ChromeDriver();
        ActionsHomeTask actionsHomeTask = new ActionsHomeTask();
        Actions actions = new Actions(webDriver);
        webDriver.get("http://the-internet.herokuapp.com/tinymce");
        actionsHomeTask.clickNewDocument(webDriver, actions);
        actionsHomeTask.enteringTextBoldItalic(webDriver, actions);
        Assertions.assertEquals("bold",
                webDriver
                        .switchTo().defaultContent()
                        .switchTo().frame("mce_0_ifr")
                        .findElement(By.xpath("//*[@id=\"tinymce\"]/p[2]/strong")).getText());
        webDriver.quit();
    }
    // метод для пошуку "italic" в третьому параграфі
    @Test
    public void isItalicInThirdParagraph() {
        WebDriver webDriver = new ChromeDriver();
        ActionsHomeTask actionsHomeTask = new ActionsHomeTask();
        Actions actions = new Actions(webDriver);
        webDriver.get("http://the-internet.herokuapp.com/tinymce");
        actionsHomeTask.clickNewDocument(webDriver, actions);
        actionsHomeTask.enteringTextBoldItalic(webDriver, actions);
        Assertions.assertEquals("italic",
                webDriver
                        .switchTo().defaultContent()
                        .switchTo().frame("mce_0_ifr")
                        .findElement(By.xpath("//*[@id=\"_mce_caret\"]/em")).getText());
        webDriver.quit();
    }
}*/
