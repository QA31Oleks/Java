package org.Temerix.Task1;
public class DrillsMain {
    public static void main(String[] args) {
        DrillsBulgarianScrewdrivers d = new DrillsBulgarianScrewdrivers();

        System.out.println("Завдання 1. Порівняння цін у розділі 'Дрилі'");
        d.openPageDrills();
        d.checkingPriceDrills();

        System.out.println("Завдання 2. Перевірка акційних пропозицій в розділі 'Перфоратори'");
        if (d.checkingPromotionPerforators()) {
            System.out.println("Принаймні в одного товару розділу 'Перфоратори' є тікет 'Акція'");
        } else {
            System.out.println("В жодного товару немає тікету 'Акція'");
        }
        System.out.println("= = = = = = = = = = = = =\n");

        System.out.println("Завдання 3. Пошук та вивід товарів з іконкою 'Кредит частинами' розділу 'Болгарки'");
        d.creditBulgarian();

        System.out.println("Завдання 4. Пошук акційних товарів в розділі 'Шурупокрути' та розрахунок відсотка знижки");
        d.screwdriversDiscountCalculation();

    }
}
