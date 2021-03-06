package managers;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import pageobjects.*;


public class PageObjectManager {
 
	private WebDriver driver;

	private HomePage homePage;
	

 
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage(){
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}



}