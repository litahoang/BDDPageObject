package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public void inputPreferredName(String preferredName) {
        driver.findElement(By.xpath(RegisterUI.PREFERRED_NAME)).sendKeys(preferredName);

    }

    public void inputEmail(String email) {
        driver.findElement(By.xpath(RegisterUI.EMAIL)).sendKeys(email);
    }

    public void selectCountryName(String countryName) {
        waitForVisibilityOfElement(RegisterUI.COUNTRY_DROPDOWN);
        driver.findElement(By.xpath(RegisterUI.COUNTRY_DROPDOWN)).click();
        scrollToElement(countryName);
        driver.findElement(By.xpath(String.format(RegisterUI.OPTIONS, countryName))).isDisplayed();
        driver.findElement(By.xpath(String.format(RegisterUI.OPTIONS, countryName))).click();
    }

    public void selectFollowingChannel(String channel){
        waitForVisibilityOfElement(RegisterUI.FOLLOWING_DROPDOWN);
        driver.findElement(By.xpath(RegisterUI.FOLLOWING_DROPDOWN)).click();
        scrollToElement(channel);
        driver.findElement(By.xpath(String.format(RegisterUI.OPTIONS, channel))).isDisplayed();
        driver.findElement(By.xpath(String.format(RegisterUI.OPTIONS, channel))).click();

    }

    public void inputMobileNumber(String mobileNumber) {
        driver.findElement(By.xpath(RegisterUI.MOBILE_NUMBER)).sendKeys(mobileNumber);
    }

    public void scrollToElement(String textContent) {
        WebElement element = driver.findElement(By.xpath(String.format(RegisterUI.OPTIONS, textContent)));
        System.out.println(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void waitForVisibilityOfElement(String xPath) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
    }
}