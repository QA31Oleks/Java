package org.homeTasks.SeleniumPractice.CheckboxAndRadiobuttonsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class CheckboxAndRadiobuttonsMethods {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task2109\\hw5.html");

        List<WebElement> checkboxyAndRadioknopky = webDriver.findElements(By.tagName("input"));

        System.out.println("Кількість чекбоксів: " + amountCheckbox(checkboxyAndRadioknopky));
        System.out.println("Кількість радіокнопок: " + amountRadiobutton(checkboxyAndRadioknopky));
        System.out.println("=========================");

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
            System.out.println("Обрано не лише чекбокс <Java>.\nПерелік обраних чекбоксів: " + obraniCheckboxy);
            System.out.println("=========================");
        } else if (obraniCheckboxy.size() > 1) {
            System.out.println("Чекбокс <Java> не обрано. \nЗамість чекбоксу <Java> обрано інші чекбокси: " + obraniCheckboxy);
            System.out.println("=========================");
        } else if (obraniCheckboxy.contains("Java")) {
            System.out.println("Обрано лише чекбокс <Java>");
            System.out.println("=========================");
        } else {
            System.out.println("Чекбокс <Java> не обрано. \nЗамість чекбоксу <Java> обрано інший чекбокс: " + obraniCheckboxy);
            System.out.println("=========================");
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
            System.out.println("Обрано не лише радіокнопку <Test Automation>.\nПерелік обраних радіокнопок: " + obraniRadioknopky);
            System.out.println("=========================");
        } else if (obraniRadioknopky.size() > 1) {
            System.out.println("Радіокнопку <Test Automation> не обрано. \nЗамість радіокнопки <Test Automation> обрано інші радіокнопки: " + obraniRadioknopky);
            System.out.println("=========================");
        } else if (obraniRadioknopky.contains("Test Automation")) {
            System.out.println("Обрано лише радіокнопку <Test Automation>");
            System.out.println("=========================");
        } else {
            System.out.println("Радіокнопку <Test Automation> не обрано. \nЗамість радіокнопки <Test Automation> обрано іншу радіокнопку: " + obraniRadioknopky);
            System.out.println("=========================");
        }
    }
}
