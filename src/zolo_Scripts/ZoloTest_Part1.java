package zolo_Scripts;

import java.awt.AWTException;

import zolo_Generic.BaseTest;
import zolo_POM.ZoloLogin_Page;

public class ZoloTest_Part1 extends BaseTest
{
	@org.testng.annotations.Test
	public void visitSchedule() throws InterruptedException, AWTException
	{
		ZoloLogin_Page zl=new ZoloLogin_Page(driver);
		
//		After the login actions to be performed
//		enter "Electronic" in search field
		zl.searchItem("Electro");
		
//		select "Electronic City Phase II, Bengaluru, Karnataka, India" from autosuggesion
		zl.clickOption();
		
//		select budget "5000-6000"
		zl.selectBudget();
		
//		select sharing type "2 sharing"
		zl.selectSharingType();
		
//		select PG type "Men"
		zl.selectPgType();
		
//		click on the property "Zolo​ ​Goodfellas​ ​for​ ​men"
		zl.selectPropertyInEle();
		
//		click on "Schedule A Visit"
		zl.clcikOnScheduleVisit();
		
//		entr a future date ex- "2017-09-28"
		zl.selectDate();
		
//		select a time slot ex- "11-12"
		zl.selectTime();
		
//		clcik on "confirm visit" button
		zl.clickOnVisitBTN();
		
//		clcik on "Hi Test" drop down
		zl.clickHiTestDD();
		
//		clcik on "logout" Button
		zl.clickLogoutBTN();
	}



}
