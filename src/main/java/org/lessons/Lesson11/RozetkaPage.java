package org.lessons.Lesson11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class RozetkaPage extends Page {

    //@FindBy(how = How.TAG_NAME, using = "h1") //webDriver.findElement(By.tagName("h1"));
    private WebElement h1;
    @FindBy(xpath = "/html/body/app-root/div/div/" +
            "rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]" +
            "/rz-catalog-tile/app-goods-tile-default/div/div[2]/a[2]/span")
    private WebElement link;
    private String url;

    public RozetkaPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void setUrl(String url) {
        this.url = url;
    }

    public String checkTitle() {
        webDriver.get(url);
        h1 = new WebDriverWait(webDriver, Duration.ofSeconds(20)).until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(By.tagName("h1"));
            }
        });
        return h1.getText();
    }


    public void clickProduct() {
        link.click();
    }
}
