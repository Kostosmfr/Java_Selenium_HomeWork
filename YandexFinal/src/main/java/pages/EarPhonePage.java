package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by K_PC-S on 01.02.2018.
 */
public class EarPhonePage {

    @FindBy(xpath = "(//div[contains(@class,'n-snippet-cell2__title')]/a)")
    List<WebElement> countOnPage;

    @FindBy(xpath = "//div//input[@id='header-search']")
    WebElement searchInput;

    @FindBy(xpath = "//span[@class='search2__button']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@class='n-title__text']//h1")
    WebElement productName;

    @FindBy(xpath = "(//a/strong[contains(text(),'Наушники')])[1]")
    WebElement firstEarPhone;

    public EarPhonePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public int getCountProductOnPage() {
        return countOnPage.size();
    }

    public void checkCountProductOnPage(int expectedValue) {
        assertEquals(expectedValue, getCountProductOnPage());
    }

    public String getElement(int index) {
        return countOnPage.get(index).getText();
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

    public void clickFirstEarPhone(){
        firstEarPhone.click();
    }
}
