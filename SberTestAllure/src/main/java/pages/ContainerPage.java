package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by K_PC-S on 21.01.2018.
 */
public class ContainerPage extends BasePage{

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

    public ContainerPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
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

    public String getfillField(String fieldName) {
        switch (fieldName) {
            case "Фамилия /Surname":
                return insuredSurName.getAttribute("value");
            case "Имя / Given names":
                return insuredName.getAttribute("value");
            case "Дата рождения застрахованного":
                return insuredBirthDate.getAttribute("value");
            case "Фамилия":
                return insurantSurName.getAttribute("value");
            case "Имя":
                return insurantName.getAttribute("value");
            case "Отчество":
                return insurantMiddleName.getAttribute("value");
            case "Дата рождения":
                return insurantBirthDate.getAttribute("value");
            case "Серия":
                return pasportSeries.getAttribute("value");
            case "Номер":
                return pasportNumber.getAttribute("value");
            case "Дата выдачи":
                return issueDate.getAttribute("value");
            case "Кем выдан":
                return issuePlace.getAttribute("value");

            default:
                throw new AssertionError("Поле '" + fieldName + "' отсутствует на странице");
        }
    }

    public void continueClick() {
        button.click();
    }

    public void checkError(String stringError) {
        String actualValue = error.getText();
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидаем [%s]", actualValue, stringError),
                actualValue.contains(stringError));
    }
}
