package org.HomeTasks.Task0210.Alert2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
            Thread.sleep(200);
        } else {
            alert.sendKeys("30");
            Thread.sleep(200);
            alert.accept();
            Thread.sleep(200);
        }
    }

    /*
     * button - WebElevent, одна з трьох кнопок "Alert", "Confirm" або "Prompt"
     * idText - назва кнопки, яка відображається на екрані
     * webDriver - для роботи з поточним станом елементів веб-сторінки*/
    public static void checkSymbols(WebElement button, String idText, WebDriver webDriver) {
        if (webDriver.findElement(By.partialLinkText(idText)).getAttribute("span").equals("+") ||
                webDriver.findElement(By.partialLinkText(idText)).getAttribute("span").equals("30")) {
            System.out.println("Відповідний символ з'явився біля кнопки " + button.getText());
        } else {
            System.out.println("Символ '+' НЕ з'явився біля кнопки " + button.getText());
        }
    }
}
