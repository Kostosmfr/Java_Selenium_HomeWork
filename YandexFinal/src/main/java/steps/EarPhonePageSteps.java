package steps;

import pages.EarPhonePage;
import pages.TVPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by K_PC-S on 01.02.2018.
 */
public class EarPhonePageSteps {

    String expectedName;

    @Step("Сравниваем на количество товаров на странице. Ожидаем {0}")
    public void checkCountProductOnPage(int count) {
        new EarPhonePage().checkCountProductOnPage(count);
    }

    @Step("Вытаскаваем название из списка под номером {0}(отсчет с 0)")
    public String getNameEarPhone(int index) {
        return expectedName = new EarPhonePage().getElement(index);
    }

    @Step("Вводим значение в поиск")
    public void sendKeyInputSearch() throws InterruptedException {
        new EarPhonePage().sendKeysExpectedName(expectedName);
    }

    @Step("Нажимаем поиск")
    public void clickSearchButton() {
        new EarPhonePage().clickSearchButton();
    }

    @Step("Проверяем на совпадаение товара")
    public void checkProductTitle() {
        new EarPhonePage().checkProductName(expectedName);
    }

   @Step("переход на первые наушники")
    public void clickFirstEarPhone(){
       new EarPhonePage().clickFirstEarPhone();
   }
}
