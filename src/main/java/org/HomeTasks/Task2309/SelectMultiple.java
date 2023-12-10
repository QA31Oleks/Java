package org.HomeTasks.Task2309;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectMultiple {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task2309\\select_practice.html");

        Select multiselect = new Select(webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/label/select")));
        multiselect.selectByIndex(0);
        Thread.sleep(500);
        isContain(webDriver, "Cheese");

        multiselect.selectByValue("Pepperoni");
        Thread.sleep(500);
        isContain(webDriver, "Cheese", "Pepperoni");

        multiselect.selectByVisibleText("Mushrooms");
        Thread.sleep(500);
        isContain(webDriver, "Cheese", "Pepperoni", "Mushrooms");

        multiselect.deselectAll();

        isDeselectedElement(webDriver);
    }
    public static void isContain(WebDriver webDriver, String nameFood1) {

        WebElement elementOut2 = webDriver.findElement(By.id("out2"));
        List<WebElement> multiOptions = elementOut2.findElements(By.tagName("option"));

        System.out.printf("У першому випадаючому списку 'Multiple select' обрано елементи:%n");
        for (WebElement element : multiOptions) {
            System.out.printf("%s%n", element.getText());
        }
        System.out.printf("* * * * * * * * * * * * * *%n");

        for (WebElement element : multiOptions) {
            if (element.getText().equals(nameFood1)) {
                System.out.printf("Select елемент з id 'out2' містить значення '%s'%n", nameFood1);
            } else {
                System.out.printf("Select елемент з id 'out2' не містить значення '%s'%n", nameFood1);
            }
        }
        System.out.printf("=========================%n");
    }
    public static void isContain(WebDriver webDriver, String nameFood1, String nameFood2) {

        WebElement elementOut2 = webDriver.findElement(By.id("out2"));
        List<WebElement> multiOptions = elementOut2.findElements(By.tagName("option"));

        System.out.printf("У першому випадаючому списку 'Multiple select' обрано елементи:%n");
        for (WebElement element : multiOptions) {
            System.out.printf("%s%n", element.getText());
        }
        System.out.printf("* * * * * * * * * * * * * *%n");

        for (WebElement element : multiOptions) {
            if (element.getText().equals(nameFood1) || element.getText().equals(nameFood2)) {
                System.out.printf("Select елемент з id 'out2' містить значення '%s'%n", element.getText());
            } else {
                System.out.printf("Select елемент з id 'out2' не містить значення '%s' або '%s'%n", nameFood1, nameFood2);
            }
        }
        System.out.printf("=========================%n");
    }

    public static void isContain(WebDriver webDriver, String nameFood1, String nameFood2, String nameFood3) {

        WebElement elementOut2 = webDriver.findElement(By.id("out2"));
        List<WebElement> multiOptions = elementOut2.findElements(By.tagName("option"));

        System.out.println("У першому випадаючому списку 'Multiple select' обрано елементи:");
        for (WebElement element : multiOptions) {
            System.out.println(element.getText());
        }
        System.out.println("* * * * * * * * * * * * * *");

        for (WebElement element : multiOptions) {
            if (element.getText().equals(nameFood1) || element.getText().equals(nameFood2) || element.getText().equals(nameFood3)) {
                System.out.printf("Select елемент з id 'out2' містить значення '%s'%n", element.getText());
            } else {
                System.out.printf("Select елемент з id 'out2' не містить значення '%s' або '%s' або '%s'%n", nameFood1, nameFood2, nameFood3);
            }
        }
        System.out.printf("=========================%n");
    }
    public static void isDeselectedElement(WebDriver webDriver){
        WebElement elementOut2 = webDriver.findElement(By.id("out2"));
        List<WebElement> multiOptions = elementOut2.findElements(By.tagName("option"));

        if (multiOptions.size() > 0) {
            System.out.printf("У списку з id = out2 наявні елементи:%n");
                for (WebElement element : multiOptions) {
                        System.out.printf("%s%n", element.getText());
                        System.out.printf("==========================%n");
                }
        } else {
            System.out.printf("У списку з id = out2 відсутні елементи%n");
            System.out.printf("==========================%n");
        }
    }
}
