package org.homeTasks.Task2910;

import java.util.ArrayList;
import java.util.List;

public class RangesClass {

    public int counter = 0;
    public int counterArrays = 1;

    private List<Integer> array1 = randomArray(-4, 5);
    private List<Integer> array2 = randomArray(-10, -7);
    private List<Integer> array3 = randomArray(6, 15);

    public List<Integer> getArray1() {
        return array1;
    }
    public List<Integer> getArray2() {
        return array2;
    }
    public List<Integer> getArray3() {
        return array3;
    }

    public List randomArray(int r1, int r2) {
        counter = 0;
        List<Integer> arrayRandom = new ArrayList<>();
        if (r1 < r2) {
            for (int i = r1; i < r2; i++) {
                arrayRandom.add(counter++, i);
            }
        } else {
            for (int i = r1; i >= r2; i--) {
                arrayRandom.add(counter++, i);
            }
        }
        return arrayRandom;
    }
    public void counter(List<Integer> array){
        int i = 0;
        for (Integer a : array){
            i++;
        }
        System.out.println("Range of array #" + counterArrays++ + " = " + i + "\n * * * * * ");

    }

    public boolean isStartBigger(List<Integer> array) {
        boolean startBigger = false;
        if (array.get(0) > array.get(array.size()-1)) {
            startBigger = true;
        }
        return startBigger;
    }

    public boolean isArraysCrossing(List<Integer> array1, List<Integer> array2, List<Integer> array3) {
        boolean crossing = false;
            for (int i = 0; i < array1.size(); i++) {
                for (Integer element : array2) {
                    if (element == array1.get(i)) {
                        crossing = true;
                        break;
                    }
                }
                for (Integer element : array3) {
                    if (element == array1.get(i)) {
                        crossing = true;
                        break;
                    }
                }
            }
            for (int i = 0; i < array2.size(); i++) {
                for (Integer element : array3) {
                    if (element == array2.get(i)) {
                        crossing = true;
                        break;
                    }
                }
            }
        return crossing;
    }
}