package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import userinterface.RegisterUI;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void inputFullname(String fullName) {
        driver.findElement(By.xpath(RegisterUI.FULLNAME)).sendKeys(fullName);
    }

    public void inputpreferredName(String preferredName) {
        driver.findElement(By.xpath(RegisterUI.PREFERRED_NAME)).sendKeys(preferredName);

    }
}
