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
		
//		zl.clickLogin();
//		zl.setUsername("7777777014");
//		zl.setPassword("123456");
//		zl.clickSingin();
		zb.clickTestAccountBTN();
		zl.clickHiTestDD();
		zb.clickFavoritesBTN();
		zb.clickShortlistedITEM();
		zb.clickRequestBedBTN();
		zb.enterInDateField("2017-09-24");
		zb.clickOption2Sharing();
		zb.clickProceedToPayBTN();
		zb.clickMakePaymentBTN();
		zb.clickPaytmOptionBTN();
		
		
		
	}

}
