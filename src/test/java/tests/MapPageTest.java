package tests;

import baseEntities.BaseTest;
import org.junit.jupiter.api.Test;
import pages.MapPage;
import pages.TopBarPage;

public class MapPageTest extends BaseTest {
    @Test
    public void changeCity(){
        new TopBarPage(driver)
                .clickOnAddressLocator()
                .inputAddress("Санкт-Петербург")
                .selectOnAddressByIndex(0)
                .pickUpPointByIndexVerification(0)
                .clickOnSelectButtonLocator()
                .pageIsOpened()
                .addressMenuVerification("Санкт-Петербург, Санкт-Петербург, проспект Авиаконструкторов, 4к1");
    }
}
