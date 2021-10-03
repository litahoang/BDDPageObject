package pageobjects;

import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import userinterface.LoginUI;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public void enterUserName(String username) {
        driver.findElement(By.id(LoginUI.USERNAME_TEXT_BOX)).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id(LoginUI.PASS_TEXT_BOX)).sendKeys(password);
    }

    public void clickNextBtn() {
        driver.findElement(By.xpath(LoginUI.NEXT_BTN)).click();
    }

    public void navigateToRegister() {
        driver.findElement(By.xpath(LoginUI.REGISTER_BTN)).click();
    }
}
