package Tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private String SEARCH_KEYWORD = "Xiaomi Band";
    private String EXPECTED_SEARCH_QUERY = "query=Xiaomi+Band";
    private static final String MODEL_IS_NOT_AVAILABLE = "availableProductNotification";

    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }

    @Test(priority = 2)
    public void checkThatProductInQuestionIsAvailable() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getSearchResultsPage().selectTheModel();
        getHomePage().implicitWait(30);
        assertTrue(getSearchResultsPage().checkIfmodelIsAvailable().contains(MODEL_IS_NOT_AVAILABLE));
    }

    @Test(priority = 3)
    public void checkProductCount() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnGameZoneButton();
        getGameZonePage().clickOnConsoles();
        getHomePage().implicitWait(30);
        assertEquals(getConsolesPage().getSearchResultsCount(), 2);
    }

}
