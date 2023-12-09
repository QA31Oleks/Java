package org.HomeTasks.Task2109.SecondWay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckboxesAndRadiobuttonsMethodsPrintf {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task2109\\hw5.html");

        List<WebElement> checkboxyAndRadioknopky = webDriver.findElements(By.tagName("input"));

        System.out.printf("Кількість чекбоксів: %d%n", amountCheckbox(checkboxyAndRadioknopky));
        System.out.printf("Кількість радіокнопок: %d%n", amountRadiobutton(checkboxyAndRadioknopky));
        System.out.printf("=========================%n");

        whichCheckboxIsSelected(checkboxyAndRadioknopky);
        whichRadiobuttonIsSelected(checkboxyAndRadioknopky);

        webDriver.quit();
    }

    public static int amountCheckbox(List<WebElement> checkboxyAndRadioknopky) {
        int kilkistCheckbox = 0;
        for (WebElement element : checkboxyAndRadioknopky) {
            if (element.getAttribute("type").equals("checkbox")) {
                element.click();
                kilkistCheckbox++;
            }
        }
        return kilkistCheckbox;
    }

    public static int amountRadiobutton(List<WebElement> checkboxyAndRadioknopky) {
        int kilkistRadiobutton = 0;
        for (WebElement element : checkboxyAndRadioknopky) {
            if (element.getAttribute("type").equals("radio")) {
                element.click();
                kilkistRadiobutton++;
            }
        }
        return kilkistRadiobutton;
    }

    public static void whichCheckboxIsSelected(List<WebElement> checkboxyAndRadioknopky) {
        ArrayList obraniCheckboxy = new ArrayList<>();
        int i = 0;
        for (WebElement element : checkboxyAndRadioknopky) {
            if (element.isSelected() == true && element.getAttribute("type").equals("checkbox")) {
                obraniCheckboxy.add(i++, element.getAttribute("value"));
            }
        }
        if (obraniCheckboxy.size() > 1 && obraniCheckboxy.contains("Java")) {
            System.out.printf("Обрано не лише чекбокс <Java>.%nПерелік обраних чекбоксів: %s%n", Arrays.asList(obraniCheckboxy));
            System.out.printf("=========================%n");
        } else if (obraniCheckboxy.size() > 1) {
            System.out.printf("Чекбокс <Java> не обрано. %nЗамість чекбоксу <Java> обрано інші чекбокси: %s%n", Arrays.asList(obraniCheckboxy));
            System.out.printf("=========================%n");
        } else if (obraniCheckboxy.contains("Java")) {
            System.out.printf("Обрано лише чекбокс <Java>%n");
            System.out.printf("=========================%n");
        } else {
            System.out.printf("Чекбокс <Java> не обрано. %nnЗамість чекбоксу <Java> обрано інший чекбокс: %s%n", Arrays.asList(obraniCheckboxy));
            System.out.printf("=========================%n");
        }
    }

    public static void whichRadiobuttonIsSelected(List<WebElement> checkboxyAndRadioknopky) {
        ArrayList obraniRadioknopky = new ArrayList<>();
        int i = 0;
        for (WebElement element : checkboxyAndRadioknopky) {
            if (element.isSelected() == true && element.getAttribute("type").equals("radio")) {
                obraniRadioknopky.add(i++, element.getAttribute("value"));
            }
        }
        if (obraniRadioknopky.size() > 1 && obraniRadioknopky.contains("Test Automation")) {
            System.out.printf("Обрано не лише радіокнопку <Test Automation>.%nПерелік обраних радіокнопок: %s", Arrays.asList(obraniRadioknopky));
            System.out.printf("=========================%n");
        } else if (obraniRadioknopky.size() > 1) {
            System.out.printf("Радіокнопку <Test Automation> не обрано. %nЗамість радіокнопки <Test Automation> обрано інші радіокнопки: %s", Arrays.asList(obraniRadioknopky));
            System.out.printf("=========================%n");
        } else if (obraniRadioknopky.contains("Test Automation")) {
            System.out.printf("Обрано лише радіокнопку <Test Automation>%n");
            System.out.printf("=========================%n");
        } else {
            System.out.printf("Радіокнопку <Test Automation> не обрано. %nЗамість радіокнопки <Test Automation> обрано іншу радіокнопку: %s", Arrays.asList(obraniRadioknopky));
            System.out.printf("=========================%n");
        }
    }
}
