package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class ProductStep extends BaseStep {
    public ProductStep(WebDriver driver) {
        super(driver);
    }
    public void addProductToBasket(){
        productPage.getAddToBasketButtonLocator().click();
    }
    public void openBasketPage(){
        productPage.getBasketButtonLocator().click();
    }
}
