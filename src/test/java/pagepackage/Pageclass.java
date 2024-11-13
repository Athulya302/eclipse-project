package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageclass {
 WebDriver driver;
 @FindBy(id="user-name")
	WebElement username;
 @FindBy(id="password")
 WebElement password;
 @FindBy(id="login-button")
 WebElement lgnbtn;
 
 
 public Pageclass(WebDriver driver) {
	 this.driver=driver;
		PageFactory.initElements(driver,this);
		}
		public void setvalues(String un,String pwd) {
		
			username.sendKeys(un);
			password.sendKeys(pwd);
		}
		public void loginclick() {
			lgnbtn.click();
			 
 }
 
}
