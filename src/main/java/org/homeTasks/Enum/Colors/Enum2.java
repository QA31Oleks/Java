package org.homeTasks.Enum.Colors;

public class Enum2 {
    public static void main(String[] args) {

        // виводимо всі значення констант класу enum Kolir
        for (Kolir k : Kolir.values()){
            System.out.printf("%s %s%n", k, k.getRGB());
        }
    }
}
