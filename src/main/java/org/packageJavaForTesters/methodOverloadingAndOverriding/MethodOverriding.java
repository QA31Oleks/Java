package org.packageJavaForTesters.methodOverloadingAndOverriding;

public class MethodOverriding extends MethodOverLoading{
    public static void main(String[] args) {

        MethodOverriding mo = new MethodOverriding();
        mo.login("123");
    }
    public void login(String email) {
        System.out.println("Login successful using email: " + email);
    }
}
