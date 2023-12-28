package HomeTasksTests.Task1110;

import org.HomeTasks.Task1110.Implicit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImplicitTest {
    @Test
    public void checkingTextInExplicit(){
        Implicit implicit = new Implicit();
        Assertions.assertEquals("Бажаєте отримати набір\n" +
                "демонстраційних уроків?", implicit.getTextOfAds());
    }
}
