package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details {
	WebDriver driver;
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="postalCode")
	WebElement postalcode;
	@FindBy(name="continue")
	WebElement continuee;
	@FindBy(id="finish")
	WebElement finish;
	@FindBy(id="back-to-products")
	WebElement home;
	@FindBy(id="react-burger-menu-btn")
	WebElement menu;
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	
	public Details(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);//initializing webelements
	}
	public void setvalue(String fn,String ln,String pin) {
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		postalcode.sendKeys(pin);
		
	}
	public void click_continue() {
		continuee.click();
	}
	public void click_finish() {
		finish.click();
	}
	public void click_backtohome() {
		home.click();
	}
	public void logout() {
		menu.click();
		logout.click();
	}

}


