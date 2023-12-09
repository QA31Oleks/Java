package org.Lessons.Lesson5.OOP;

public interface Animal {

     int COUNT_POVS = 4;


     void eat();

     void drink();

     void gadit();

     void test();

     static void staticMethod(){
          System.out.println("I am a static method");
     }

     default void defaultMethod(){
          System.out.println("All animals drink water");
          privateMethod();
     }


     default void privateMethod(){
          System.out.println("Private method");
     }

}
