package zolo_Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import zolo_POM.ZoloLogin_Page;

public abstract class BaseTest implements AutoConst
{
	public WebDriver driver;
	@BeforeMethod
	public void openZolo() throws InterruptedException
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://52.201.90.154:9002/");
		ZoloLogin_Page zl=new ZoloLogin_Page(driver);
		zl.clickLogin();
		zl.setUsername("7777777014");
		zl.setPassword("123456");
		zl.clickSingin();
	}
	@AfterMethod
	public void closeZolo() throws InterruptedException
	{
	  ZoloLogin_Page zl=new ZoloLogin_Page(driver);
      zl.clickHiTestDD();
      zl.clickLogoutBTN();
      driver.quit();
	}


}
