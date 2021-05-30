package com.visionit.automation.pages;



import org.apache.logging.log4j.LogManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.visionit.automation.tests.Sign_UpTest;
import com.visionit.automation.utils.ElementActions;

public class ColourChangePage {

		
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Sign_UpTest.class);
	ElementActions elementActions;
	
	
	
//Locator-ColourChange Element
	
	private	By TshirtBoxElement = By.xpath("//div[@id='block_top_menu']/ul/li[3]/a");
	private	By clickOnFladedShirt = By.xpath("//div[@class='product-image-container']/a/img");
	private By ColourChangeElement = By.xpath("//*[@id='color_2']");
	private	By ColorTshirt = By.xpath("//div[@id='image-block']");
		
		// Constructor of the page:
			public ColourChangePage(WebDriver driver) {
				elementActions = new ElementActions(driver);
			}
		
			// Page Actions:
			public boolean ChangeTshirtColour() {
			elementActions.doClick(TshirtBoxElement);
			elementActions.doMoveToElement(clickOnFladedShirt);
            elementActions.doClick(ColourChangeElement);
            elementActions.waitForElementVisible(ColorTshirt);

		    boolean DisplayBlueColour = elementActions.doIsDisplayed(ColorTshirt);
		    return DisplayBlueColour;
				
			}

	}

