package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	 WebDriver driver;
	 public Product( WebDriver driver)
	 {
		 
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(id = "search")
	    WebElement search;
	 @FindBy(xpath = "//button[text()='Add to Cart']")
	    WebElement addToCart;
	 @FindBy(id = "cart")
	    WebElement cartButton;
	 @FindBy(xpath = "//button[text()='Checkout']")
	    WebElement checkout;
	 public void searchProduct(String productName) {
		 search.sendKeys(productName);
		 search.submit();
	    }
	 public void addToCart() {
		 addToCart.click();
	    }
	 public void viewCart() {
	        cartButton.click();
	    }
	 public void checkout() {
		 checkout.click();
	    }
	 

}
