package testcases;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/",
        glue = {"definitions"}
        // tags = "@ReservaBooking"
)
public class TestRunner {
}
