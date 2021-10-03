
package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/frontEndTest",
				glue= {"stepdefinition"},
				dryRun = false,
				monochrome = true,
				plugin = {"pretty", "html:TestReports", "json:TestReports/cucumber.json", "junit:TestReports/cucumber.xml"}
				
		)
public class TestRunner {

}
