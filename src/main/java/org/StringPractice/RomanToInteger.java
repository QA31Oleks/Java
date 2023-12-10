package org.StringPractice;

public class RomanToInteger {
    public static void main(String[] args) {
        /*
        *
        *   I         1
            V         5
            X         10
            L         50
            C         100
            D         500
            M         1000
        * */
        String s1 = "IVXLCDM";
        String s2 = "";
        int x = 99;
        if (x <= 5){
            System.out.println(fiveMethod(x));
        } else if (x > 5 && x <= 10){
            System.out.println(tenMethod(x));
        } else if (x > 10 && x <= 50) {
            System.out.println(fiftyMethod(x));
        } else if (x > 50 && x <=100) {
            System.out.println(hundredMethod(x));
        }
    }

    public static String fiveMethod(int x) {
        switch (x) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            default:
                return "??????";
        }
    }
    public static String tenMethod(int x){
        String s = "";
        if (x <= 5){
          s = fiveMethod(x);
        } else if (x > 5 && x <=8) {
            s = fiveMethod(5) + fiveMethod(x - 5);
        } else if (x == 9) {
            s = "IX";
        } else if (x == 10) {
            s = "X";
        }
        return s;
    }
    public static String fiftyMethod(int x){
        String s = "";
        if (x <= 20) {
            s = "X" + tenMethod(x - 10);
        } else if (x > 20 && x <= 30){
            s = "XX" + tenMethod(x - 20);
        } else if (x > 30 && x <= 39) {
            s = "XXX" + tenMethod(x - 30);
        } else if (x == 40) {
            s = "XL";
        } else if (x > 40 && x < 50) {
            s = "XL" + tenMethod(x - 40);
        } else if (x == 50){
            s = "L";
        }
        return s;
    }
    public static String hundredMethod(int x){
        String s = "";
        if (x > 50 && x < 89){
            s = "L" + fiftyMethod(x - 50);
        } else if (x == 89) {
            s = "IXC";
        } else if (x == 90) {
            s = "XC";
        } else if (x > 90 && x < 99) {
            s = "XC" + tenMethod(x - 90);
        } else if (x == 100) {
            s = "C";
        } else if (x == 99) {
            s = "IC";
        }
        return s;
    }
}
