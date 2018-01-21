package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by K_PC-S on 21.01.2018.
 */
public class MinumumLifeInsurance extends BasePage {

    @FindBy(xpath = "//div[@id='views']")
    WebElement formBlockBox;

    @FindBy(xpath = "//div[@id='views']")
    WebElement buttonIssue;


    public MinumumLifeInsurance(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickToElement(String itemBlockBox) {
        formBlockBox.findElement(By.xpath("//div[contains(text(),'" + itemBlockBox + "')]")).click();
    }

    public void waitLoadFormBlockBox(String itemBlockBox) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30, 1000);
        wait.until(ExpectedConditions.visibilityOf(formBlockBox.findElement(By.xpath("//div[contains(text(),'" + itemBlockBox + "')]"))));
    }

    public void clickIssue(String buttonName) {
        buttonIssue.findElement(By.xpath("//span[contains(text(),'" + buttonName + "')]")).click();
    }

}
