package tests;

import baseEntities.BaseTest;
import org.junit.jupiter.api.Test;
import pages.CatalogPage;
import pages.TopBarPage;

public class BasketPageTest extends BaseTest {
    String firstItemInMenu = "Бытовая техника";
    String secondItemInMenu = "Техника для дома";
    String thirdItemInMenu = "Пылесосы и пароочистители";
    String fourthItemInMenu = "Вертикальные пылесосы";

    @Test
    public void addProductToBasketTest() {
        new TopBarPage(driver)
                .clickOnjBurgerMenuButton()
                .clickOnMainMenuByName(firstItemInMenu)
                .clickOnDropMenuByName(secondItemInMenu)
                .clickOnDropMenuByName(thirdItemInMenu)
                .lastClickOnDropdownMenuAndGoToCatalogByName(fourthItemInMenu)
                .pageIsOpened()
                .catalogTitleVerification(fourthItemInMenu)
                .breadcrumbsLinksVerification("Главная", firstItemInMenu,
                        secondItemInMenu, thirdItemInMenu,fourthItemInMenu )
                .clickOnAddToBasketButton()
                .basketNavbarNotifyBackgroundColorVerification("rgba(245, 81, 35, 1)")
                .basketCounterNotification("1")
                .clickOnBasketButton()
                .productInfoVerification("Вертикальный ручной Пылесос для дома с контейнером, Deerma")
                .productPricesVerification("2 345 ₽")
                .totalPriceVerification("2 345 ₽")
                .toOrderButtonIsClicable();
    }
}
