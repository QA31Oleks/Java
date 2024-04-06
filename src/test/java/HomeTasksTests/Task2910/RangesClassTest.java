package HomeTasksTests.Task2910;

import org.homeTasks.Task2910.RangesClass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangesClassTest {
    RangesClass rangesClass = new RangesClass();
    @Test
    public void isBiggerStart() {
        String a = null;
        Assert.assertFalse(rangesClass.isStartBigger(rangesClass.getArray1()));
        rangesClass.counter(rangesClass.getArray1());
        Assert.assertFalse(rangesClass.isStartBigger(rangesClass.getArray2()));
        rangesClass.counter(rangesClass.getArray2());
        Assert.assertFalse(rangesClass.isStartBigger(rangesClass.getArray3()));
        rangesClass.counter(rangesClass.getArray3());
        //System.out.println("Range array3 = " + rangesClass.counter);
        //Assert.assertEquals(false, rangesClass.loopRange());
        //Assert.assertTrue(rangesClass.loopRange());
        //assertNull(a);
        //assertNotNull(a);
        //Assert.assertNotNull(a);
    }

    @Test
    public void isCrossed() {
        assertFalse(rangesClass
                .isArraysCrossing(rangesClass.getArray1(),
                        rangesClass.getArray2(),
                        rangesClass.getArray3()));
    }
}
