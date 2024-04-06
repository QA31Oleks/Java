package org.homeTasks.Task0410;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SetHadles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task0410\\windows.html");

        String mainHandle = webDriver.getWindowHandle();
        System.out.printf("mainHandle = %s%n = = = = = =%n", mainHandle);

        webDriver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();

        Set<String> windowTwoHandles = webDriver.getWindowHandles();

        String secondHandle = "";
        int index = 0;
        for (String handles : windowTwoHandles) {
            if (index == windowTwoHandles.size() - 1) {
                secondHandle = handles;
            }
            index++;
        }

        webDriver.switchTo().window(secondHandle);
        System.out.printf("Title of 2 window = %s%n = = = = = =%n", webDriver.getTitle());
        webDriver.switchTo().window(mainHandle);

        webDriver.findElement(By.id("button1")).click();
        Set<String> windowThreeHandles = webDriver.getWindowHandles();
        int i = 1;
        for (String handles : windowThreeHandles) {
            webDriver.switchTo().window(handles);
            System.out.printf("Handle of %d window = %s%n", i, handles);
            System.out.printf("Title of %d window = %s%n = = = = = =%n", i++, webDriver.getTitle());
            Thread.sleep(1000);
            webDriver.close();
        }
    }
}
