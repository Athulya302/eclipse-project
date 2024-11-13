package pagepackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickaddtocart {
	 WebDriver driver;
	
	 
		@FindBy(xpath="//button[contains(text(), 'Add to cart')]")
		 List<WebElement> addtocart;
		
		public Clickaddtocart(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
		public void addtocart() {
			for(WebElement cart:addtocart)
			cart.click();
			}
				 
			}

