package org.Lessons.Lesson10.Waits.explicitwaits;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class Lesson10FluentWaits {

    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson10\\Waits\\waits.html");

        Actions actions = new Actions(webDriver);
        actions
                //.pause(10000)
                .perform();

        FluentWait<WebDriver> wait = new FluentWait<>(webDriver);
        wait.withTimeout(Duration.ofMinutes(5)); // чекаємо на появу елементу 5 хвилин
        wait.pollingEvery(Duration.ofSeconds(1)); // перевіряємо появу елементу кожну 1 секунду
        wait.ignoring(NoSuchElementException.class);
        wait.ignoring(UnhandledAlertException.class);
        wait.ignoring(NoAlertPresentException.class);


        WebElement h1 = wait.until(new H1Waiter());
        System.out.println("h1.getText() = " + h1.getText());


        Alert alert = wait.until(new AlertWaiter());
        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();
    }
}

class H1Waiter implements Function<WebDriver, WebElement> {

    @Override
    public WebElement apply(WebDriver webDriver) {
        return webDriver.findElement(By.tagName("h1"));
    }
}

class AlertWaiter implements Function<WebDriver, Alert>{

    @Override
    public Alert apply(WebDriver webDriver) {
        return webDriver.switchTo().alert();
    }
}