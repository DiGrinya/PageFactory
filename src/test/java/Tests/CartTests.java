package Tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartTests extends BaseTest{

    private static final String SELECTED_PRODUCT = "PlayStation 5 Digital";

    @Test(priority = 1)
    public void checkThatCartContainsSelectedProduct() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnGameZoneButton();
        getGameZonePage().clickOnConsoles();
        getGameZonePage().implicitWait(30);
        getConsolesPage().addProductToCart();
        getConsolesPage().waitVisibilityOfElement(5, getConsolesPage().getAddToCartPopup());
        getConsolesPage().orderTheProduct();
        getCheckoutPage().waitVisibilityOfElement(5, getCheckoutPage().CartPopup());
        assertTrue(getCheckoutPage().checkProductInCart().contains(SELECTED_PRODUCT));
    }

}
