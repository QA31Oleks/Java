package org.generalPractice.ImprovingSkills;

public class SumOfNumber {
    public static void main(String[] args) {
        System.out.println(sumOfNum(10));
    }
    public static int sumOfNum(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i;
        }
        return sum;
    }
}
