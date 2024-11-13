package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Pageclass;




public class Logintest extends Baseclass{
	@Test
	 public void voidverifylogin() throws InterruptedException {
			Pageclass page=new Pageclass(driver);
			
	 }

}
