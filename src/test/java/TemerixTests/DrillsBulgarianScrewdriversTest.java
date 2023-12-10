package TemerixTests;

import org.Temerix.Task1.DrillsBulgarianScrewdrivers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class DrillsBulgarianScrewdriversTest {
    DrillsBulgarianScrewdrivers d = new DrillsBulgarianScrewdrivers();

    // Завдання 1. Порівняння цін у розділі 'Дрилі'
    @Test
    void checkingPricesDrills() {
        d.openPageDrills();
        d.createListPromotionalGoods(3);
        String[] linksToCards = new String[d.promotionalGoods.size()];
        String[] oldPrices = new String[d.promotionalGoods.size()];
        String[] newPrices = new String[d.promotionalGoods.size()];
        for (int i = 0; i < linksToCards.length; i++) {
            linksToCards[i] = d.promotionalGoods.get(i).findElement(By.tagName("a")).getAttribute("href");
            oldPrices[i] = d.promotionalGoods.get(i).findElement(By.cssSelector(".old-price")).getText();
            newPrices[i] = d.promotionalGoods.get(i).findElement(By.cssSelector(".price")).getText();
        }
        for (int i = 0; i < linksToCards.length; i++) {
            d.webDriver.get(linksToCards[i]);
            Assertions.assertEquals(oldPrices[i], d.webDriver.findElement(By.cssSelector(".item-text .price-row .old-price")).getText());
            Assertions.assertEquals(newPrices[i], d.webDriver.findElement(By.cssSelector(".item-text .price-row .price")).getText());

            d.actions.pause(1000).perform();
            d.navigation.back();
            d.actions.pause(1000).perform();
        }
        d.actions.pause(1000).perform();
        d.webDriver.quit();
    }

    // Завдання 2. Перевірка акційних пропозицій в розділі 'Перфоратори'
    @Test
    void promotionPerforators() {
        Assertions.assertEquals(true, d.checkingPromotionPerforators());
        d.webDriver.quit();
    }

    // Завдання 3. Пошук та вивід товарів з іконкою 'Кредит частинами' розділу 'Болгарки'
    @Test
    void creditBulgarianGoods() {
        d.creditBulgarian();
        d.webDriver.quit();
    }

    // Завдання 4. Пошук акційних товарів в розділі 'Шурупокрути' та розрахунок відсотка знижки
    @Test
    void screwdriversPercentDiscounts() {
        d.openSectionOfGood("https://kulibin.com.ua/ua/catalog/shurupoverty/");
        d.createListPromotionalGoods(10);
        String oldPriceWithoutLetters = "";
        String newPriceWithoutLetters = "";
        for (int i = 0; i < 10; i++) {
            String oldPriceWithLetters = d.promotionalGoods.get(i).findElement(By.cssSelector(".old-price")).getText();
            for (int j = 0; j < oldPriceWithLetters.length() - 5; j++) {
                oldPriceWithoutLetters = oldPriceWithoutLetters + oldPriceWithLetters.charAt(j);
            }
            String newPriceWithLetters = d.promotionalGoods.get(i).findElement(By.cssSelector(".price")).getText();
            for (int j = 0; j < newPriceWithLetters.length() - 5; j++) {
                newPriceWithoutLetters = newPriceWithoutLetters + newPriceWithLetters.charAt(j);
            }
            oldPriceWithoutLetters = oldPriceWithoutLetters.replaceAll("\\s", "");
            Double d1 = Double.valueOf(oldPriceWithoutLetters);
            newPriceWithoutLetters = newPriceWithoutLetters.replaceAll("\\s", "");
            Double d2 = Double.valueOf(newPriceWithoutLetters);
            Assertions.assertNotEquals(d2, d1, d.promotionalGoods.get(i).findElement(By.tagName("h4")).getText());
        }
        d.webDriver.quit();
    }
}
