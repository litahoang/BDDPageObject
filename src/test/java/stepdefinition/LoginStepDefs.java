package stepdefinition;

import cucumber.TestContext;
import cucumber.TestContextManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;

public class LoginStepDefs {
    static WebDriver driver;
    TestContext testContext;
    LoginPage loginPage;

    public LoginStepDefs (){
        testContext = TestContextManager.getTestContext();
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Given("^I open the URL$")
    public void iOpenTheURL() {
        loginPage.navigateToLoginPage();
    }

    @When("^I login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithUsernameAndPassword(String username, String password) {
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickNextBtn();
    }

}
