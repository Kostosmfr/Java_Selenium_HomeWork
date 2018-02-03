package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by K_PC-S on 29.01.2018.
 */
public class YandexMainPage {

    @FindBy(xpath = "//div[contains(@class,\"home-tabs stream-control\")]")
    WebElement yandexMarketHref;

    public YandexMainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickHomeTab(String tabsName) {
        yandexMarketHref.findElement(By.xpath("//a[contains(text(),'" + tabsName + "')]")).click();

    }
}
