package stepdefinition;

import cucumber.TestContext;
import cucumber.TestContextManager;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import objects.User;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;

import java.util.List;
import java.util.Map;

public class RegisterStepDefs {
    static WebDriver driver;
    TestContext testContext;
    LoginPage loginPage;
    RegisterPage registerPage;

    /*public RegisterStepDefs(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
        registerPage = testContext.getPageObjectManager().getRegisterPage();
    }*/
    public RegisterStepDefs() {
        testContext = TestContextManager.getTestContext();
        loginPage = testContext.getPageObjectManager().getLoginPage();
        registerPage = testContext.getPageObjectManager().getRegisterPage();
    }
    @When("^I click on Register$")
    public void iClickOnRegister() {
        loginPage.navigateToRegister();
    }

    @And("^fill out the form with information$")
    public void fillOutTheFormWithInformation(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        Map<String, String> row = list.get(0);

        // Get value according to Header
        String fullName = row.get("Fullname");
        String preferredName = row.get("Preferred name");
        String email = row.get("Email");
        String mobileNumber = row.get("Mobile number");
        String followChannel = row.get("Follow channel");

        if (!fullName.isEmpty()){
            registerPage.inputFullname(fullName);
        }
        if (!preferredName.isEmpty()){
            registerPage.inputpreferredName(preferredName);
        }
    }
}
