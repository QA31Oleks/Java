package org.generalPractice.Demo;

public class FormatPractice {
    public static void main(String[] args) {
        String str1 = "String";
        String str2 = "Added";
        String str = String.format("%s%n%s", str1, str2);
        System.out.println(str);

        // String.substring()
        String strInsert = str1.substring(0, 3);
        strInsert += str2;
        strInsert += str1.substring(3, str1.length() - 1);
        System.out.println(strInsert);

        System.out.println();
        String strMemorySell1 = "String";
        String strMemorySell2 = "String";
        String strMemorySell3 = "String";
        String strObject1 = new String("String");
        String strObject2 = new String("String");
        String strObject3 = new String("StringNotEquals");
        System.out.println(strObject1.equals(strObject2));
        System.out.println(strObject1.equals(strObject3));
        System.out.println(strMemorySell1==strMemorySell2 && strMemorySell2==strMemorySell3);

    }
}
