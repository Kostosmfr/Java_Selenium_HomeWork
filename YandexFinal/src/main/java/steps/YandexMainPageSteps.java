package steps;

import pages.YandexMainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by K_PC-S on 29.01.2018.
 */
public class YandexMainPageSteps {

    @Step("Нажимаем на таб {0}")
    public void clickToTab(String tabName) {
        new YandexMainPage().clickHomeTab(tabName);
    }
}
