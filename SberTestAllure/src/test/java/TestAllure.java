import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.HashMap;

/**
 * Created by K_PC-S on 24.01.2018.
 */
public class TestAllure extends BaseSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();
    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();
    MinimumLifiInsuranceSteps minimumLifiInsuranceSteps = new MinimumLifiInsuranceSteps();
    ContainerPageSteps containerPageSteps = new ContainerPageSteps();

    HashMap<String, String> testData = new HashMap<>();

    @Title("Оформляем страховку")
    @Test
    public void testInsuranceAllure() throws InterruptedException {

        testData.put("Фамилия /Surname", "Ivanov");
        testData.put("Имя / Given names", "Georgy");
        testData.put("Дата рождения застрахованного", "15.01.1984");
        testData.put("Фамилия", "Иванова");
        testData.put("Имя", "Василиса");
        testData.put("Отчество", "Марковна");
        testData.put("Дата рождения", "26.06.1954");
        testData.put("Серия", "4511");
        testData.put("Номер", "196196");
        testData.put("Дата выдачи", "05.02.1994");
        testData.put("Кем выдан", "Кем то");

        mainPageSteps.selectElement("Застраховать себя");
        mainPageSteps.waitElements("Страхование путешественников");
        mainPageSteps.clickToElement("Страхование путешественников");

        travelInsuranceSteps.checkHeader("Страхование путешественников");
        travelInsuranceSteps.issue("Оформление");
        travelInsuranceSteps.swithTab();

        minimumLifiInsuranceSteps.waitTarif("Минимальная");
        minimumLifiInsuranceSteps.choiceTarif("Минимальная");
        minimumLifiInsuranceSteps.issue("Оформить");

        containerPageSteps.fullFields(testData);
        containerPageSteps.sex("женский");
        containerPageSteps.checkFullFields(testData);
        containerPageSteps.clickIssue();
        containerPageSteps.checkErrorMessage("Заполнены не все обязательные поля");
    }
}
