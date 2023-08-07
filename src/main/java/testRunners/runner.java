package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import Util.DriverFactory;


@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions", "Util"},
        tags = " @Jenkins",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html"
        }
)
public class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();


}