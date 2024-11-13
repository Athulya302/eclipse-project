package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartbutton;
	
	@FindBy(xpath="//button[contains(text(), 'Checkout')]")
	WebElement checkout;
	public Checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);//initializing webelements
	}
	public void carticon() {
		cartbutton.click();
	}
	public void checkout() {
		checkout.click();
	}
		
	}


