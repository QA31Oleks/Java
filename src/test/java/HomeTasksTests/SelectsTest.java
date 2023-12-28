package HomeTasksTests;

import org.HomeTasks.Task1610.Selects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

 public class SelectsTest {
   @Test
    public void selectsTest() {
        WebDriver webDriver = new ChromeDriver();
        Selects selects = PageFactory.initElements(webDriver, Selects.class);
        selects.setUrl("C:\\Users\\User\\IdeaProjects\\HomeTasks\\src\\main\\java\\org\\example\\Task2309\\select_practice.html");
        // В класі Selects за допомогою методу multiselectClick
        // обираються інгрідієнти в залежності від значення numberOfSelect
        int numberOfSelect = 8;
        selects.multiselectClick(numberOfSelect);
        Assertions.assertLinesMatch(selects.listOfSelectAdditives(numberOfSelect), selects.listOfSelectElement(webDriver));
    }
}

