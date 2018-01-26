import org.junit.Test;
import pages.ContainerPage;
import pages.MainPage;
import pages.MinumumLifeInsurance;
import pages.TravelInsurance;

import static org.junit.Assert.assertEquals;

/**
 * Created by K_PC-S on 18.01.2018.
 */
/*public class InsuranceTest extends BaseTest {

   /* @Test
    public void testInsurance() throws Exception {
        driver.get(baseUrl + '/');
        MainPage mainPage = new MainPage(driver);

        mainPage.moveMouseToElement("Застраховать себя");
        mainPage.waitElement();
        mainPage.clickTo("Страхование путешественников");

        TravelInsurance travelInsurance = new TravelInsurance(driver);
        travelInsurance.waitAndIssueInsurance();
        assertEquals("Страхование путешественников",
                travelInsurance.header.getText());
        travelInsurance.clickIssue();
        travelInsurance.swithTab();

        MinumumLifeInsurance minimumLifeInsurance = new MinumumLifeInsurance(driver);
        minimumLifeInsurance.waitLoadFormBlockBox("Минимальная");
        minimumLifeInsurance.clickToElement("Минимальная");
        minimumLifeInsurance.clickIssue("Оформить");

        ContainerPage containerPage = new ContainerPage(driver);
        containerPage.fillField("Фамилия /Surname", "Ivanov");
        containerPage.fillField("Имя / Given names", "Georgy");
        containerPage.fillField("Дата рождения застрахованного", "15.01.1984");
        containerPage.fillField("Фамилия", "Иванова");
        containerPage.fillField("Имя", "Василиса");
        containerPage.fillField("Отчество", "Марковна");
        containerPage.fillField("Дата рождения", "26.06.1954");
        containerPage.sex("женский");
        containerPage.fillField("Серия", "4511");
        containerPage.fillField("Номер", "196196");
        containerPage.fillField("Дата выдачи", "05.02.1994");
        containerPage.fillField("Кем выдан", "Кем то");

        assertEquals("Ivanov", containerPage.insuredSurName.getAttribute("value"));
        assertEquals("Georgy", containerPage.insuredName.getAttribute("value"));
        assertEquals("15.01.1984", containerPage.insuredBirthDate.getAttribute("value"));

        assertEquals("Иванова", containerPage.insurantSurName.getAttribute("value"));
        assertEquals("Василиса", containerPage.insurantName.getAttribute("value"));
        assertEquals("Марковна", containerPage.insurantMiddleName.getAttribute("value"));
        assertEquals("26.06.1954", containerPage.insurantBirthDate.getAttribute("value"));
        assertEquals("female",
                containerPage.female.getAttribute("name"));
        assertEquals("4511", containerPage.pasportSeries.getAttribute("value"));
        assertEquals("196196", containerPage.pasportNumber.getAttribute("value"));
        assertEquals("05.02.1994", containerPage.issueDate.getAttribute("value"));
        assertEquals("Кем то", containerPage.issuePlace.getAttribute("value"));

        containerPage.continueClick();
        containerPage.waitError();
        containerPage.checkError("Заполнены не все обязательные поля");
    }*/


//}
