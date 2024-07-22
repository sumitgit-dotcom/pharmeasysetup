package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pintest {
	WebDriver driver;
	Pincode pt;
	
	@BeforeClass
	public void setup()
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.pharmeasy.in/");
	        pt = new Pincode(driver);
	        }
	@Test
	public void validation()
	{
		pt.enterPincode("452010");
		String code = pt.getPincode();
		System.out.println("code"+ code);
		assert "452010".equals(code) : "entered wrong pincode";
		
		}
	@AfterClass
	public void end()
	{
		
		driver.quit();
	}
	

}
