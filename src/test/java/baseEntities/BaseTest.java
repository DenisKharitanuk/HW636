package baseEntities;

import configuration.ReadProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import services.BrowsersService;
import steps.FramesStep;

public class BaseTest {
    protected WebDriver driver;
    protected FramesStep frame;

    @BeforeEach
    public void setup() {
        driver = new BrowsersService().getDriver();

        frame = new FramesStep(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
