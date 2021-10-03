package stepdefinition;

import cucumber.TestContext;
import cucumber.TestContextManager;
import cucumber.api.java.After;

public class Hook {

    @After
    public void tearDown() {
         TestContextManager.getTestContext().getWebDriverManager().getDriver().quit();
    }
}
