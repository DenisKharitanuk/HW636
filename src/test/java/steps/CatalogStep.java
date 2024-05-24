package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class CatalogStep extends BaseStep {
    public CatalogStep(WebDriver driver) {
        super(driver);
    }
    public void chooseProduct() throws InterruptedException {
        Thread.sleep(2000);
        catalogPage.getFirstProductInCatalogLocator().click();
    }
}
