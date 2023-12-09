package org.HomeTasks.Printf;

import java.util.Arrays;

public class ArrSimplePrintf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int randomzminna : arr){
            System.out.println(randomzminna);
        }
        System.out.printf("%d, %d, %d, %d, %d\n", arr[0], arr[1], arr[2], arr[3], arr[4]);
        System.out.printf("%s", Arrays.toString(arr));

        // System.out.printf("Чекбокс <Java> не обрано. %nnЗамість чекбоксу <Java> обрано інший чекбокс: %s%n", Arrays.asList(obraniCheckboxy)); - для ArrList
    }
}
