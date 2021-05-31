package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href, 'band-6-yellow-item')]")
    private WebElement searchResultsProductInQuestion;

    @FindBy(xpath = "//div[contains(@data-ecomm, 'Band 6 Yellow')]//..//a[contains(@href,'availableProductNotification')]")
    private WebElement modelInQuestion;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void selectTheModel() {
        searchResultsProductInQuestion.click();
    }

    public String checkIfmodelIsAvailable() {
        return modelInQuestion.getAttribute("href");
    }
}
