package SberTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Created by K_PC-S on 13.01.2018.
 */
public class InsuranceTest {

    private WebDriver driver;
    private String url;
    private Actions action;
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss.SSS ");

    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        driver = new ChromeDriver();
        System.out.println(format.format(new Date()) + "Переходим на сайт http://www.sberbank.ru/ru/person");
        url = "http://www.sberbank.ru/ru/person";
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);

        action = new Actions(driver);
    }

    @Test
    public void test() throws InterruptedException {

        System.out.println(format.format(new Date()) + "Наводим курсор на кнопку 'Застраховать себя и имущество'");
        moveMouseToElement(driver.findElement(By.xpath("//span[(text() = 'Застраховать себя ')]")));

        driver.findElement(By.xpath("//a[@class='kit-link kit-link_color_black alt-menu-list__link alt-menu-list__link_level_1' and @href='/ru/person/bank_inshure/insuranceprogram/life/travel']"));

        System.out.println(format.format(new Date()) + "Ждем элемент 'Страхование путешественников'");
        Wait<WebDriver> wait = new WebDriverWait(driver, 30, 100);
                wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath("//a[@class='kit-link kit-link_color_black alt-menu-list__link alt-menu-list__link_level_1' and @href='/ru/person/bank_inshure/insuranceprogram/life/travel']"))));

        System.out.println(format.format(new Date()) + "Переходим по кнопке 'Страхование путешественников'");
        clickElement(By.xpath("//a[@class='kit-link kit-link_color_black alt-menu-list__link alt-menu-list__link_level_1' and @href='/ru/person/bank_inshure/insuranceprogram/life/travel']"));

        System.out.println(format.format(new Date()) + "Сравнение заголовка");
        assertEquals("Страхование путешественников",
                driver.findElement(By.xpath("//h1[text()='Страхование путешественников']")).getText());

        System.out.println(format.format(new Date()) + "Нажимаем на 'Оформить онлайн'");
        clickElement(By.xpath("//img[@src='/portalserver/content/atom/contentRepository/content/person/travel/banner-zashita-traveler.jpg?id=f6c836e1-5c5c-4367-b0d0-bbfb96be9c53']"));


        System.out.println(format.format(new Date()) + "Переключаемся на соседнюю вкладку");
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());


        System.out.println(format.format(new Date()) + "Ждем элемент 'Минимальный тариф'");
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath("//div[text()= 'Минимальная']"))));
        Thread.sleep(1000);
        System.out.println(format.format(new Date()) + "Выбираем минимальный тариф");
        clickElement(By.xpath("//div[text()= 'Минимальная']"));

        System.out.println(format.format(new Date()) + "Оформляем");
        clickElement(By.xpath("//span[text()='Оформить']"));


        System.out.println(format.format(new Date()) + "Заполняем данные, кого будем страховать:");
        System.out.println(format.format(new Date()) + "Заполняем фамилию");
        fillElement(By.name("insured0_surname"),"Ivanov");

        System.out.println(format.format(new Date()) + "Заполняем имя");
        fillElement(By.name("insured0_name"),"Ivan");

        System.out.println(format.format(new Date()) + "Заполняем ДР");
        fillElement(By.name("insured0_birthDate"),"15.01.1984");

        System.out.println(format.format(new Date()) + "Заполняем данные страхователя:");

        System.out.println(format.format(new Date()) + "Заполняем фамилию");
        fillElement(By.name("surname"), "Васькин");

        System.out.println(format.format(new Date()) + "Заполняем имя");
        fillElement(By.name("name"), "Василий");

        System.out.println(format.format(new Date()) + "Заполняем отчество");
        fillElement(By.name("middlename"), "Федорович");

        System.out.println(format.format(new Date()) + "Заполняем ДР");
        fillElement(By.name("birthDate"),"15.01.1967");

        System.out.println(format.format(new Date()) + "Выбираем пол");
        clickElement(By.name("female"));
        System.out.println(format.format(new Date()) + "Перепутали");
        clickElement(By.name("male"));

        System.out.println(format.format(new Date()) + "Заполняем паспортные данные:");
        System.out.println(format.format(new Date()) + "Заполняем серию паспорта");
        fillElement(By.name("passport_series"), "1234");

        System.out.println(format.format(new Date()) + "Заполняем номер паспорта");
        fillElement(By.name("passport_number"), "196196");

        System.out.println(format.format(new Date()) + "Заполняем дату выдачи паспорта");
        fillElement(By.name("issueDate"), "05.02.2007");

        System.out.println(format.format(new Date()) + "Заполняем Кем выдан");
        fillElement(By.name("issuePlace"), "Кем то");

        System.out.println(format.format(new Date()) + "Выполняем проверки");
        assertEquals("Ivanov",driver.findElement(By.name("insured0_surname")).getAttribute("value"));
        assertEquals("Ivan",driver.findElement(By.name("insured0_name")).getAttribute("value"));
        assertEquals("15.01.1984",driver.findElement(By.name("insured0_birthDate")).getAttribute("value"));

        assertEquals("Васькин",driver.findElement(By.name("surname")).getAttribute("value"));
        assertEquals("Василий",driver.findElement(By.name("name")).getAttribute("value"));
        assertEquals("Федорович",driver.findElement(By.name("middlename")).getAttribute("value"));
        assertEquals("15.01.1967",driver.findElement(By.name("birthDate")).getAttribute("value"));
        assertEquals("male",
                driver.findElement(By.xpath("//fieldset[@class = 'b-form-fieldset-splash b-form-margtop-fieldset']/span[@class='b-radio-field b-checked-radio-field']/input")).getAttribute("name"));

        assertEquals("1234",driver.findElement(By.name("passport_series")).getAttribute("value"));
        assertEquals("196196",driver.findElement(By.name("passport_number")).getAttribute("value"));
        assertEquals("05.02.2007",driver.findElement(By.name("issueDate")).getAttribute("value"));
        assertEquals("Кем то",driver.findElement(By.name("issuePlace")).getAttribute("value"));


        System.out.println(format.format(new Date()) + "Нажимаем на кнопку продолжить");
        clickElement(By.xpath("//span[text()='Продолжить']"));

        System.out.println(format.format(new Date()) + "Проверяем на ошибку");
        assertEquals("Заполнены не все обязательные поля"
                ,driver.findElement(By.xpath("//div[@ng-show='tryNext && myForm.$invalid']")).getText());

        System.out.println(format.format(new Date()) + "Тест успешно пройден");
    }

    @After
    public void closeBrowser(){
        System.out.println(format.format(new Date()) + "Закрываем браузер");
        driver.quit();
    }

    //Заполняем поля Input
    public void fillElement(By locator, String value){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    //Совершаем клик по элементу
    public void clickElement(By locator){
        driver.findElement(locator).click();
    }

    //Используем для перемещения курсора в элемент
    public void moveMouseToElement(WebElement wbElement){
        action.moveToElement(wbElement).build().perform();
    }

}
