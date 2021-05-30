package com.visionit.automation.tests;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;
import com.visionit.automation.pages.ColourChangePage;


public class ColourPageTest extends BaseTest {
	private static final Logger logger = LogManager.getLogger(ColourPageTest.class);
	private ColourChangePage ColourChangePag;


	
	

	@Test
	public void tc_4_Change_Image_Color() {
		logger.info("Test case started: tc_04_Change_Image_Color ");	    
		boolean checkImageColor=  ColourChangePag.ChangeTshirtColour();
	  	logger.info("Visibility status of Tshirt color change : " + checkImageColor);
	  	Assert.assertEquals(checkImageColor, true);
		logger.info("Test case ended: tc_04_Change_Image_Color");

}

}

