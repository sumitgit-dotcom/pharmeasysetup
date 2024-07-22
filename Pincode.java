package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pincode {
	
    WebDriver driver;
    public Pincode(WebDriver d)
    {
    	
    	this.driver = d;
    	PageFactory.initElements(driver, this);
    }
    @FindBy(id = "pincode")
    WebElement pincode;
    @FindBy(xpath = "//button[text()='Check']")
    
    WebElement checkButton;
    
    public void enterPincode(String pin) {
    	pincode.sendKeys(pin);
    }
    public void clickCheckButton() {
        checkButton.click();
    }
    public String getPincode() {
        return     	pincode.getAttribute("value");
    }

    
    


}
