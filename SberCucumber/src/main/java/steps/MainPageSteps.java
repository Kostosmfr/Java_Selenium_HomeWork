package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by K_PC-S on 23.01.2018.
 */
public class MainPageSteps{

    @Step("Навели курсор на элемент меню: {0}")
    public void selectElement(String menuItem)
    {
        new MainPage().moveMouseToElement(menuItem);
    }


    @Step("Нажали на элемент {0}")
    public void clickToElement(String name){
        new MainPage().clickTo(name);
    }

    @Step("Ожидаем элемент {0}")
    public void waitElements(String name){
        new MainPage().waitElement(name);
    }


}
