package org.generalPractice.StringPractice;

public class StringPlusString {
    public static void main(String[] args) {

        String first = "Hello";
        String second = "World";

        String third = first + second;
        System.out.println(third);

        // yet another way to concatenate strings
        first += second;
        System.out.println(first);
    }
}

