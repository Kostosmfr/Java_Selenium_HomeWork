package steps;

import pages.MinumumLifeInsurance;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by K_PC-S on 24.01.2018.
 */
public class MinimumLifiInsuranceSteps extends MinumumLifeInsurance {

    @Step("Выбираем тариф {0}")
    public void choiceTarif(String name) {
        new MinumumLifeInsurance().clickToElement(name);
    }

        @Step("Ожидаем элемент {0}")
        public void waitTarif(String name){
            new MinumumLifeInsurance().waitLoadFormBlockBox(name);
        }

        @Step("Нажимаем на кнопку {0}")
    public void issue(String nameButton){
            new MinumumLifeInsurance().clickIssue(nameButton);
        }



}
