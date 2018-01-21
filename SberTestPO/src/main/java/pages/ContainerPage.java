package pages;

import org.junit.Assert;
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
public class ContainerPage extends BasePage {


    @FindBy(xpath = "//span[text()='Продолжить']")
    WebElement button;

    @FindBy(xpath = "//input[@name = 'insured0_surname']")
    public WebElement insuredSurName;

    @FindBy(xpath = "//input[@name = 'insured0_name']")
    public WebElement insuredName;

    @FindBy(xpath = "//input[@name = 'insured0_birthDate']")
    public WebElement insuredBirthDate;

    @FindBy(name = "surname")
    public WebElement insurantSurName;

    @FindBy(name = "name")
    public WebElement insurantName;

    @FindBy(name = "middlename")
    public WebElement insurantMiddleName;

    @FindBy(name = "birthDate")
    public WebElement insurantBirthDate;

    @FindBy(name = "female")
    public WebElement female;

    @FindBy(name = "male")
    public WebElement male;

    @FindBy(name = "passport_series")
    public WebElement pasportSeries;

    @FindBy(name = "passport_number")
    public WebElement pasportNumber;

    @FindBy(name = "issueDate")
    public WebElement issueDate;

    @FindBy(name = "issuePlace")
    public WebElement issuePlace;

    @FindBy(xpath = "//div[@ng-show='tryNext && myForm.$invalid']")
    public WebElement error;

    public ContainerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Фамилия /Surname":
                fillElement(insuredSurName, value);
                break;
            case "Имя / Given names":
                fillElement(insuredName, value);
                break;
            case "Дата рождения застрахованного":
                fillElement(insuredBirthDate, value);
                break;
            case "Фамилия":
                fillElement(insurantSurName, value);
                break;
            case "Имя":
                fillElement(insurantName, value);
                break;
            case "Отчество":
                fillElement(insurantMiddleName, value);
                break;
            case "Дата рождения":
                fillElement(insurantBirthDate, value);
                break;
            case "Серия":
                fillElement(pasportSeries, value);
                break;
            case "Номер":
                fillElement(pasportNumber, value);
                break;
            case "Дата выдачи":
                fillElement(issueDate, value);
                break;
            case "Кем выдан":
                fillElement(issuePlace, value);
                break;

            default:
                throw new AssertionError("Поле '" + fieldName + "' отсутствует на странице");
        }
    }

    public void sex(String value) {

        switch (value) {
            case "мужской":
                male.click();
                break;
            case "женский":
                female.click();
                break;
            default:
                throw new AssertionError("Поле '" + value + "' отсутствует на странице");
        }
    }

    public void continueClick() {
        button.click();
    }

    public void waitError() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30, 1000);
        wait.until(ExpectedConditions.visibilityOf(error));
    }

    public void checkError(String stringError) {
        String actualValue = error.getText();
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидаем [%s]", actualValue, stringError),
                actualValue.contains(stringError));


    }


}
