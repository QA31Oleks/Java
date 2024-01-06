package org.GeneralPractice.StringPractice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class UpperLowLetters {
    public String stringToUpper(String value) {
        //List<Character> valueReturn = new ArrayList<>();
        String valueNew = value.toUpperCase();
        String valueReturn1 = "";
        String valueReturn2 = "";
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == valueNew.charAt(i)){
                // valueReturn.add(value.charAt(i));
                valueReturn1 += String.valueOf(value.charAt(i));
            } else {
                valueReturn2 += String.valueOf(value.charAt(i));
            }
        }
        // String valueReturnAmount = valueReturn1.concat(valueReturn2);
        String valueReturnAmount = valueReturn1 + valueReturn2;
        return valueReturnAmount;
    }
}
