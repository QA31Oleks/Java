package org.lessons.Lesson10.JUnit;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();

        int res = application.sum(10, 20);
        int expected = 30;

       if(expected == res){
           System.out.println("test OK");
       }else {
           System.out.println("test ERROR");
           System.out.println("expected = " + expected);
           System.out.println("res = " + res);
       }

//================================

         res = application.sum(-10, -20);
         expected = -30;

        if(expected == res){
            System.out.println("test OK");
        }else {
            System.out.println("test ERROR");
            System.out.println("expected = " + expected);
            System.out.println("res = " + res);
        }

    }


    public int sum(int num1, int num2) {
        return num1 + ++num2;
    }

}
