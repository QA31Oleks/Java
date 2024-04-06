package org.homeTasks.Task0210;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

import java.util.List;

public class AlertTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task0210\\alert.html");
        List<WebElement> buttons = webDriver.findElements(By.tagName("button"));
        for (WebElement button : buttons) {
            String idText = button.getText();
            clickMethod(button, idText, webDriver);
            checkSymbols(button, idText, webDriver);
        }
        webDriver.quit();
    }

    public static void clickMethod(WebElement button, String idText, WebDriver webDriver) throws InterruptedException {

        button.click();
        WebDriver.TargetLocator targetLocator = webDriver.switchTo();
        Alert alert = targetLocator.alert();

        if (idText.equals("Alert") || idText.equals("Confirm")) {
            alert.accept();
            Thread.sleep(300);
        } else {
            alert.sendKeys("30");
            Thread.sleep(300);
            alert.accept();
            Thread.sleep(300);
        }
    }
    public static void checkSymbols(WebElement button, String idText, WebDriver webDriver) {
        if (idText.equals("Alert")) {
            if (webDriver.findElement(By.xpath("//*[@id=\"alert\"]/span")).isDisplayed()) {
                System.out.println("Символ '+' з'явився біля кнопки " + button.getText());
            } else {
                System.out.println("Символ '+' НЕ з'явився біля кнопки " + button.getText());
            }
        } else if (idText.equals("Confirm")) {
            if (webDriver.findElement(By.xpath("//*[@id=\"confirm\"]/span")).isDisplayed()) {
                System.out.println("Символ '+' з'явився біля кнопки " + button.getText());
            } else {
                System.out.println("Символ '+' НЕ з'явився біля кнопки " + button.getText());
            }
        } else if (idText.equals("Prompt")) {
            if (webDriver.findElement(By.xpath("//*[@id=\"prompt\"]/span")).isDisplayed()) {
                System.out.println("Значення '30' з'явилося біля кнопки " + button.getText());
            } else {
                System.out.println("Значення '30' НЕ з'явилося біля кнопки " + button.getText());
            }
        }
    }
}
