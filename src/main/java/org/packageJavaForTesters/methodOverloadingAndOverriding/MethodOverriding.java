package org.packageJavaForTesters.methodOverloadingAndOverriding;

public class MethodOverriding extends MethodOverLoading{
    public static void main(String[] args) {

        MethodOverriding mo = new MethodOverriding();
        mo.login("123");
        mo.login("123", "123");
    }

    // method has the same name as method in parents class
    // overriding also requires the same signature in parameters
    // if signatures was difference it wouldn't be overriding
    public void login(String email) {
        System.out.println("Login successful using email: " + email);
    }
}
