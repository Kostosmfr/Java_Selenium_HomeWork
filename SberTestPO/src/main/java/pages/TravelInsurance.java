package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by K_PC-S on 20.01.2018.
 */
public class TravelInsurance extends BasePage {

    @FindBy(xpath = "//h1[text()='Страхование путешественников']")
    public
    WebElement header;

    @FindBy(xpath = "//a//img[contains(@src,'banner-zashita-traveler')]")
    WebElement issue;

    public TravelInsurance(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void waitAndIssueInsurance() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30, 1000);
        wait.until(ExpectedConditions.visibilityOf(issue));
    }

    public void clickIssue() {
        issue.click();
    }

    public void swithTab() {
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    }


}
