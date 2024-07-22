package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    
    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    } 
    
    @FindBy(id = "mobileNumber")
    WebElement mobileNumb;
    @FindBy(xpath = "//button[text()='Send OTP']")

    WebElement sendOtpButton;
    @FindBy(id = "otp")

    WebElement otpField;
    @FindBy(xpath = "//button[text()='Login']")

    WebElement loginButton;

    public void enterMobileNumber(String mobileNumber) {
    	mobileNumb.sendKeys(mobileNumber);
    }
    public void clickSendOtpButton() {
        sendOtpButton.click();
    }
    public void enterOtp(String otp) {
        otpField.sendKeys(otp);
    }
    public void clickLoginButton() {
        loginButton.click();
    }


    
    
    }
    
    
    
    
    
    
    



