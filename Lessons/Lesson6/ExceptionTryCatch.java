package org.Lessons.Lesson6;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.NoSuchElementException;

public class ExceptionTryCatch {
    public static void main(String[] args) {


        int first = 10;
        int second = 5;

        second = 0;
        try {
            System.out.println(first / second);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }


        int[] arr = {10, 54, 65};

        try {
            int index = 3;
            System.out.println(arr[index]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Завершение работы");

    }
}
