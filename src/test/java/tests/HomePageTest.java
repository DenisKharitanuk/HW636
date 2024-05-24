package tests;

import baseEntities.BaseTest;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
    String searchProduct = "кандибобер";

    @Test
    public void searchChooseInBasketProduct() throws InterruptedException {
        homeStep.search(searchProduct);
        catalogStep.chooseProduct();
        product.addProductToBasket();
        product.openBasketPage();
        basket.productIsExist();
    }
}
