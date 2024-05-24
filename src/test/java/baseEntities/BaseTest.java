package baseEntities;

import configuration.ReadProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import pages.CatalogPage;
import pages.HomePage;
import pages.ProductPage;
import services.BrowsersService;
import steps.BasketStep;
import steps.CatalogStep;
import steps.HomeStep;
import steps.ProductStep;

public class BaseTest {
    protected WebDriver driver;
    protected HomeStep homeStep;
    protected CatalogStep catalogStep;
    protected ProductStep product;
    protected BasketStep basket;

    @BeforeEach
    public void setup() {
        driver = new BrowsersService().getDriver();

        homeStep = new HomeStep(driver);
        catalogStep = new CatalogStep(driver);
        product = new ProductStep(driver);
        basket = new BasketStep(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
