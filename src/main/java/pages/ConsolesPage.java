package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ConsolesPage extends BasePage{

    @FindBy(xpath = "//div[@class='container-main']//a[contains(@data-ecomm-cart,'PlayStation 5')]")
    private List<WebElement> searchResultProductsListText;

    @FindBy(xpath = "//div[@class='container-main']//a[contains(@data-ecomm-cart,'PlayStation 5 Digital')]")
    private WebElement product;

    @FindBy(xpath = "//a[contains(@href,'checkout')]")
    private WebElement addToCartPopup;

    @FindBy(xpath = "//a[contains(@href,'checkout')]")
    private WebElement addProductToCart;

    public ConsolesPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultProductsListText;
    }

    public int getSearchResultsCount() {
        return getSearchResultsList().size();
    }

    public void addProductToCart() {
        product.click();
    }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public void orderTheProduct() {
        addProductToCart.click();
    }

}
