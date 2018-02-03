package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by K_PC-S on 29.01.2018.
 */
public class YandexMarketBasePage {

    Actions actions;

    @FindBy(xpath = "//ul[@class=\"topmenu__list\"]")
    WebElement topMenuList;

    @FindBy(xpath = "//div[@class = \"topmenu__subwrap\"]")
    WebElement topMenuSubWrap;

    public YandexMarketBasePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        actions = new Actions(BaseSteps.getDriver());
    }

    public void moveCursorToTopMenuList(String topMenuName) throws InterruptedException {
        actions.moveToElement(topMenuList.findElement(
                By.xpath("//a[text()='" + topMenuName + "']")
        )).build().perform();
        Thread.sleep(500);
    }

    public void clickTopMenuSubWrap(String subWrapName) {
        topMenuSubWrap.findElement(By.xpath("//a[contains(text(),'" + subWrapName + "')]")).click();
    }

    public void waitSubWrapMenuElement(String subWrapName) {
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf
                (topMenuSubWrap.findElement(By.xpath("//a[text()='" + subWrapName + "']"))));
    }

    public void clickoutGeo(String topMenuName){
        topMenuList.findElement(By.xpath("//a[text()='" + topMenuName + "']")).click();
    }



}
