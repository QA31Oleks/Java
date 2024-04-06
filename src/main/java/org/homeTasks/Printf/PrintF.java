package org.homeTasks.Printf;

public class PrintF {
    public static void main(String[] args) {
        String s1 = "один", s2 = "два", s3 = "три";
        // System.out.printf("%s, %s, %s\n", s1, s2, s3); - кількість аргументів і вказівників має буде однаковою
        System.out.printf("%s\n", s1); // %s - String маленькими літерами
        System.out.printf("%S\n", s1); // %S = String великими літерами
        System.out.printf("%20s\n", s1); // %{n}s - текстовий рядок довжиною мінімум {n} символів
        System.out.printf("%s, %s, %s\n", s1, s2, s3); // виведення більше ніж одного значення

        int d1 = 123, d2 = 456, d3 = d1*d2; // D - digit = число
        System.out.printf("%d\n", d1); // %d - (digit) - ціле число
        System.out.printf("%d*%d=%d\n", d1, d2, d3);

        double f1 = 123456789.01234; // f = "Floating point number"

        System.out.printf("%f\n", f1); // %f - число з плаваючою точкою
        System.out.printf("%.2f\n", f1);  // .2 - заокруглити число до сотих
        System.out.printf("%,.2f\n", f1);  // , - розділювачі між тисячами

        //System.out.printf("%s", Arrays.toString(arr)); - для масиву
        // System.out.printf("Чекбокс <Java> не обрано. %nnЗамість чекбоксу <Java> обрано інший чекбокс: %s%n", Arrays.asList(obraniCheckboxy)); - для ArrList

    }
    //=================== метод toString ===================
/*    public String toString(){ // назва - обов'язково toString()
        return String.format("%d,%d,%d,%s", x, y, z, s)
    }*/
}
