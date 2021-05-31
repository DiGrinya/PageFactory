package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'PlayStation 5 Digital')]")
    private WebElement cartContainsSelectedProduct;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement cartPopup;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public String checkProductInCart() {
        return cartContainsSelectedProduct.getText();
    }
    public WebElement CartPopup() {
        return cartPopup;
    }
}
