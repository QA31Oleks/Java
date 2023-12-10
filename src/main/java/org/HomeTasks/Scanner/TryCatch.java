package org.HomeTasks.Scanner;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        boolean stalasyaPomylka = true;
        while (stalasyaPomylka) {
            try {
                int a = scan();
                System.out.println(a);
                stalasyaPomylka = false;
            }
            // оператор Exception записує помилку у змінну spiymanaPomylka
            catch (Exception spiymanaPomylka) {
                System.out.println("Щось пішло не так.." + spiymanaPomylka);
                stalasyaPomylka = true;
            }
        }
    }
    public static int scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ціле число..");
        int a = sc.nextInt();
        return a;
    }
}
