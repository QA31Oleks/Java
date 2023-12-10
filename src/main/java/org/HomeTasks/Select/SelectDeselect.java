package org.HomeTasks.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDeselect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task2309\\select.html");
        WebElement colors = webDriver.findElement(By.xpath("//select[@id='colors']"));
        Select select = new Select(colors);

        select.selectByIndex(1);
        Thread.sleep(1000);

        select.selectByValue("blue");
        Thread.sleep(1000);

        select.selectByVisibleText("Green");
        Thread.sleep(1000);

        if (select.isMultiple()) {
            select.deselectByVisibleText("Green");
        }

        Select multiselect = new Select(webDriver.findElement(By.xpath("//select[@id='languages']")));
        multiselect.selectByIndex(0);
        multiselect.selectByIndex(1);
        multiselect.selectByIndex(2);

        Thread.sleep(1000);

        if (multiselect.isMultiple()) {
            //multiselect.deselectAll();
            multiselect.deselectByVisibleText("Python");
        }

        System.out.println("========== getAllSelectedOptions() =========");
        List<WebElement> allMultiOptions = multiselect.getAllSelectedOptions();
        List<WebElement> allSingleOptions = select.getAllSelectedOptions();

        for (WebElement allSingleOption : allSingleOptions) {
            System.out.println("allSingleOption = " + allSingleOption.getText());
        }

        for (WebElement allMultiOption : allMultiOptions) {
            System.out.println("allMultiOption = " + allMultiOption.getText());
        }

        System.out.println("========== getOptions() =========");
        List<WebElement> multiOptions = multiselect.getOptions();
        List<WebElement> singleOptions = select.getOptions();

        for (WebElement singleOption : singleOptions) {
            System.out.println("singleOption = " + singleOption.getText());
        }

        for (WebElement multiOption : multiOptions) {
            System.out.println("multiOption = " + multiOption.getText());
        }
        System.out.println("========== getFirstSelectedOption() =========");

        System.out.println("select.getFirstSelectedOption().getText() = " + select.getFirstSelectedOption().getText());
        System.out.println("multiselect.getFirstSelectedOption().getText() = " + multiselect.getFirstSelectedOption().getText());
    }
}
