package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private By searchInputLocator = By.id("searchInput");
    private By searchButtonLocator = By.id("applySearchBtn");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return searchInputLocator;
    }

    public WebElement getSearchInputLocator() {
        return waitsService.waitForExist(searchInputLocator);
    }

    public WebElement getSearchButtonLocator() {
        return waitsService.waitToBeClickableByLocator(searchButtonLocator);
    }
}
