package org.Lessons.Lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Main {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        RozetkaPage rozetkaPage = PageFactory.initElements(webDriver, RozetkaPage.class);//запуск аннотаций @FindBy
        rozetkaPage.setUrl("https://hard.rozetka.com.ua/ua/monitors/c80089/");
        String expected = "Мониторы";
        String actual = rozetkaPage.checkTitle();

        if (expected.equals(actual)){
            System.out.println("Ok");
        }else {
            System.out.println("Error");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
        rozetkaPage.clickProduct();
    }
}
