package org.homeTasks.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableListClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task1609\\automation-practice-table.html");

        String[] title = {
                "Бурдж-Халифа",
                "Абрадж аль-Бейт",
                "Тайбэй таун",
                "Шанхайский всемирный финансовый центр"
        };

        WebDriver.Navigation navigation = webDriver.navigate();
        List<WebElement> links = webDriver.findElements(By.linkText("details"));
        WebElement[] arrList = new WebElement[links.size()];

        int j = 0;
        for (WebElement element : links) {
            arrList[j] = element;
            j++;
            System.out.println(element.getLocation());
        }
        //System.out.println(Arrays.toString(arrList));

        for (int i = 0; i < arrList.length; i++) {
            arrList[i].click();
            if (webDriver.getTitle().equals(title[i])) {
                System.out.println("Title " + title[i] + " Ok");
                System.out.println("==========================");
            } else {
                System.out.println("Title ERROR");
                System.out.println("Expected title = " + title[i]);
                System.out.println("Actual title = " + webDriver.getTitle());
                System.out.println("==========================");
            }
            navigation.back();
        }
        webDriver.quit();
    }
}
