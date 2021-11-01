package stepdefinition;


import cucumber.TestContextManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.HomePage;

public class SearchStepDefs {
    private static String title;
    private HomePage homePage = new HomePage(TestContextManager.getTestContext().getWebDriverManager().getDriver());


    @Given("^I want to open OpenWeather site$")
    public void i_want_to_open_open_weather_site() {
        homePage.navigateToHomePage();
    }


    @Then("the weather result is shown with current date")
    public void theWeatherResultIsShownWithCurrentDate() {

    }

    @Then("^page title should be \"([^\"]*)\"$")
    public void pageTitleShouldBe(String expectedPageTitle) {
        title = homePage.getHomePageTitle();
        Assert.assertTrue(title.contains(expectedPageTitle));
    }

    @When("^I search for weather in \"([^\"]*)\"$")
    public void iSearchForWeatherIn(String arg0) {

    }


}
