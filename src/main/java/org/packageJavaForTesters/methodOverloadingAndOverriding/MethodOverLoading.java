package org.packageJavaForTesters.methodOverloadingAndOverriding;

public class MethodOverLoading {
    public static void main(String[] args) {

        MethodOverLoading mo = new MethodOverLoading();
        mo.login(123, "qqq");
        mo.login("123", "qqq");

    }

    public void login(String s, String p) {
        System.out.println("Login successful using username and password");
    }

    public void login(int i, String p) {
        System.out.println("Login successful using phonenumber and password");
    }
}

