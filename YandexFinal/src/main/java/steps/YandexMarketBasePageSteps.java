package steps;

import pages.YandexMarketBasePage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by K_PC-S on 29.01.2018.
 */
public class YandexMarketBasePageSteps {

    @Step("Наводим курсор на меню {0}")
    public void moveCursorToTopMenu(String topMenuName) throws InterruptedException {
        new YandexMarketBasePage().moveCursorToTopMenuList(topMenuName);
    }

    @Step("Переходим на категорию {0}")
    public void clickToCategory(String subWrapMenu) {
        new YandexMarketBasePage().clickTopMenuSubWrap(subWrapMenu);
    }

    @Step("Ожидаем элемент {0}")
    public void waitSubWrapMenuElement(String subWrapMenuName) {
        new YandexMarketBasePage().waitSubWrapMenuElement(subWrapMenuName);
    }

    @Step("Кликаем чтобы избавится от геолокации")
    public void clickOutOfGeo(String name){
        new YandexMarketBasePage().clickoutGeo(name);
    }
}
