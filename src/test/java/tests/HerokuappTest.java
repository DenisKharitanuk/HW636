package tests;

import baseEntities.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HerokuappTest extends BaseTest {
    String text = "Hello World";

    @Test
    public void iFrameTest() {
        frame.openIFramePage();
        iFrame.inputBoldText(text);
    }

    @Test
    public void windowsTest() {
        assertEquals(window.openNewWindows(), "New Window");
        assertTrue(window.closeNewTabAndSwitchToOldTab().isDisplayed());
    }
}
