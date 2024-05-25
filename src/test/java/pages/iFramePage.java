package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iFramePage extends BasePage {
    private final static String pagePath = "/iframe";
    private By boldButtonLocator = By.xpath("//button[@aria-label='Bold']");
    private By startInputTextLocator = By.id("tinymce");


    public iFramePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return startInputTextLocator ;
    }

    @Override
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    public WebElement getBoldButtonLocator(){
        return waitsService.waitForClickable(boldButtonLocator);
    }

    public WebElement getStartInputTextLocator(){
        return waitsService.waitForClickable(startInputTextLocator);
    }
}
