package zolo_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,5);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("PASS:title is matching");
			
		} 
		catch (Exception e) 
		{
			Reporter.log("FAIL:title not matching");
			// TODO: handle exception
		}
	}


}
