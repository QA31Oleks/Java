package org.generalPractice.ImprovingSkills;

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

//        char characters[] = { 'G', 'f', 'g' };
//
//        String firstString = new String(characters);
//        String secondString = new String(firstString);
//
//        System.out.println(firstString);
//        System.out.println(secondString);
    }
}
