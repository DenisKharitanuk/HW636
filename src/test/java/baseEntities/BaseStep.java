package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.FramesPage;

public class BaseStep {
    protected WebDriver driver;

    protected FramesPage framesPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        framesPage = new FramesPage(driver);
    }
}
