package org.GeneralPractice.ImprovingSkills;

public class DisplayNumberFromList {
    public static void main(String[] args) {
        int[] numbers = {12, 75, 150, 180, 145, 525, 50};
        displayNumber(numbers);
    }
    public static void displayNumber(int[] list){
        for (int i : list){
            if (i % 5 == 0 && i <= 150){
                System.out.println(i);
            }
        }
    }
}
