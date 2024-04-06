package org.homeTasks.Task1609;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableList {
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
        String[] arrList = new String[links.size()];

        for (int i = 0; i < links.size(); i++) {
            arrList[i] = links.get(i).getAttribute("href");
        }

        for (int i = 0; i < arrList.length; i++) {
            navigation.to(arrList[i]);
            if (webDriver.getTitle().equals(title[i])) {
                System.out.println("Title " + title[i] + " Ok");
                System.out.println("==========================");
            } else {
                System.out.println("Title ERROR");
                System.out.println("Expected title = " + title[i]);
                System.out.println("Actual title = " + webDriver.getTitle());
                System.out.println("==========================");
            }
        }
        webDriver.quit();
    }
}
