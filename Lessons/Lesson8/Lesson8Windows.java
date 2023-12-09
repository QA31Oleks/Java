package org.Lessons.Lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Lesson8Windows {


    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\User\\IdeaProjects\\QA31\\src\\main\\java\\org\\example\\Lesson8\\windows.html");

        webDriver.findElement(By.partialLinkText("Remove")).click();

        //хендл главного окна
        String mainHandle = webDriver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        //получить хендлы всех окон
        Set<String> windowHandles = webDriver.getWindowHandles();

        System.out.println("--------------");

        String secondHandle = "";

        //ищем хендл второго окна
        int index = 0;
        for (String windowHandle : windowHandles) {
            System.out.println("windowHandle = " + windowHandle);
            if (index == windowHandles.size() - 1) {
                secondHandle = windowHandle;
            }
            index++;
        }

        webDriver.switchTo().window(secondHandle);

        System.out.println("Title = " + webDriver.getTitle());
        try {
            System.out.println("h1 = " + webDriver.findElement(By.tagName("h1")).getText());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //генерируем новое окно
        ((JavascriptExecutor) webDriver).executeScript("window.open('https://rozetka.com.ua/')");


        windowHandles = webDriver.getWindowHandles();
        System.out.println("--------------");

        //ищем новое окно методом исключения
        String thirdHandle = "";
        for (String windowHandle : windowHandles) {
            System.out.println("windowHandle = " + windowHandle);
            if (!(windowHandle.equals(mainHandle) && windowHandle.equals(secondHandle))) {
                thirdHandle = windowHandle;
            }
            index++;
        }

        System.out.println("--------------");

        System.out.println("thirdHandle = " + thirdHandle);

        webDriver.switchTo().window(thirdHandle);
        System.out.println("Title = " + webDriver.getTitle());


        //генерируем новое окно switchTo()

        webDriver.switchTo().newWindow(WindowType.TAB);//создает и переходит на полностью пустое новое окно
        Thread.sleep(1500);
        webDriver.get("https://developer.mozilla.org/en-US/docs/Web/API/Window/open");
        System.out.println("Title = " + webDriver.getTitle());


        //должен вернуть на главную страницу(frame)
        //webDriver.switchTo().defaultContent();

        webDriver.switchTo().window(mainHandle);

        System.out.println("Title = " + webDriver.getTitle());

    }
}
