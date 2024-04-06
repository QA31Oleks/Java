package GeneralPracticeTests.StringPracticeTests;

import org.generalPractice.StringPractice.UpperLowLetters;
import org.junit.Assert;
import org.junit.Test;

public class UpperLowLettersTest {

    @Test
    public void check_list(){
        var upperLowLetters = new UpperLowLetters();
        Assert.assertEquals("ACEbdf", upperLowLetters.stringToUpper("AbCdEf"));
    }
}
