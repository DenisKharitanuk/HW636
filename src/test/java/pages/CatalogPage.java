package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage extends BasePage {
    private By firstProductInCatalogLocator = By.xpath("//*[@id=\"c165760752\"]/div/div[1]");

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public WebElement getFirstProductInCatalogLocator() {
        return waitsService.waitToBeClickableByLocator(firstProductInCatalogLocator);
    }
}
