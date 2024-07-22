package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FinalTest {
    WebDriver driver;
    Login login;
    Logintestpage test;
    Pincode code;
    Product pr;
    
    @BeforeClass
    public void setUp()
    {
    	
    	
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://pharmeasy.in/");
        
        login = new Login(driver);
        code = new Pincode(driver);
        pr = new Product(driver);
        
        
    }
    @Test
    public void testendprocess()
    {
    	
    	login.enterMobileNumber("8871220199");
    	login.clickSendOtpButton();
    	String otp = "1111";
    	login.enterOtp(otp);
    	login.clickLoginButton();
    	
    	code.enterPincode("452010");
    	code.clickCheckButton();
    	System.out.println("pinocode" +code.getPincode());
    	
    	pr.searchProduct("paracetamol");
    	pr.addToCart();
    	pr.viewCart();
    	pr.checkout();
    	
     
    }
    @AfterClass
    
    public void endprocess()
    {
    	
    	driver.quit();
    }
    

    
    

}
