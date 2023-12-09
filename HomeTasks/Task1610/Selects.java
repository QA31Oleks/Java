package org.HomeTasks.Task1610;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Selects extends WebDriverAndSelects {
    private String url;
    @FindBy(xpath = "/html/body/div[2]/div[1]/label/select")
    WebElement multiselect;

    public Selects(WebDriver webDriver) {
        super(webDriver);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // multiselectClick - метод для обрання інгрідієнтів
    // у першому вікні.
    // В залежності від значення numberOfSelect
    // обирається кількість інгрідієнтів від 1 до 8
    // (якщо кількість numberOfSelect > 8, то буде обрано 8 інгрідієнтів)
    public void multiselectClick(int numberOfSelect) {
        webDriver.get(url);
        Select select = new Select(multiselect);
        if (numberOfSelect <= 8) {
            for (int i = 0; i < numberOfSelect; i++) {
                select.selectByIndex(i);
            }
        } else if (numberOfSelect > 8) {
            for (int i = 0; i < 8; i++) {
                select.selectByIndex(i);
            }
        } else {
            select.selectByIndex(0);
        }
    }
    // Після обрання елементів у першому вікні,
    // за допомогою методу listOfSelectElement
    // створюється Лист із переліком обраних інгрідієнтів (у веб елементі <out2>)
    // для наступного порівняння в класі SelectsTest
    // в assertLinesMatch (Actual result)
    public static List<String> listOfSelectElement(WebDriver webDriver) {
        WebElement elementOut2 = webDriver.findElement(By.id("out2"));
        List<WebElement> multiOptions = elementOut2.findElements(By.tagName("option"));
        List<String> elementsString = new ArrayList<>();
        int i = 0;
        for (WebElement element : multiOptions) {
            elementsString.add(i++, element.getText());
        }
        return elementsString;
    }
    // За допомогою методу listOfSelectAdditives
    // створюється Лист з назвою інгрідієнтів
    // для наступного порівняння в assertLinesMatch класу SelectsTest
    // (Expected result)
    // Кількість інгрідієнтів в листі також залежить
    // від значення numberOfSelect (від 1 до 8)
    public static List<String> listOfSelectAdditives(int numberOfSelect) {
        List<String> additivesList = new ArrayList<>();
        String[] additivesString = {
                "Cheese",
                "Olives",
                "Pepperoni",
                "Anchovies",
                "Mushrooms",
                "Green Pepper",
                "Bacon",
                "Ham"};
        if (numberOfSelect <= 8) {
            for (int i = 0; i < numberOfSelect; i++) {
                additivesList.add(i, additivesString[i]);
            }
        } else if (numberOfSelect > 8) {
            for (int i = 0; i < 8; i++) {
                additivesList.add(i, additivesString[i]);
            }
        } else {
            additivesList.add(0, additivesString[0]);
        }
        return additivesList;
    }
}
