import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


/**
 * Created by K_PC-S on 28.01.2018.
 */


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"steps"},
        plugin = {
                "util.AllureReporter",
        }
)

public class CucumberRunner {
}
