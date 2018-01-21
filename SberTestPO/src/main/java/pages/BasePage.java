package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by K_PC-S on 17.01.2018.
 */
public class BasePage {
    WebDriver driver;

    //Заполняем поля Input
    public void fillElement(WebElement webElement, String value) {
        webElement.clear();
        webElement.sendKeys(value);
    }

    //Совершаем клик по элементу
    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

}
