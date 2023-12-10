package org.HomeTasks.Task2109;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class CheckboxAndRadiobuttons {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task2109\\hw5.html");

        List<WebElement> checkboxyAndRadioknopky = webDriver.findElements(By.tagName("input"));
        ArrayList obraniCheckboxy = new ArrayList<>();
        ArrayList obraniRadioknopky = new ArrayList<>();

        int kilkistCheckbox = 0;
        int kilkistRadioknopok = 0;
        for (WebElement element : checkboxyAndRadioknopky) {

            if (element.getAttribute("type").equals("checkbox")) {
                kilkistCheckbox++;
            } else {
                kilkistRadioknopok++;
            }
            element.click();
        }
        System.out.println("Кількість чекбоксів: " + kilkistCheckbox);
        System.out.println("Кількість радіокнопок: " + kilkistRadioknopok);
        System.out.println("=========================");

        int zminnaDlyaArrlistaCheckboxy = 0;
        int zminnaDlyaArrlistaRadioknopky = 0;
        for (WebElement element : checkboxyAndRadioknopky) {
            if (element.isSelected() == true && element.getAttribute("type").equals("checkbox")) {
                obraniCheckboxy.add(zminnaDlyaArrlistaCheckboxy++, element.getAttribute("value"));
            }
            if (element.isSelected() == true && element.getAttribute("type").equals("radio")) {
                obraniRadioknopky.add(zminnaDlyaArrlistaRadioknopky++, element.getAttribute("value"));
            }
        }
        if (obraniCheckboxy.size() > 1) {
            System.out.println("Обрано не лише чекбокс <Java>.\nПерелік обраних чекбоксів: " + obraniCheckboxy);
            System.out.println("=========================");
        } else if (obraniCheckboxy.contains("Java")) {
            System.out.println("Обрано лише чекбокс <Java>");
            System.out.println("=========================");
        } else {
            System.out.println("Чекбокс <Java> не обрано. \nЗамість чекбоксу <Java> обрано чекбокс: " + obraniCheckboxy);
            System.out.println("=========================");
        }

        if (obraniRadioknopky.size() > 1) {
            System.out.println("Обрано не лише радіокнопку <Test Automation>.\nПерелік обраних радіокнопок: " + obraniRadioknopky);
        } else if (obraniRadioknopky.contains("Test Automation")) {
            System.out.println("Обрано лише радіокнопку <Test Automation>");
        } else {
            System.out.println("Радіокнопку <Test Automation> не обрано. \nЗамість радіокнопки <Test Automation> обрано радіокнопку: " + obraniRadioknopky);
        }

        webDriver.quit();
    }
}
