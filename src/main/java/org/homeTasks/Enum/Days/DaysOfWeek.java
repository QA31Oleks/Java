package org.homeTasks.Enum.Days;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DaysOfWeek {
    public static void main(String[] args) {
        switch (determineDay()){
            case PONEDILOK:
                System.out.printf("Йдіть на роботу%n");
                break;
            case CHETVER:
                System.out.printf("Сьогодні четвер");
                break;
            default:
                System.out.printf("Вихідний%n");
        }
    }
    public static DniTyzhnya determineDay(){
        LocalDateTime today = LocalDateTime.now();
        DayOfWeek whichDay = today.getDayOfWeek();
        switch (whichDay){
            case MONDAY:
                return DniTyzhnya.PONEDILOK;
            default:
                return DniTyzhnya.CHETVER;
        }
    }
}

