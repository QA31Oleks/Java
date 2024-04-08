package org.packageJavaForTesters.constructorClass;

public class ConstructorClass {
    // Constructor must have the same name as class
    // No return type
    public ConstructorClass() {
        // String returnString = "String";
        // return returnString;
        System.out.println("Object created");
    }
    public static void main(String[] args) {
        ConstructorClass cc = new ConstructorClass();
    }
}
