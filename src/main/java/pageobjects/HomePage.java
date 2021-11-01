package pageobjects;

import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	// 1. Locators
	private By searchTextBox = By.xpath("//div[@class='search-container']");
	private By searchButton = By.xpath("//button[@type='submit']");

	// 2. Constructor of the page class
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	//3. Page actions

	public void navigateToHomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void enterSearchText(String text) {
		driver.findElement(searchTextBox).sendKeys(text);
	}

	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}
}
