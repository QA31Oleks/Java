package org.Lessons.Lesson6;

public class ExceptionsExample {
    public static void main(String[] args) {

        int first = 10;
        int second = 5;

        second = 0;

        if(second > 0) {
            System.out.println(first / second);
        }else {
          System.out.println("Будет деление на ноль");
        }


        int[] arr = {10, 54, 65};

        int index = 3;
        if(index < arr.length) {
            System.out.println(arr[index]);
        }else {
            System.out.println("Выход за массив");
        }

        System.out.println("Завершение работы");
    }
}
