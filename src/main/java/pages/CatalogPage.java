package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogPage extends BasePage {

    //locators block
    private By firstProductInCatalogLocator = By.xpath("//*[@id=\"c165760752\"]/div/div[1]");
    private By firstAddToBasketButtonLocator = By.xpath("//*[@id=\"c75364110\"]/div/div[4]/p[3]/a");
    private By firstProductCardNameLocator = By.xpath("//*[@id=\"c171459981\"]/div/div/h2/span/span[@class='product-card__brand']");
    private By searchingResultsTitleLocator = By.className("searching-results__title");
    private By firstFilterLocator = By.xpath("//div/button[@class='dropdown-filter__btn dropdown-filter__btn--burger']");
    private By secondFilterLocator = By.xpath("//button[@class='dropdown-filter__btn dropdown-filter__btn--sorter']");

    private By catalogTitleLocator = By.className("catalog-title");
    private By breadcrumbsLinkLocator = By.xpath("//span[@itemprop='name']");

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    //getters block
    private WebElement getFirstProductInCatalog() {
        return waitsService.waitForVisibilityBy(firstProductInCatalogLocator);
    }

    private WebElement getSearchingResultsTitle() {
        return waitsService.waitForExist(searchingResultsTitleLocator);
    }

    private WebElement getFirstFilter() {
        return waitsService.waitForExist(firstFilterLocator);
    }

    private WebElement getSecondFilter() {
        return waitsService.waitForExist(secondFilterLocator);
    }


    private WebElement getFirstProductCardName() {
        return waitsService.waitForExist(firstProductCardNameLocator);
    }

    private WebElement getCatalogTitle() {
        return waitsService.waitForExist(catalogTitleLocator);
    }

    private WebElement getFirstAddToBasketButton() {
        return waitsService.waitToBeClickableByLocator(firstAddToBasketButtonLocator);
    }

    private List<WebElement> getBreadcrumbsLinks() {
        return waitsService.waitForAllForExistLocated(breadcrumbsLinkLocator);
    }

    //selectors block
    private WebElement selectBreadcrumbsLinksByName(String linkName) {
        WebElement breadcrumbsLinksByName = null;
        List<WebElement> breadcrumbsLinksList = new ArrayList<>(getBreadcrumbsLinks());
        for (WebElement element : breadcrumbsLinksList) {
            if (element.getText().equals(linkName)) {
                breadcrumbsLinksByName = element;
                break;
            }
        }
        return breadcrumbsLinksByName;
    }

    private WebElement selectBreadcrumbsLinksByIndex(int index) {
        List<WebElement> breadcrumbsLinksList = new ArrayList<>(getBreadcrumbsLinks());
        return breadcrumbsLinksList.get(index);
    }


    //actions block

    public TopBarPage clickOnAddToBasketButton() {
        getFirstAddToBasketButton().click();
        return new TopBarPage(driver);
    }

    //verifications block
    public CatalogPage searchingResultsVerification(String expectedText) {
        assertEquals(expectedText, getSearchingResultsTitle().getText());
        return this;
    }

    public CatalogPage firstFilterVerification(String filterName) {
        assertEquals(filterName, getFirstFilter().getText());
        return this;
    }

    public CatalogPage secondFilterVerification(String filterName) {
        assertEquals(filterName, getSecondFilter().getText());
        return this;
    }

    public CatalogPage firstProductIsVerification(String productName) {
        assertEquals(productName, getFirstProductInCatalog().getText());
        return this;
    }

    public CatalogPage firstProductCardLabelVerification(String productLabel) {
        assertEquals(productLabel, getFirstProductCardName().getText());
        return this;
    }

    public CatalogPage catalogTitleVerification(String catalogTitleName) {
        assertEquals(catalogTitleName, getCatalogTitle().getText());
        return this;
    }

    public CatalogPage breadcrumbsLinksVerification(String... linksArray) {
        for (int i = 0; i < linksArray.length; i++) {
            assertEquals(linksArray[i], selectBreadcrumbsLinksByIndex(i).getText());
        }
        return this;
    }

    public CatalogPage pageIsOpened() {
        waitsService.waitForExist(catalogTitleLocator).isDisplayed();
        return this;
    }
}
