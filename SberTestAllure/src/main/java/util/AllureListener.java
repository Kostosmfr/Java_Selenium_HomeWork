package util;

import com.sun.net.httpserver.Authenticator;
import org.junit.runner.notification.Failure;
import ru.yandex.qatools.allure.junit.AllureRunListener;
import steps.BaseSteps;

/**
 * Created by K_PC-S on 22.01.2018.
 */
public class AllureListener extends AllureRunListener{

    @Override
    public void testFailure(Failure failure){
        BaseSteps.takeScreenshot();
        super.testFailure(failure);
    }

}
