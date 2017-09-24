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
		zl.clickLogin();
		zl.setUsername("7777777014");
		zl.setPassword("123456");
		zl.clickSingin();
		zl.searchItem("Electro");
		zl.clickOption();
		zl.selectBudget();
		zl.selectSharingType();
		zl.selectPgType();
		zl.selectPropertyInEle();
		zl.clcikOnScheduleVisit();
		zl.selectDate();
		zl.selectTime();
		zl.clickOnVisitBTN();
		zl.clickHiTestDD();
		zl.clickLogoutBTN();
	}



}
