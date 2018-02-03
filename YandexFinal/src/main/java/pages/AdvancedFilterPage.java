package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

/**
 * Created by K_PC-S on 29.01.2018.
 */
public class AdvancedFilterPage {

    @FindBy (xpath = "//div[contains(@class,'n-filter-block__item')]")
    WebElement title;

    @FindBy(xpath = "//span[@class='input__box']")
    WebElement inputBox;

    @FindBy(xpath = "//div[contains(@class,'n-filter-panel-extend')]")
    WebElement buttonText;

    public AdvancedFilterPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void choiceCheckBox(String checkBoxName){
        title.findElement(By.xpath("//label[text()='" + checkBoxName + "']")).click();
    }

    public void inputBoxFill(String name, String value){
        switch (name){
            case("Цена от"):
                inputBox.findElement(By.xpath("//input[@name='glf-pricefrom-var']")).sendKeys(value);
                break;
            case ("Цена до"):
                inputBox.findElement(By.xpath("//input[@name='glf-priceto-var']")).sendKeys(value);
                break;
                default:
                    throw new AssertionError("Поле '"+ name + "' не найдено на странице");
        }
    }

    public void clickButtonText(String nameButton){
        buttonText.findElement(By.xpath("//a[contains(@class,'button button_size_l')]")).click();
    }


}
