package util;

import gherkin.formatter.model.Result;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.Allure;
import ru.yandex.qatools.allure.events.MakeAttachmentEvent;

import static steps.BaseSteps.getDriver;

/**
 * Created by K_PC-S on 28.01.2018.
 */
public class AllureReporter extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter {


@Override
public void result(Result result) {
        if ("failed".equals(result.getStatus())) takeScreenshot(result);
        super.result(result);
        }



public void takeScreenshot(Result step) {
        if (getDriver() != null) {
        Allure.LIFECYCLE.fire(new MakeAttachmentEvent(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES),
        "Скриншот в момент ошибки", "image/png"));
        }
        }
        }
