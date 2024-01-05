package org.GeneralPractice.StringPractice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class UpperLowLetters {
    public String stringToUpper(String value) {
        List<Character> valueReturn = new ArrayList<>();
        String valueNew = value.toUpperCase();
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == valueNew.charAt(i)){
                valueReturn.add(value.charAt(i));
            }
        }
        return valueReturn.toString();
    }
}
