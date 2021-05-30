package com.visionit.automation.pages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.visionit.automation.utils.ElementActions;

public class EndToEndFeaturePage {

		
	private static final Logger logger = LogManager.getLogger(EndToEndFeaturePage.class);
	ElementActions elementActions;
//		By Locator
	private By SigninButtonElement = By.xpath("//div/a[contains(text(),'Sign in')]");
    private By registeredEmailidElement = By.id("email");
	private By alreadyCreatedPasswordElement = By.id("passwd");
	private By clickOnSignInButton1 = By.xpath("//*[@id='SubmitLogin']");
	
	
//	Locator- Faded T_Shirt up to add cart
	 private By T_ShirtButton = By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li[3]//a[@title='T-shirts']");
	   private By clickFadedTshirtElement = By.xpath("//a[normalize-space()='Faded Short Sleeve T-shirts']");
	   private By PriceElement = By.xpath("//span[@id='our_price_display']");
	   private By increaseQuantityElement = By.xpath("//i[@class='icon-plus']");
	   private By LsizeElement =By.xpath("//select[@id='group_1']");
	   private By QuantityElement = By.xpath("//input[@id='quantity_wanted']");
	   private By addToCartElement = By.xpath("//button[@class='exclusive']");
	   
	   //Locator-after adding Add to cart check all Details 
	   private By productSuccessfullyAddedElement = By.xpath("//h2[normalize-space()='Product successfully added to your shopping cart']");
	   private By quantityOfProductAfteraddedToCartElement = By.xpath("//span[@id='layer_cart_product_quantity']");
	   private By colourOfProductAfterAddedToCart = By.xpath("//span[@id='layer_cart_product_attributes']");
	   private By TotalPriceOfProductAddedToCart = By.xpath("//span[@class='ajax_block_cart_total']");
	   private By ProcedeToCheckOut1 = By.xpath("//a[@title='Proceed to checkout']");
	   
	   //Locator- proceed to check element then verify all details
	   private By userSeecThisProductNameElement = By.xpath("//td[@class='cart_description']//p[@class='product-name']");
	   private By InStockElement = By.xpath("//span[@class='label label-success']");
	   private By unitPrice = By.xpath("//td[@class='cart_unit']//span[@class='price']");
	   private By Quantity = By.xpath("//span[@class='heading-counter']");
	   private By TotalShippingPriceElemnt = By.xpath("//span[@id='total_price']");
	   private By ProceedToCheckOut2 = By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']");
	   private By proceedToCheckOut3 = By.xpath("//button[@class='button btn btn-default button-medium']");
	   private By proceedToCheckOut4 = By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']");
	  //  Locator-About  confirmation Payment 
	   private By CheckBox = By.xpath("//input[@id='cgv']");
	   private By PayByBankWire = By.xpath("//a[@title='Pay by bank wire']");
	   private By IconfirmedMyOrder = By.xpath("//button[@class='button btn btn-default button-medium']");
	   private By ordercompleteMessage = By.xpath("//p[@class='cheque-indent']");
	   private By amount = By.xpath("//span[@class='price']");
		// Constructor of the page:
			public EndToEndFeaturePage(WebDriver driver) {
				elementActions = new ElementActions(driver);
			}
		
			 public void EndToEndFeature()  {
		    	   elementActions.doClick(SigninButtonElement);
		    	//   elementActions.doSendKeys(registeredEmailidElement, AppConstants.email);
		  		//   elementActions.doSendKeys(alreadyCreatedPasswordElement, AppConstants.password);
		  		   elementActions.doClick(clickOnSignInButton1);
		    	   elementActions.doClick(T_ShirtButton);
		    	   logger.info("clicked on T-Shirt");
		    	   elementActions.waitForElementClickable(clickFadedTshirtElement);
		    	   elementActions.doClick(clickFadedTshirtElement);
		    	   logger.info("clicked on short sleeves t-shirt selected");
		    	   elementActions.waitForElementClickable(PriceElement);
		    	   logger.info("The price of the faded short sleeves T-shirt is: "+elementActions.doGetText(PriceElement));
		    	   elementActions.doClick(increaseQuantityElement);
		    	   elementActions.waitForElementVisible(QuantityElement);
		    	   logger.info("The quantity of T-shirt is incresed to: "+elementActions.doGetText(QuantityElement));
		    	   elementActions.selectByVisibleTextFromDropDown(LsizeElement, "L");
		    	   elementActions.doClick(addToCartElement);
		    	   elementActions.waitForElementVisible(productSuccessfullyAddedElement);
		    	//   Assert.assertEquals(AppConstants.ADDEDCARTMESSAGE, elementActions.doGetText(productSuccessfullyAddedElement), "message display is incorrect");
		    	   logger.info("user will see this pop up message after product added to cart: "+elementActions.doGetText(productSuccessfullyAddedElement));
		    	   logger.info("The total quantity of product added to cart is : " +elementActions.doGetText(quantityOfProductAfteraddedToCartElement));
		    	   logger.info("The coloure of the product added to cart is : "+elementActions.doGetText(colourOfProductAfterAddedToCart));
		           logger.info("The Total price of the product added to cart is : "+elementActions.doGetText(TotalPriceOfProductAddedToCart));
		           elementActions.doClick(ProcedeToCheckOut1);  
		           logger.info("proceed to check out 1st time");
		      //     Assert.assertEquals(elementActions.doGetText(TotalPriceOfProductAddedToCart),AppConstants.PRODUCT_NAME,"Incorrect product name displayed");
		           logger.info("The product name diplay for user is : "+elementActions.doGetText(userSeecThisProductNameElement));
		           logger.info("The product is in : "+elementActions.doGetText(InStockElement));
		           logger.info("Unit price is : "+elementActions.doGetText(unitPrice));
		           logger.info("current quantity is : "+elementActions.doGetText(Quantity));
		           logger.info("Total price with shipping charges is : "+elementActions.doGetText(TotalShippingPriceElemnt));
		           elementActions.doClick(ProceedToCheckOut2);
		           logger.info("clicked on proceed to check out 2nd time");
		           elementActions.doClick(proceedToCheckOut3);
		           logger.info("clicked on proceed to check out 3rd time");
		           elementActions.doClick(CheckBox);
		           elementActions.doClick(proceedToCheckOut4);
		           logger.info("clicked on proceed to check out 4th time");
		           elementActions.doClick(PayByBankWire);
		           logger.info("clicked on pay bank wire option");
		           elementActions.doClick(IconfirmedMyOrder);
		           logger.info("clicked on i confirm my order");
		           logger.info("order comleted message displayed is : "+elementActions.doGetText(ordercompleteMessage));
		           logger.info("The Amount Display is :"+elementActions.doGetText(amount));
		           
		        	   
		           }

			public static void main(String[] args) {
			//	EndToEndFeaturePage;
			}

			public static void clickOnTshirtButton() {
				// TODO Auto-generated method stub
				
			}
		       
		}
		       
