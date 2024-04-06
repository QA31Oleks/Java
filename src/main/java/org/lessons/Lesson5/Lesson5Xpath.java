package org.lessons.Lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson5Xpath {

    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\Evgeniy\\IdeaProjects\\QA31Selenium\\src\\main\\java\\org\\example\\Lesson5\\forms\\forms.html");

        WebElement checkbox = webDriver.findElement(By.xpath("/html/body/form/input[5]"));
        checkbox.click();


    }
}
