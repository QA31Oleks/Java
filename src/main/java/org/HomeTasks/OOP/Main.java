package org.HomeTasks.OOP;

public class Main {
    public static void main(String[] args) {

        PCtoString myTablets = new Tablets();
        myTablets.setROM(240.5);
        System.out.println("Оперативна пам'ять планшету: " + myTablets.getROM());
        Laptops myLaptop = new Laptops();
        myLaptop.setWeight(500);
        myLaptop.setRAM(128);
        System.out.println("Вага ноутбука: " + myLaptop.getWeight());
        System.out.println("Оперативна пам'ять ноутбука: " + myLaptop.getRAM());
        System.out.printf("%s", myTablets);
    }
}
