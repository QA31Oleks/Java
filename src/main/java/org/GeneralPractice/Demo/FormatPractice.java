package org.GeneralPractice.Demo;

public class FormatPractice {
    public static void main(String[] args) {
        String str1 = "String";
        String str2 = "Added";
        String str = String.format("%s%n%s", str1, str2);
        System.out.println(str);

        // String.substring()
        String strInsert = str1.substring(0, 3);
        strInsert += str2;
        strInsert += str1.substring(3, str1.length()-1);
        System.out.println(strInsert);
    }
}
