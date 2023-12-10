package org.HomeTasks.Enum.Months;
import java.time.LocalDateTime;

public class Enum1 {
    public static void main(String[] args) {
        switch (getPoraRoku()){
            case PoryRoku.OSIN:
            case PoryRoku.VESNA:
                System.out.printf("Вдягайтесь тепло%n");
                break;
            case PoryRoku.ZYMA:
                System.out.printf("Вдягайтесь не дуже тепло%n");
                break;
                case PoryRoku.LITO:
                System.out.printf("Вдягайтесь легко%n");
                break;
        }
    }
    public static String getPoraRoku(){
        LocalDateTime now = LocalDateTime.now();
        int m = now.getMonthValue();
        switch (m){
            case 1:
            case 2:
            case 12:
                return PoryRoku.ZYMA;
            case 3:
            case 4:
            case 5:
                return PoryRoku.VESNA;
            case 6:
            case 7:
            case 8:
                return PoryRoku.LITO;
            case 9:
            case 10:
            case 11:
                return PoryRoku.OSIN;
            default:
                return "Я не знаю, який зараз місяць";
        }
    }
}
