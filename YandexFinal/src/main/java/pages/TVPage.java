package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by K_PC-S on 29.01.2018.
 */
public class TVPage {

    @FindBy(xpath = "//div[@class='n-filter-panel-aside__show-more']")
    WebElement advancedFilter;

    @FindBy(xpath = "(//div[contains(@class,'n-snippet-card2__title')]/a)")
    List<WebElement> countTvOnPage; //

    @FindBy(xpath = "//div//input[@id='header-search']")
    WebElement searchInput;

    @FindBy(xpath = "//span[@class='search2__button']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@class='n-title__text']//h1")
    WebElement productName;

    public TVPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickAdvencedFilter(String name) {
        advancedFilter.click();
    }

    public int getCountProductOnPage() {
        return countTvOnPage.size();
    }

    public void checkCountProductOnPage(int expectedValue) {
        assertEquals(expectedValue, getCountProductOnPage());
    }

    public String getElement(int index) {
        return countTvOnPage.get(index).getText();
    }

    public void sendKeysExpectedName(String expName) {
        searchInput.sendKeys(expName);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getProductName() {
        return productName.getText();
    }

    public void checkProductName(String expectedProductName) {
        assertEquals(expectedProductName, getProductName());
    }
}
