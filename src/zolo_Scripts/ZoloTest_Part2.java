package zolo_Scripts;

import org.testng.annotations.Test;

import zolo_Generic.BaseTest;
import zolo_POM.ZoloBooking_Page;
import zolo_POM.ZoloLogin_Page;

public class ZoloTest_Part2 extends BaseTest
{
	
	@Test
	public void confirmBooking() throws InterruptedException
	{
		ZoloBooking_Page zb=new ZoloBooking_Page(driver);
		ZoloLogin_Page zl=new ZoloLogin_Page(driver);
		
//		after the login to application the steps to be followed
//		clcik on "Test Account" button
		zb.clickTestAccountBTN();
		
//		clcik on "Hi Test" drop down
		zl.clickHiTestDD();
		
//		click on "Favorites" button
		zb.clickFavoritesBTN();
		
//		clcik on "Zolo​ ​Goodfellas​ ​for​ ​men" present in favorites list
		zb.clickShortlistedITEM();
		
//		clcik on "Request Bed" button
		zb.clickRequestBedBTN();
		
//		enter the future date in date field
		zb.enterInDateField("2017-09-24");
		
//		select the sharing type as "2 Sharing"
		zb.clickOption2Sharing();
		
//		clcik on "Proceed to pay" button
		zb.clickProceedToPayBTN();
		
//		check the "Name" and "Mobile Number"
//		then click on "Make payment" nutton
		zb.clickMakePaymentBTN();
		
//		select "PayTM" as payment method
		zb.clickPaytmOptionBTN();
		
		
		
	}

}
