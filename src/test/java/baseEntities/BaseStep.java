package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected WebDriver driver;

    protected FramesPage framesPage;
    protected IFramePage iFramesPage;
    protected JavaScriptAlerts javaScriptAlerts;
    protected NewWindowPage newWindow;
    protected WindowPage windowPage;


    public BaseStep(WebDriver driver) {
        this.driver = driver;
        framesPage = new FramesPage(driver);
        iFramesPage = new IFramePage(driver);
        javaScriptAlerts = new JavaScriptAlerts(driver);
        newWindow = new NewWindowPage(driver);
        windowPage = new WindowPage(driver);
    }
}
