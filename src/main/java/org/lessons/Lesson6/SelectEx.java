package org.lessons.Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson6\\SelectEx.html");
        WebElement colors = webDriver.findElement(By.xpath("//select[@id='colors']"));
        Select select = new Select(colors);
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByValue("blue");
        Thread.sleep(1000);
        select.selectByVisibleText("Green");

        WebElement languages = webDriver.findElement(By.xpath("//select[@id='languages']"));
        Select multyselect = new Select(languages);
        multyselect.selectByIndex(0);
        Thread.sleep(1000);
        multyselect.selectByValue("python");
        Thread.sleep(1000);
        multyselect.selectByVisibleText("C#");

        if (multyselect.isMultiple()){
            //multyselect.deselectAll();
            multyselect.selectByVisibleText("C#");
        }

        List<WebElement> allMultyOptions = multyselect.getAllSelectedOptions();
        List<WebElement> allSingleOptions = select.getAllSelectedOptions();

        for (WebElement allMulty : allMultyOptions){
            System.out.println(allMulty.getText());
        }
    }
}
