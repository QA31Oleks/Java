package org.lessons.Lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowsMy {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson8\\windows.html");

        webDriver.findElement(By.partialLinkText("Remove")).click();

        String mainHandle = webDriver.getWindowHandle();
        System.out.printf("%s%n", mainHandle);

        Set<String> windowHandles = webDriver.getWindowHandles();

        int index = 0;
        for (String windowHandle : windowHandles){
            if (index == windowHandles.size()-1){
                webDriver.switchTo().window(windowHandle);
            }
            index++;
        }

        try {
            System.out.printf("%s%n", webDriver.findElement(By.tagName("h1")).getText());
        } catch (Exception e){
            System.out.printf("%s%n", e.getMessage());
        }
        System.out.printf("Title дописати%n");

        webDriver.quit();
    }
}
