package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainPage;

/**
 * Created by K_PC-S on 28.01.2018.
 */
public class ScenarioStep {

    MainPageSteps mainPageSteps = new MainPageSteps();
    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();
    MinimumLifiInsuranceSteps minimumLifiInsuranceSteps = new MinimumLifiInsuranceSteps();
    ContainerPageSteps containerPageSteps = new ContainerPageSteps();

    @When("^курсор переместили на элемент \"(.+)\"$")
    public void moveCursorToElement(String name){
        mainPageSteps.selectElement(name);
    }

    @When("^дождались элемента \"(.+)\"$")
    public void waitElement(String name){
        mainPageSteps.waitElements(name);
    }

    @Then("^нажимаем на элемент \"(.+)\"$")
    public void clickToElement(String name){
        mainPageSteps.clickToElement(name);
    }

    @When("^заголовок имеет лик \"(.+)\"$")
    public void checkHeader(String name){travelInsuranceSteps.checkHeader(name);}

    @Then("^кликаем на элемент \"(.+)\"$")
    public void clickIssue(String name){travelInsuranceSteps.issue(name);}

    @When("^переключаемся на соседнюю вкладку$")
    public void swithToNextTab(){travelInsuranceSteps.swithTab();}


    @When("^страница загрузится с интересующим нас тарифом \"(.+)\"$")
    public void waitTarif(String name){minimumLifiInsuranceSteps.waitTarif(name);}

    @Then("^выбираем тариф \"(.+)\"$")
    public void choiceTarif(String name){minimumLifiInsuranceSteps.choiceTarif(name);}

    @When("^нажимаем на \"(.+)\"$")
    public void clickToIssue(String name){minimumLifiInsuranceSteps.issue(name);}


    @When("^заполняются поля:$")
    public void fillFields(DataTable fields){
        fields.asMap(String.class,String.class)
                .forEach((field, value)-> containerPageSteps.fillElement(field, value));
    }
    @When("^выбран пол \"(.+)\"$")
    public void choiceSex(String name){
        containerPageSteps.sex(name);
    }

    @Then("^значения полей равны:$")
    public void checkFillFields(DataTable fields){
        fields.asMap(String.class,String .class)
                .forEach((field,value)-> containerPageSteps.checkFullField(field,value));
    }

    @When("^оформляем$")
    public void finishClickIssue(){containerPageSteps.clickIssue();}

    @Then("^проверяем на наличие ошибки \"(.+)\"$")
            public void checkError(String errorMsg){containerPageSteps.checkErrorMessage(errorMsg);}


}
