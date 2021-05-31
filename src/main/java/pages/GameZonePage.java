package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class GameZonePage extends HomePage{

    @FindBy(xpath = "//div[@class='height brand-box']//a[contains(@href,'igrovie-pristavki')]")
    private WebElement gameConsoles;

    public GameZonePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnConsoles() {
        gameConsoles.click();
    }

}
