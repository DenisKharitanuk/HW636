package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.BasketPage;

public class BaseStep {
    protected WebDriver driver;
    protected HomePage homePage;
    protected CatalogPage catalogPage;
    protected ProductPage productPage;
    protected BasketPage basketPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
        catalogPage = new CatalogPage(driver);
        productPage = new ProductPage(driver);
        basketPage = new BasketPage(driver);
    }
}
