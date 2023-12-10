package org.Temerix.Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrillsBulgarianScrewdrivers {
    public WebDriver webDriver = new ChromeDriver();
    public Actions actions = new Actions(webDriver);
    public WebDriver.Navigation navigation = webDriver.navigate();

    /*
     * До Листа promotionalGoods будуть додаватись
     * товари зі знижками (у вигляді вебелементів),
     * які відшукуються за допомогою методу
     * createListPromotionalGoods()
     * */
    public List<WebElement> promotionalGoods = new ArrayList<>();

    /* Наступний метод переходить за посиланням
     * необхідного розділу ('Дрилі', 'Перфоратори', 'Шурупокрути')
     * та обирає мову (Укр/Рос) у Поп-ап вікні у разі його виникнення.
     * Пошук кнопки у Поп-ап вікні відбувається
     * за допомогою relative locators
     */
    public void openSectionOfGood(String link) {
        webDriver.get(link);
        actions.pause(1000).perform();
        try {
            webDriver.findElement(with(By.linkText("Українська"))
                    .toLeftOf(By.linkText("Русский"))).click();
        } catch (Exception e) {
        }
    }

    /*
     * Наступний метод здійснює перехід на сторінку з дрилями
     * відшукуючи елементи за допомогою id та linkText
     * */

    public void openPageDrills() {
        openSectionOfGood("https://kulibin.com.ua/");
        actions.pause(1000).perform();
        webDriver.findElement(By.id("catalog-menu")).click();
        actions.pause(1000).perform();
        webDriver.findElement(By.linkText("Електроінструмент")).click();
        actions.pause(1000).perform();
        webDriver.findElement(By.linkText("Дрилі")).click();
        actions.pause(1000).perform();
    }


    /*
     * Наступний метод знаходить на будь-якій сторінці
     * необхідну кількість товарів зі знижками
     * (кількість акційних товарів, яку треба
     * відшукати вказується в параметрах методу - quantityPromotionalGoods.
     * У завданні з "Дрилями" quantityPromotionalGoods = 3,
     * у завданні з "Шурупокрутами" quantityPromotionalGoods = 10)
     * та додає до Листа promotionalGoods товари зі знижкою
     * для подальшої перевірки цін*/
    public void createListPromotionalGoods(int quantityPromotionalGoods) {
        int index = 0;
        boolean isSizeListEqual = false;
        while (!isSizeListEqual) {
            List<WebElement> allGoods = webDriver.findElements(By.xpath("//li[@class='col-xs-4 js-product']"));
            for (WebElement element : allGoods) {
                try {
                    if (element.findElement(By.cssSelector(".old-price")).isDisplayed()) {
                        promotionalGoods.add(index++, element);
                        if (index == quantityPromotionalGoods) {
                            isSizeListEqual = true;
                            break;
                        }
                    }
                } catch (Exception e) {
                }
            }
            actions.click(webDriver.findElement(By.xpath("/html/body/div[3]/div/main/div[3]/div[2]/div[3]/a")))
                    .pause(1000)
                    .perform();
        }
    }

    /*
     * Наступний метод відкриває картку товару та порівнює
     * ціни з головною сторінкою */
    public void checkingPriceDrills() {
        promotionalGoods.clear();
        createListPromotionalGoods(3);
        String[] linksToCards = new String[promotionalGoods.size()];
        String[] oldPrices = new String[promotionalGoods.size()];
        String[] newPrices = new String[promotionalGoods.size()];
        /*
         * В наступному циклі буде виконано 3 ітерації відповідно до умов завдання.
         * Тобто буде перевірено 3 акційних товари (i < quantityPromotionalGoods).
         * У разі необхідності збільшити кількість перевірок, треба змінити
         * значення quantityPromotionalGoods
         * */
        for (int i = 0; i < linksToCards.length; i++) {
            linksToCards[i] = promotionalGoods.get(i).findElement(By.tagName("a")).getAttribute("href");
            oldPrices[i] = promotionalGoods.get(i).findElement(By.cssSelector(".old-price")).getText();
            newPrices[i] = promotionalGoods.get(i).findElement(By.cssSelector(".price")).getText();
        }
        for (int i = 0; i < linksToCards.length; i++) {
            webDriver.get(linksToCards[i]);
            if (webDriver.findElement(By.cssSelector(".item-text .price-row .old-price")).getText().equals(oldPrices[i])
                    && webDriver.findElement(By.cssSelector(".item-text .price-row .price")).getText().equals(newPrices[i])) {
                System.out.println("Товар:\n" +
                        webDriver.findElement(By.tagName("h1")).getText() + "\nЦіни у картці та на головній сторінці співпадають");
            } else {
                System.out.println("Ціни не співпадають!");
                System.out.println("Стара ціна на головній сторінці: " + oldPrices[i]);
                System.out.println("Стара ціна у картці товару: " + webDriver.findElement(By.cssSelector(".item-text .price-row .old-price")).getText());
                System.out.println(" - - - - - - - - - - - -");
                System.out.println("Нова ціна на головній сторінці: " + newPrices[i]);
                System.out.println("Нова ціна у картці товару: " + webDriver.findElement(By.cssSelector(".item-text .price-row .price")).getText());
            }
            System.out.println("= = = = = = = = = = = = =");
            actions.pause(1000).perform();
            navigation.back();
            actions.pause(1000).perform();
        }
        System.out.println();
    }


    /*
     * Наступний метод відкриває сторінку
     * "Перфоратори" та здійснює перевірку
     * наявності принаймні одного тікету "Акція".
     * Пошук вебелементів вібдувається із
     * використанням cssSelector
     * */
    public boolean checkingPromotionPerforators() {
        boolean isAdsThere = false;
        openSectionOfGood("https://kulibin.com.ua/catalog/perforatory/");
        List<WebElement> promotionalPerforators = new ArrayList<>();
        List<WebElement> allGoods = webDriver.findElements(By.tagName("li"));
        int index = 0;
        for (WebElement element : allGoods) {
            try {
                if (element.findElement(By.cssSelector(".old-price")).isDisplayed()) {
                    promotionalPerforators.add(index++, element);
                }
            } catch (Exception e) {
            }
        }
        if (promotionalPerforators.size() > 0) {
            isAdsThere = true;
        }
        return isAdsThere;
    }

    /* Наступний метод виводить перелік усіх товарів
     * з розділу "Болгарки", в яких є іконка
     * кредит частинами на перших трьох сторінках
     * */
    public void creditBulgarian() {
        openSectionOfGood("https://kulibin.com.ua/ua/catalog/bolgarki/");
        actions.pause(1000)
                .click(webDriver.findElement(By.xpath("/html/body/div[3]/div/main/div[3]/div[2]/div[3]/a")))
                .pause(1000)
                .click(webDriver.findElement(By.xpath("/html/body/div[3]/div/main/div[3]/div[2]/div[3]/a")))
                .pause(1000)
                .perform();
        List<WebElement> allBulgarian = webDriver.findElements(By.cssSelector(".holder"));
        for (WebElement element : allBulgarian) {
            try {
                if (element.findElement(By.cssSelector(".info-wrap__credit-opener")).isDisplayed()) {
                    System.out.println(element.findElement(By.tagName("h4")).getText());
                }
            } catch (Exception e) {
            }
        }
        System.out.println("= = = = = = = = = = = = =\n");
    }

    /*
     * Наступний метод відшукує 10 акційних товарів
     * в розділі "Шурупокрути" та розраховує відсоток знижки
     * */
    public void screwdriversDiscountCalculation() {
        openSectionOfGood("https://kulibin.com.ua/ua/catalog/shurupoverty/");
        promotionalGoods.clear();
        createListPromotionalGoods(10);
        String oldPriceWithoutLetters = "";
        String newPriceWithoutLetters = "";
        for (int i = 0; i < promotionalGoods.size(); i++) {
            String oldPriceWithLetters = promotionalGoods.get(i).findElement(By.cssSelector(".old-price")).getText();
            for (int j = 0; j < oldPriceWithLetters.length() - 5; j++) {
                oldPriceWithoutLetters = oldPriceWithoutLetters + oldPriceWithLetters.charAt(j);
            }
            String newPriceWithLetters = promotionalGoods.get(i).findElement(By.cssSelector(".price")).getText();
            for (int j = 0; j < newPriceWithLetters.length() - 5; j++) {
                newPriceWithoutLetters = newPriceWithoutLetters + newPriceWithLetters.charAt(j);
            }
            oldPriceWithoutLetters = oldPriceWithoutLetters.replaceAll("\\s", "");
            Double d1 = Double.valueOf(oldPriceWithoutLetters);
            newPriceWithoutLetters = newPriceWithoutLetters.replaceAll("\\s", "");
            Double d2 = Double.valueOf(newPriceWithoutLetters);
            if ((d1 / d2) > 1) {
                System.out.println("Товар:\n" + promotionalGoods.get(i).findElement(By.tagName("h4")).getText());
                System.out.println("Відсоток знижки: " + (1 - (d2 / d1)) * 100 + "%");
                System.out.println("Акційна ціна: " + d2);
                System.out.println("Ціна до акції: " + d1);
                System.out.println("= = = = = = = = = = = = =");
            } else {
                System.out.println("ERROR");
                System.out.println("У товара:\n" + promotionalGoods.get(i).findElement(By.tagName("h4")).getText());
                System.out.println("відсоток знижки = 0");
                System.out.println("Акційна ціна: " + d2);
                System.out.println("Ціна до акції: " + d1);
            }
            oldPriceWithoutLetters = "";
            newPriceWithoutLetters = "";
        }
        System.out.println("\n");
    }
}