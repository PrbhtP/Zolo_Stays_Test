package zolo_POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import zolo_Generic.BasePage;

public class ZoloLogin_Page extends BasePage
{
	@FindBy(xpath="//a[contains(text(),'LOGIN')]")
	private WebElement loginBTN;
	
	@FindBy(xpath=".//*[@id='signin']/div/div[2]/div[2]/form/div[1]/input")
	private WebElement unTB;
	
	@FindBy(xpath=".//*[@id='signin']/div/div[2]/div[2]/form/div[2]/input")
	private WebElement pwdTB;
	
	@FindBy(xpath=".//*[@id='signin']/div/div[2]/div[2]/form/div[4]/div")
	private WebElement singinBTN;
	
	@FindBy(id="searchBar")
	private WebElement searchField;
	
	@FindBy(xpath=".//*[@id='content']/div/div[1]/div/form/div/div[1]/select")
	private WebElement budgetOptions;
	
	@FindBy(xpath=".//*[@id='content']/div/div[1]/div/form/div/div[2]/select")
	private WebElement sharingOptions;
	
	@FindBy(xpath=".//*[@id='gender-drpdwn']")
	private WebElement pgType;
	
	@FindBy(xpath=".//*[@id='583849856193f53870e51342']/a/div[2]/div[1]/h2")
	private WebElement propertyEle;
	
	@FindBy(xpath=".//*[@id='content']/div/div[3]/div[1]/div/div/div/span")
	private WebElement favoritesBTN;
	
	@FindBy(xpath=".//*[@id='content']/div/div[3]/div[2]/div[1]/div[1]/a")
	private WebElement scheduleAVisistBTN;
	
	@FindBy(xpath=".//*[@id='content']/div[3]/div[2]/div/div/div[2]/div/div[1]/div/form/div[1]/div/input")
	private WebElement dateField;
	
	@FindBy(xpath=".//*[@id='content']/div[3]/div[2]/div/div/div[2]/div/div[1]/div/form/div[2]/p[2]/select")
	private WebElement timeDDBTN;
	
	@FindBy(xpath="//div[text()='Schedule aVisit']")
	private WebElement visitBTN;
	
	@FindBy(xpath=".//*[@id='header']/div[3]/a[2]/div[1]")
	private WebElement hiTestDD;
	
	@FindBy(xpath=".//*[@id='header']/div[3]/div/ul/li[13]/a")
	private WebElement logoutBTN;
	
	
	
	
	public ZoloLogin_Page(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin()
	{
		loginBTN.click();
	}
	
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw) throws InterruptedException
	{
		Thread.sleep(1000);
		pwdTB.sendKeys(pw);
	}
	
	public void clickSingin()
	{
		WebDriverWait dr= new WebDriverWait(driver, 10);
		dr.until(ExpectedConditions.elementToBeClickable(singinBTN));
		singinBTN.click();
	}
	
	public void searchItem(String options)
	{
		WebDriverWait dr= new WebDriverWait(driver, 10);
		dr.until(ExpectedConditions.visibilityOf(searchField));
		
		searchField.sendKeys(options);
	}
	
	public void clickOption() throws InterruptedException
	{
		String eAutoSug = "Electronic City Phase II, Bengaluru, Karnataka, India";
		Thread.sleep(2000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		for(int i=0;i<=allOptions.size()-1;i++)
		{
			String aAutoSug = allOptions.get(i).getText();
			if(aAutoSug.equals(eAutoSug))
			{
				System.out.println(aAutoSug);
				allOptions.get(i).click();
			}
		}
		Thread.sleep(5000);
		
	}
	
	public void selectBudget() throws InterruptedException
	{
		System.out.println("i am running");
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(budgetOptions));
		Select select=new Select(budgetOptions);
		List<WebElement> options = select.getOptions();
		System.out.println(options.get(3));
		select.selectByVisibleText("5000 - 8000");
	}
	
	public void selectSharingType()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(sharingOptions));
		Select select=new Select(sharingOptions);
		select.selectByVisibleText("2 Sharing");
	}
	
	public void selectPgType()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(pgType));
		Select select=new Select(pgType);
		select.selectByVisibleText("Men");
	}
	
	public void selectPropertyInEle() throws AWTException
	{
		Robot r=new Robot();
		for(int i=1;i<=20;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_UP);
		}
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(propertyEle));
		propertyEle.click();
	}
	public void clickFavoritesBTN()
	{WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(favoritesBTN));
		favoritesBTN.click();
	}
	
	public void clcikOnScheduleVisit()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(scheduleAVisistBTN));
		scheduleAVisistBTN.click();
	}
	
	public void selectDate()
	{
		dateField.clear();
		dateField.sendKeys("2017-09-28");
	}
	
	public void selectTime()
	{
		Select select=new Select(timeDDBTN);
		select.selectByVisibleText("11 am - 12 pm");
	}
	
	public void clickOnVisitBTN()
	{
		visitBTN.click();
	}
	
	public void clickHiTestDD()
	{
		hiTestDD.click();
	}
	
	public void clickLogoutBTN() throws InterruptedException
	{
		Thread.sleep(2000);
		logoutBTN.click();
		
	}


}
