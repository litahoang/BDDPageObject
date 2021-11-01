package stepdefinition;

import cucumber.TestContextManager;
import cucumber.api.java.After;

public class Hook {

    @After
    public void tearDown() {
         TestContextManager.getTestContext().getWebDriverManager().getDriver().quit();
    }
}
