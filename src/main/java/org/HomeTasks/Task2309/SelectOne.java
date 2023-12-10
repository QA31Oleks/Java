package org.HomeTasks.Task2309;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOne {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task2309\\select_practice.html");

        isValueContain(webDriver, "Volvo", "value:volvo");
        isValueContain(webDriver, "Saab", "value:saab");
        isValueContain(webDriver, "Mercedes", "value:mercedes");
        isValueContain(webDriver, "Audi", "value:audio");
    }

    public static void isValueContain(WebDriver webDriver, String brand, String value) throws InterruptedException {

        WebElement carBrand = webDriver.findElement(By.xpath("/html/body/div[1]/form/label/select"));
        Select select = new Select(carBrand);

        if (brand.equals("Volvo")) {
            select.selectByIndex(1);
            Thread.sleep(1000);
        } else if (brand.equals("Saab")) {
            select.selectByValue("saab");
            Thread.sleep(1000);
        } else if (brand.equals("Mercedes")) {
            select.selectByVisibleText("Mercedes");
            Thread.sleep(1000);
        } else if (brand.equals("Audi")) {
            select.selectByIndex(4);
            Thread.sleep(1000);
        }
        WebElement elementOut1 = webDriver.findElement(By.id("out1"));
        if (elementOut1.getText().equals(value)) {
            System.out.printf("Елемент з id 'out1' містить значення '%s'%n", value);
        } else {
            System.out.printf("Елемент з id 'out1' не містить значення '%s'%n", value);
        }
    }
}
