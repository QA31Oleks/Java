package org.StringPractice;

import java.util.Random;

public class PalindromeStringChar {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(1, 100000);
        String s = String.valueOf(123321);
        String s2 = "";
        System.out.printf("s = %s%n", s);

/*        int y = 1;
        for (int a = 0; a < s.length(); a++){
            if (s.charAt(a) == s.charAt(s.length() - y++)) {
                System.out.println(a);
            }
        }*/
        for (int a = 0; a < s.length(); a++){
            s2 = s.charAt(a) + s2; // s2 = s2 + s.charAt(a); - зворотній порядок символів
        }
        System.out.println("s2 = " + s2);
        if (s.equals(s2)){
            System.out.println("Palindrome!");
        }
    }
}
