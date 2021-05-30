package com.visionit.automation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.base.BaseTest;
import com.visionit.automation.pages.EndToEndFeaturePage;
import com.visionit.automation.pages.T_ShirtPage;
import com.visionit.automation.utils.AppConstants;
import com.visionit.automation.variables.FriendFeatureDetails;

public class FriendFeaturePageTest extends BaseTest  {

	private static final Logger logger = LogManager.getLogger(FriendFeaturePageTest.class);

	
	@Test
	public void tc_2_verify_Friend_feature_Test() {

       logger.info("Test case started: tc_2_Friend_feature_Test");
    		 EndToEndFeaturePage.clickOnTshirtButton();
	//	Assert.assertEquals(isUserGotRegistered,FriendFeatureDetails.Friend_Name );
		
	       logger.info("Test case ended: tc_2_Friend_feature_Test");
	}
}