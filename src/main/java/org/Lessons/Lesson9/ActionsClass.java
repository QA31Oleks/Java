package org.Lessons.Lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson9\\actions.html");

        Actions actions = new Actions(webDriver);

        actions
                .click(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")))
                //  .pause(2000)
                .keyDown(Keys.CONTROL)
                .click(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")))
                .click(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")))
                .click(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")))
                //  .pause(1000)
                .keyUp(Keys.CONTROL)
                .click(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]")))
                //   .pause(1000)
                .click(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")))
                .clickAndHold()
                .moveToElement(webDriver.findElement(By.xpath("//*[@id=\"selectable\"]/li[10]")))
                .perform();


    }
}
