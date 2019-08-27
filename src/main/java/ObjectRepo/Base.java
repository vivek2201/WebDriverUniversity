package ObjectRepo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public static WebDriver driver=null;

	public void broswerOpening() throws IOException
		{
			
			 
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\PriyaS\\eclipse-workspace\\intro\\src\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		Properties prop= new Properties();//create a instance of properties file
		FileInputStream fis=new FileInputStream("C:\\Users\\PriyaS\\eclipse-workspace\\Maven\\src\\main\\java\\ObjectRepo\\Source.properties");
		prop.load(fis);
		String browser= prop.getProperty("Browser");
		String URL= prop.getProperty("URL");
		if(browser.equals("Chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
			
			
		
			
		
	}
	

}
