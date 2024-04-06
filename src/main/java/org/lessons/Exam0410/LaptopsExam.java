package org.lessons.Exam0410;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LaptopsExam {

    public WebDriver webDriver() {
        return webDriver();
    }

    /*
     * Метод виконує наступні функції:
     * відкриває URL
     * переходить в меню та відкриває список Cele mai populare
     * в списку обирає Pret crescator
     * після завантаження сторінки обирає категорію Top Favorite
     * (категорія Gaming вже недоступна)
     * */
    public void selectPopularAndTopFavorite(WebDriver webDriver) {
        Actions actions = new Actions(webDriver);
        webDriver.get("https://www.emag.ro/laptopuri/c");
        actions.pause(1500).perform();
        webDriver.findElement(By.xpath("//*[@id=\"main-container\"]" +
                        "/section[1]/div/div[3]/div[2]/div[1]/div[6]/div/div[2]/div[1]" +
                        "/button"))
                .click();
        actions.pause(1500).perform();
        webDriver.findElement(By.xpath("//*[@id=\"main-container\"]" +
                        "/section[1]/div/div[3]/div[2]/div[1]/div[6]/div/div[2]" +
                        "/div[1]/div/ul/li[3]/a"))
                .click();
        actions.pause(1500).perform();
        webDriver.findElement(By.xpath("//*[@id=\"main-container\"]" +
                        "/section[1]/div/div[3]/div[2]/div[1]/div[3]/div[2]/div" +
                        "/div/div/div/div[2]/button"))
                .click();
        actions.pause(2000).perform();
    }

    // після виконання методу selectPopularAndGaming
    // наступний метод перевіряє, чи обраний лише чекбокс Gaming
    // та повертає true чи false
    public boolean isOnlyGamesCheckboxSelected(WebDriver webDriver) {
        if (webDriver.findElement(By.xpath(
                        "//*[@id=\"js-filter-9902-collapse\"]/div/a[2]"))
                .getAttribute("class")
                .equals("js-filter-item filter-item active")
                && webDriver.findElement(By.xpath(
                        "//*[@id=\"js-filter-9902-collapse\"]/div/a[1]"))
                .getAttribute("class")
                .equals("js-filter-item filter-item")) {
            return true;
        } else {
            return false;
        }
    }

    // метод відкриває сторінку із ноутбуком
    // замість ноутбука, вказаного у завданні обрав інший,
    // оскільки після застосування фільтрів
    // в результатах немає ноутбука, зазначеного у завданні
    public void clickLaptop(WebDriver webDriver) {
        WebElement laptop = webDriver.findElement(By.xpath(
                "//*[@id=\"card_grid\"]/div[1]/div/div/div[3]/div/h2/a"));
        webDriver.get(laptop.getAttribute("href"));
    }

    // метод вводить в рядок пошуку "iphone 15"
    public void searchIphone(WebDriver webDriver) {
        Actions actions = new Actions(webDriver);
        WebDriver.Navigation navigation = webDriver.navigate();
        actions.pause(1500).perform();
        navigation.back();
        actions.pause(1500).perform();
        webDriver.findElement(By.xpath(
                        "//*[@id=\"searchboxTrigger\"]"))
                .click();
        actions
                .pause(1000)
                .sendKeys("iphone 15")
                .pause(1000)
                .keyDown(Keys.ENTER)
                .keyUp(Keys.ENTER)
                .pause(1000)
                .perform();
    }

    // метод створює Лист веб-елементів h2
    // для подальшого пошуку серед них телефонів інших брендів
    public List<WebElement> formsList(WebDriver webDriver) {
        List<WebElement> allElements = webDriver
                .findElements(By.tagName("h2"));
        return allElements;
    }

    //метод клікає по заголовку iPhone 15 Pro
    public void clickIphone15Pro(WebDriver webDriver) {
        Actions actions = new Actions(webDriver);
        actions.pause(1000).perform();
        WebElement iphone = webDriver.findElement(By.xpath(
                "//*[@id=\"card_grid\"]/div[1]/div/div/div[3]/div/h2/a"));
        webDriver.get(iphone.getAttribute("href"));
    }
}
