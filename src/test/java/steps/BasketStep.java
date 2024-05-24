package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class BasketStep extends BaseStep {
    public BasketStep(WebDriver driver) {
        super(driver);
    }

    public void productIsExist(){
        basketPage.getProductIsExistInBasketLocator().isDisplayed();
    }
}
