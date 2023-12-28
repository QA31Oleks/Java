package HomeTasksTests.Task1110;

import org.HomeTasks.Task1110.Explicit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ExplicitTest {
    @Test
    public void checkingTextInExplicit(){
        Explicit explicit = new Explicit();
        Assertions.assertEquals("Бажаєте отримати набір\n" +
                "демонстраційних уроків?", explicit.getTextOfAds());
    }
}
