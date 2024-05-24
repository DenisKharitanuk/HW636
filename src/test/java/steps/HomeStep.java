package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CatalogPage;
import pages.HomePage;

public class HomeStep extends BaseStep {

    public HomeStep(WebDriver driver) {
        super(driver);
    }

    public CatalogPage search(String searchProduct) {
        homePage.getSearchInputLocator().sendKeys(searchProduct);
        homePage.getSearchButtonLocator().click();
        return catalogPage;
    }
}
