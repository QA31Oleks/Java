package org.HomeTasks.Task1110;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class WaitsBlue {
    public static void main(String[] args) {
        System.out.println(waitBlue());
    }
    public static String waitBlue(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task1110\\waits.html");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofMinutes(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        wait.until(ExpectedConditions
                .attributeContains(webDriver
                        .findElement(By.tagName("body")), "class", "blue"));
        String bodyAttribute = webDriver.findElement(By.tagName("body")).getAttribute("class");
        webDriver.quit();
        return bodyAttribute;
    }
}
