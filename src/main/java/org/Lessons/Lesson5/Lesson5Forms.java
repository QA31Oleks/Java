package org.Lessons.Lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson5Forms {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\Evgeniy\\IdeaProjects\\QA31Selenium\\src\\main\\java\\org\\example\\Lesson5\\forms\\forms.html");


        WebElement name = webDriver.findElement(By.name("name"));
        WebElement password = webDriver.findElement(By.name("password"));

        name.sendKeys("Jack");
        Thread.sleep(1000);
        password.sendKeys("123456");


        Thread.sleep(3000);

        //у любого элемента вормы вызываем метод для отправки данных
        //name.submit();

        webDriver.findElement(By.tagName("button")).click();


        WebElement checkBox = webDriver.findElement(By.name("languages"));

        //checkboxes, options in a select and radio buttons
        checkBox.isSelected();

    }
}
