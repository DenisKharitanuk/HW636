package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage {

    private By productLocator=By.className("list-item__wrap");


    public BasketPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return null;
    }

    public WebElement getProductIsExistInBasketLocator(){
        return driver.findElement(productLocator);
    }
}
