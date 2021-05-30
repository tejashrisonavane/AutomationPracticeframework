package com.visionit.automation.tests;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.visionit.automation.pages.EndToEndFeaturePage;
import com.visionit.automation.variables.FriendFeatureDetails;

public class EndFeatureTest {
	private static final Logger logger = LogManager.getLogger(EndFeatureTest.class);
	private EndToEndFeaturePage endToEndFeaturePage;

	@Test
	public void tc_5_verify_End_Feature_Test() {

       logger.info("Test case started: tc_5_End_Feature_Test");
       
     
    		   endToEndFeaturePage.EndToEndFeature();
		
		
	       logger.info("Test case ended: tc_5_End_Feature_Test");
	}
}

	