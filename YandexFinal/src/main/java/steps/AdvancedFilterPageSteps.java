package steps;

import pages.AdvancedFilterPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by K_PC-S on 30.01.2018.
 */
public class AdvancedFilterPageSteps {

    @Step("Выбираем параметры(CheckBox) {0}")
    public void choiceCheckBox(String checkBoxName) {
        new AdvancedFilterPage().choiceCheckBox(checkBoxName);
    }

    @Step("Заполняем поле {0} значением {1}")
    public void inputBoxFill(String name, String value) {
        new AdvancedFilterPage().inputBoxFill(name, value);
    }

    @Step("Нажать на кнопку с текстом {0}")
    public void clickButtonText(String nameButton) {
        new AdvancedFilterPage().clickButtonText(nameButton);
    }
}
