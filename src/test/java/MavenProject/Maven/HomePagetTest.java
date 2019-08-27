package MavenProject.Maven;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepo.Base;
import Pages.HomePage;
import Pages.PageObjectPage;

public class HomePagetTest extends Base{
	
	
	
	@BeforeTest(groups = {"Regression"})
	public void openBrowser() throws IOException {

		broswerOpening();
		// TODO Auto-generated constructor stub
		System.out.println(Base.driver.getTitle());
	}
	
	@Test(priority=0, groups= {"Regression"})
	public void ClickOnPageObject()
	{
		HomePage.clickOnPageObjectModelLink();
	}
	
	@Test(priority=1, groups= {"Regression"})
	public void SwitchToChildWindow()
	{
		HomePage.SwitchToChildWindow();
	}
	
	@Test(priority=2, groups= {"Regression"})
	public void clickOnFindOutMore()
	{
		PageObjectPage.clickOnFindOutMoreButton();
	}
	@Test(priority=3, groups= {"Regression"})
	public void clickOnAlterCloseButton()
	{
		PageObjectPage.clickOnCloseButton();
	}
	
	@Test(priority=4, groups= {"Regression"})
	
	public void SwitchToParentWindow()
	{
		HomePage.SwitchToParentWindow();
	}
	

	
}
