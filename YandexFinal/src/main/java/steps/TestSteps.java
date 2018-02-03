package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;

/**
 * Created by K_PC-S on 29.01.2018.
 */
public class TestSteps {
    YandexMainPageSteps yandexMainPageSteps = new YandexMainPageSteps();
    YandexMarketBasePageSteps yandexMarketBasePageSteps = new YandexMarketBasePageSteps();
    TVPageSteps tvPageSteps = new TVPageSteps();
    AdvancedFilterPageSteps advancedFilterPageSteps = new AdvancedFilterPageSteps();
    EarPhonePageSteps earPhonePageSteps = new EarPhonePageSteps();

    @When("^нажимаем на таб \"(.+)\"$")
    public void clickHomeTabs(String tabsName) {
        yandexMainPageSteps.clickToTab(tabsName);
    }

    @When("^наводим курсор на меню \"(.+)\"$")
    public void moveCursorToTopMenu(String topMenuName) throws InterruptedException {
        yandexMarketBasePageSteps.moveCursorToTopMenu(topMenuName);
    }

    @When("^переходим на категорию \"(.+)\"$")
    public void clickCategory(String subWrapName) {
        yandexMarketBasePageSteps.clickToCategory(subWrapName);
    }

    @Then("^нажимаем на фильтр \"(.+)\"$")
    public void clickFilter(String name) {
        tvPageSteps.clickFilter(name);
    }

    @When("^ожидаем элемент \"(.+)\"$")
    public void waitSubWrapMenuElement(String subWrapName) {
        yandexMarketBasePageSteps.waitSubWrapMenuElement(subWrapName);
    }

    @When("^заполняем поле \"(.+)\" значением \"(.+)\"$")
    public void inputBoxFill(String name, String value) {
        advancedFilterPageSteps.inputBoxFill(name, value);
    }

    @When("^выбираем параметры фильтра \"(.+)\"$")
    public void choiceCheckBox(String checkBoxName) throws InterruptedException {
        advancedFilterPageSteps.choiceCheckBox(checkBoxName);
        //Thread.sleep(3000);
    }

    @Then("^нажимаем на кнопку \"(.+)\"$")
    public void clickButtonText(String nameButton) {
        advancedFilterPageSteps.clickButtonText(nameButton);
    }

    @When("^сравниваем количество товаров на странице, ожидаем \"(.+)$")
    public void checkCountProductOnPage(int count) {
        tvPageSteps.checkCountProductOnPage(count);
    }

    @Then("^вытаскиваем название телевизора под номером \"(.+)\" из списка$")
    public void getNameTV(int index) {
        tvPageSteps.getNameTv(index);
    }

    @Then("^вытаскиваем название наушников под номером \"(.+)\" из списка$")
    public void getNameEarPhone(int index) {
        earPhonePageSteps.getNameEarPhone(index);
    }

    @When("^ищем отдельно по названию телевизора$")
    public void setInputSearch() throws InterruptedException {
        tvPageSteps.sendKeyInputSearch();
    }

    @Then("^нажимаем поиск для телика$")
    public void clickSearchButton() {
        tvPageSteps.clickSearchButton();
    }

    @Then("^проверяем на совпадение названия телевизора")
    public void checkProduct() {
        tvPageSteps.checkProductTitle();
    }

    //Для наушников остальное
    @When("^избавляемся от геолокации нажатием на \"(.+)\"$")
    public void clickOutOfGeo(String name){
        yandexMarketBasePageSteps.clickOutOfGeo(name);
    }

    @When("^сравниваем количество товаров для наушников на странице, ожидаем \"(.+)$")
    public void checkCountProductOnPageEarPhone(int count) {
        earPhonePageSteps.checkCountProductOnPage(count);
    }

    @Then("^ищем отдельно по названию наушников")
    public void setInputSearchEarPhone() throws InterruptedException {
        earPhonePageSteps.sendKeyInputSearch();
    }

    @When("^нажимаем поиск для наушников")
    public void clickSearchButtonEarPhone() {
        earPhonePageSteps.clickSearchButton();
    }

    @Then("^проверяем на совпадение названия наушников")
    public void checkProductEarPhone() {
        earPhonePageSteps.checkProductTitle();
    }

    @When("^переходим на первые наушники по списку$")
    public  void clickFirstEarPhone(){
        earPhonePageSteps.clickFirstEarPhone();
    }
}
