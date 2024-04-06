package org.generalPractice.OOP.WebDriverAndActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverAndActions {
    private final WebDriver webDriver = new ChromeDriver();
    private final Actions actions = new Actions(webDriver);
    private Select select;

    public void setSelect(WebElement select) {
        this.select = new Select(select);
    }

    public void titleSelect() {
        webDriver.get("D:\\Dad\\STEPOleksandr\\IntelliJ" +
                "\\SeleniumJunit\\src\\main\\java\\org\\" +
                "OOPWebDriverAndActions\\select_practice.html");
        actions
                .pause(1000)
                .perform();
        setSelect(webDriver.findElement(By.id("auto")));
        actions.pause(1000).perform();
        select.selectByValue("volvo");
    }
}
