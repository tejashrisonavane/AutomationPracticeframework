package com.visionit.automation.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.visionit.automation.pages.Sign_UpPage;


public class BaseTest {
	
	public WebDriver driver;
	public Properties prop;
	public BasePage basePage;
	public Sign_UpPage registerPage;

   
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(@Optional("chrome") String browserName) {
		System.out.println("browserName is : "+ browserName);
		basePage = new BasePage();
		prop = basePage.init_prop();
		prop.setProperty("browser", browserName);
		driver = basePage.init_driver(prop);
	
		registerPage = new Sign_UpPage(driver);
	}

	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}

}
