package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintestpage {
	WebDriver driver;
	Login loginpage;
	
	@BeforeClass
	public void setup()
	{
		
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://pharmeasy.in/");
        loginpage = new Login(driver);

}
	@Test
	public void testLogin()
	{
		loginpage.enterMobileNumber("8871220199");	
		loginpage.clickSendOtpButton();
		String otp = "1111";
		loginpage.enterOtp(otp);
		loginpage.clickLoginButton();
		}
	
	@AfterClass
	public void endtask() {
        driver.quit();
    }

}
