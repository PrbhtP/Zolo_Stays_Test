package zolo_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zolo_Generic.BasePage;

public class ZoloBooking_Page extends BasePage
{

	@FindBy(xpath=".//*[@id='navbar']/ul/li[5]/a")
	private WebElement testAccountBTN;
	
	@FindBy(xpath=".//*[@id='header']/div[3]/div/ul/li[2]/a")
	private WebElement favoritesBTN;
	
	@FindBy(xpath=".//*[@id='583849856193f53870e51342']/a/div[2]/div[1]/h2")
	private WebElement shortlistedITEM;
	
	@FindBy(xpath=".//*[@id='content']/div/div[3]/div[2]/div[1]/div[2]/a")
	private WebElement requestBedBTN;
	
	@FindBy(xpath=".//*[@id='content']/div/div/div/div[1]/div/div[2]/div/input")
	private WebElement dateField;
	
	@FindBy(xpath=".//*[@id='content']/div/div/div/div[3]/div[2]/div[1]/div/div[2]/h4[1]")
	private WebElement option2Sharing;
	
	@FindBy(xpath=".//*[@id='content']/div/div/div/div[4]/div/button[1]")
	private WebElement proceedToPayBTN;
	
	@FindBy(xpath=".//*[@id='content']/div/div/div/div[6]/div/div/div/div[3]/div[2]/h4")
	private WebElement name;
	
	@FindBy(xpath=".//*[@id='content']/div/div/div/div[6]/div/div/div/div[3]/div[4]/h4")
	private WebElement mobileNO;
	
	@FindBy(xpath=".//*[@id='content']/div/div/div/div[6]/div/div/div/div[3]/div[15]/div")
	private WebElement makePaymentBTN;
	
	@FindBy(xpath=".//*[@id='payment-gateway']/div/div/div[2]/div/div/div[5]/div[3]/li")
	private WebElement paytmOptionBTN;
	
	

	public ZoloBooking_Page(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickTestAccountBTN() throws InterruptedException
	{
		Thread.sleep(2000);
		testAccountBTN.click();
	}
	
	public void clickFavoritesBTN()
	{
		favoritesBTN.click();
	}
	
	public void clickShortlistedITEM()
	{
		shortlistedITEM.click();
	}
	
	public void clickRequestBedBTN()
	{
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(requestBedBTN));
		requestBedBTN.click();
	
	}
	
	public void enterInDateField(String date)
	{
		dateField.clear();
		dateField.sendKeys(date);
	}
	
	public void clickOption2Sharing()
	{
		option2Sharing.click();
	}
	
	public void clickProceedToPayBTN()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(proceedToPayBTN));
		proceedToPayBTN.click();
	}
	
	public void clickMakePaymentBTN()
	{
		String aName = name.getText();
		String eName = "Abhishek Amminabhavi";
		
		String aMobile = mobileNO.getText();
		String eMobile = "9632263266";
		
		if(aName.equals(eName) && aMobile.equals(eMobile))
		{
			makePaymentBTN.click();
			
		}
	}
	
	public void clickPaytmOptionBTN()
	{
		paytmOptionBTN.click();
	}

}
