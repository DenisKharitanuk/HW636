package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowPage extends BasePage {
    private final static String pagePath = "/windows";

    private By clickHereButtonLocator = By.xpath("//a[@href=\"/windows/new\"]");

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return clickHereButtonLocator;
    }

    @Override
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public WebElement getClickHereButtonLocator() {
        return waitsService.waitForVisibilityLocatedBy(clickHereButtonLocator);
    }
}
