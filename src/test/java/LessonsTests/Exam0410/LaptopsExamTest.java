package LessonsTests.Exam0410;

//import org.example.Exam0410.LaptopsExam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopsExamTest {
    // перевірка чекбоксів
/*    @Test
    void loptopsCheckbox() {
        WebDriver webDriver = new ChromeDriver();
        LaptopsExam laptopsExam = new LaptopsExam();
        laptopsExam.selectPopularAndTopFavorite(webDriver);
        Assertions.assertEquals(true,
                laptopsExam.isOnlyGamesCheckboxSelected(webDriver));
    }
    // перевірка заголовку ноутбуку
    @Test
    void loptopsCheckH1() {
        WebDriver webDriver = new ChromeDriver();
        LaptopsExam laptopsExam = new LaptopsExam();
        laptopsExam.selectPopularAndTopFavorite(webDriver);
        laptopsExam.clickLaptop(webDriver);
        Assertions.assertEquals("Laptop Allview Allbook H cu procesor " +
                        "Intel Celeron N4000 pana la 2.60 GHz, 15.6\", Full HD, " +
                        "4GB, 256GB SSD, Intel UHD 600, Ubuntu, Grey",
                webDriver.findElement(By.tagName("h1")).getText());
    }
    // перевірка, чи тільки iphone відображаються після пошуку
    @Test
    void chekingOnlyIphoneAfterSearch() {
        WebDriver webDriver = new ChromeDriver();
        LaptopsExam laptopsExam = new LaptopsExam();
        laptopsExam.selectPopularAndTopFavorite(webDriver);
        laptopsExam.clickLaptop(webDriver);
        laptopsExam.searchIphone(webDriver);
        for (WebElement element : laptopsExam.formsList(webDriver)) {
            Assertions.assertEquals(true, element.getText().contains("iPhone 15"));
        }
    }
    // перевірка ціни iphone
    @Test
    void chekingPriceOfIphone(){
        WebDriver webDriver = new ChromeDriver();
        LaptopsExam laptopsExam = new LaptopsExam();
        laptopsExam.selectPopularAndTopFavorite(webDriver);
        laptopsExam.clickLaptop(webDriver);
        laptopsExam.searchIphone(webDriver);
        laptopsExam.clickIphone15Pro(webDriver);
        Assertions.assertEquals("5.949,99 Lei",
                webDriver.findElement(By.xpath(
                "//*[@id=\"main-container\"]/section[3]" +
                        "/div/div[1]/div[2]/div/div[2]/div[2]/form" +
                        "/div/div[1]/div[1]/div/div/div[1]/p[2]")).getText());
    }*/
}

