package org.lessons.Lesson10;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class WaitLesson {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson10\\waits.html");

        Actions actions = new Actions(webDriver);
        actions
                //.pause(7000)
                .perform();

        FluentWait<WebDriver> wait = new FluentWait<>(webDriver);
        wait.withTimeout(Duration.ofSeconds(30));
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.ignoring(NoSuchElementException.class);
        wait.ignoring(UnhandledAlertException.class);
        wait.ignoring(NoAlertPresentException.class);

        WebElement h1 = wait.until(new h1Waiter());
        System.out.println(h1.getText());

        Alert alert = wait.until(new AlertWaiter());
        System.out.println(alert.getText());
        alert.accept();

        //String text = webDriver.findElement(By.tagName("h1")).getText();
        //System.out.println(text);
    }
    static class h1Waiter implements Function<WebDriver, WebElement> {

        @Override
        public WebElement apply(WebDriver webDriver) {
            return webDriver.findElement(By.tagName("h1"));
        }
    }
    static class AlertWaiter implements Function<WebDriver, Alert>{

        @Override
        public Alert apply(WebDriver webDriver) {
            return webDriver.switchTo().alert();
        }
    }
}
