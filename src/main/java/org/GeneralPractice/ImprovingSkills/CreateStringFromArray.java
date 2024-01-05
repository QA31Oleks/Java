package org.GeneralPractice.ImprovingSkills;

import java.util.Arrays;

public class CreateStringFromArray {
    public static void main(String[] args) {
        // type "byte" is necessary
        byte arr[] = {50, 61};
        String firstString = new String(arr);
        System.out.println(firstString);
//        byte ascii[] = { 71, 70, 71 };
//
//        String firstString = new String(ascii);
//        System.out.println(firstString);
//
//        String secondString = new String(ascii, 1, 2);
//        System.out.println(secondString);
    }
}
