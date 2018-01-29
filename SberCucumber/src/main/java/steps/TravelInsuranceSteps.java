package steps;

import pages.TravelInsurance;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

/**
 * Created by K_PC-S on 24.01.2018.
 */
public class TravelInsuranceSteps extends TravelInsurance {

    @Step("Нажимаем на оформление {0}")
    public void issue(String name){
        new TravelInsurance().clickIssue();
    }

    @Step("Переходим на соседнюю вкладку")
    public void swithTab(){
        new TravelInsurance().swithTab();
    }

    @Step("Проверить наличие на странице заголовка – Страхование путешественников")
    public void checkHeader(String header){
        String actualHeader = new TravelInsurance().header.getText();
        assertTrue(String.format("Заголовок на странице [%s]. Ожидалось - [%s]", actualHeader, header),actualHeader.equals(header));
    }

    }

