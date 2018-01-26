package steps;

import pages.ContainerPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ConcurrentModificationException;
import java.util.HashMap;

import static org.junit.Assert.assertTrue;

/**
 * Created by K_PC-S on 25.01.2018.
 */
public class ContainerPageSteps extends ContainerPage {

    @Step("Заполняем элемент ''{0}'' значением ''{1}''")
    public void fillElement(String nameElement, String value){
        new ContainerPage().fillField(nameElement,value);
    }

    @Step("Заполнение полей:")
    public void fullFields(HashMap<String,String> fields){
        fields.forEach((key, value)->fillElement(key,value));
    }


    @Step("Поле ''{0}'' заполнено значением ''{1}''")
    public void checkFullField(String field, String value){
        String actualField = new ContainerPage().getfillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actualField, value),actualField.equals(value));
    }

    @Step("Поля заполнены следующими данными:")
    public void checkFullFields(HashMap<String,String> fields){
        fields.forEach((k, v)-> checkFullField(k,v));
    }

    @Step("Выбираем пол {0}")
    public void sex(String value){
        new ContainerPage().sex(value);
    }


    @Step("Нажимаем на оформление")
    public void clickIssue(){
        new ContainerPage().continueClick();
    }

    @Step("Проверяем сообщение об ошибке")
    public void checkErrorMessage(String value){new ContainerPage().checkError(value);}

}

