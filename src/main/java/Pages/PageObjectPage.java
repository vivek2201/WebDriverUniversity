package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepo.Base;

public class PageObjectPage {
	
	@FindBy(xpath="//b[text()='Find Out More!']")
	static
	WebElement FindOutMoreButton;
	
	@FindBy(xpath="//button[text()='Close']")
	static
	WebElement AlterCloseButton;
	
		
	public WebDriver driver=null;
	PageObjectPage pageObjectpage;
	
	public PageObjectPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void clickOnFindOutMoreButton() 
	{
		
		new PageObjectPage(Base.driver);
		FindOutMoreButton.click();
	}
	
	public static void clickOnCloseButton()
	{
		new PageObjectPage(Base.driver);
		WebDriverWait wait=new WebDriverWait(Base.driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
		AlterCloseButton.click();
	}
	
	
}
