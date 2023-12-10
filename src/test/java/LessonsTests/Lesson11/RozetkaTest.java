package LessonsTests.Lesson11;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RozetkaTest {
    WebDriver webDriver;

    @BeforeEach
    public void init(){
        System.out.println("start");
        webDriver = new ChromeDriver();
    }


    @AfterEach
    public void end(){
        webDriver.quit();
        System.out.println("finish");
    }

    @Disabled
    public void checkLaptopName() {
        webDriver.get("https://rozetka.com.ua/ua/notebooks/c80004/");
        WebElement laptop = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]/a[2]/span"));
        laptop.click();
        Assertions.assertEquals("Ноутбук Acer Aspire 7 A715-43G-R92H (NH.QHHEU.00G) Charcoal Black / AMD Ryzen 5 5625U / RAM 16 ГБ / SSD 512 ГБ / nVidia GeForce RTX 3050 Ti, 4 ГБ / Підсвічування клавіатури",
                webDriver.findElement(By.tagName("h1")).getText());
    }


    @ParameterizedTest
    @ValueSource(strings = {
            "https://rozetka.com.ua/ua/notebooks/c80004/",
            "https://hard.rozetka.com.ua/ua/computers/c80095/",
            "https://hard.rozetka.com.ua/ua/monitors/c80089/" })
    void laptops(String link) {
        webDriver.get(link);
        WebElement laptop = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]/a[2]/span"));
        laptop.click();
        Assertions.assertEquals("Ноутбук Acer Aspire 7 A715-43G-R92H (NH.QHHEU.00G) Charcoal Black / AMD Ryzen 5 5625U / RAM 16 ГБ / SSD 512 ГБ / nVidia GeForce RTX 3050 Ti, 4 ГБ / Підсвічування клавіатури",
                webDriver.findElement(By.tagName("h1")).getText());
    }


    @ParameterizedTest
    @CsvSource({
            "https://rozetka.com.ua/ua/notebooks/c80004/, Ноутбуки",
            "https://hard.rozetka.com.ua/ua/computers/c80095/, Компьютеры",
            "https://hard.rozetka.com.ua/ua/monitors/c80089/, Мониторы" })
    void laptopsTiles(String link, String titles) {
        webDriver.get(link);
        Assertions.assertEquals(titles, webDriver.findElement(By.tagName("h1")).getText());
    }



    @RepeatedTest(20)
    public void repeatFive(){
        webDriver.get("https://rozetka.com.ua/ua/notebooks/c80004/");
        Assertions.assertEquals("Ноутбуки", webDriver.findElement(By.tagName("h1")).getText());
    }
}
