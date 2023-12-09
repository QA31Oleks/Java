package org.Lessons.Exam0410;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MainLaptops {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        LaptopsExam laptopsExam = new LaptopsExam();
        laptopsExam.selectPopularAndTopFavorite(webDriver);
        laptopsExam.clickLaptop(webDriver);
        laptopsExam.searchIphone(webDriver);
        laptopsExam.clickIphone15Pro(webDriver);
        System.out.println(webDriver
                .findElement(By.xpath(
                        "//*[@id=\"main-container\"]/section[3]" +
                                "/div/div[1]/div[2]/div/div[2]/div[2]/form" +
                                "/div/div[1]/div[1]/div/div/div[1]/p[2]")).getText());
    }
}
