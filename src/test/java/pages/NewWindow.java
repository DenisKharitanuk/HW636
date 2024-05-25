package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewWindow extends BasePage {

    private final static String pagePath = "/windows/new";
    private By pageMessageTextLocator = By.xpath("//div/h3");

    public NewWindow(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    @Override
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public WebElement getPageMessageTextLocator() {
        return waitsService.waitForExists(pageMessageTextLocator);
    }
}
