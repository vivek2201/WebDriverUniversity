package Pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import ObjectRepo.Base;

public class HomePage
{
	@FindBy(xpath="//h1[text()='PAGE OBJECT MODEL']")
	WebElement PageObjectModelLink;
	
	
	
	public WebDriver driver=null;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
public static void clickOnPageObjectModelLink()
{
	HomePage homepage=new HomePage(Base.driver);
		homepage.PageObjectModelLink.click();
		
		
}

public static void SwitchToChildWindow()
{
	Set <String> ids=Base.driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	String ParentWindow=it.next();
	String ChildWindow=it.next();
	Base.driver.switchTo().window(ChildWindow);
	System.out.println(Base.driver.getTitle());
}

public static void SwitchToParentWindow()
{

	Set <String> ids=Base.driver.getWindowHandles();
	Iterator<String> it=ids.iterator();
	String ParentWindow=it.next();
	Base.driver.switchTo().window(ParentWindow);
	System.out.println(Base.driver.getTitle());
}
	
	
	//a[text()='Images']
}
