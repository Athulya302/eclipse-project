package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Checkout;
import pagepackage.Clickaddtocart;
import pagepackage.Pageclass;
import utilpackage.utilclass;

public class CheckoutTest extends Baseclass{
	@Test
	 public void voidverifylogin() throws InterruptedException {
			Pageclass p1=new Pageclass(driver);
			String xl="C:\\Users\\Lenovo\\Desktop\\automation\\demoprojec sheet.xlsx";
			String Sheet="Sheet1";
			int  rowCount=utilclass.getRowCount(xl,Sheet);
			System.out.println(rowCount);
			
			for(int i=1;i<=rowCount;i++) {
				int cellcount=utilclass.getCellCount(xl,Sheet,i);
				System.out.println("Cell count: "+cellcount);
				
				for(int j=0;j<cellcount;j+=2) {
					String username=utilclass.getCellValue(xl,Sheet,i,j);
					System.out.println("username="+username);
					
					String pwd=utilclass.getCellValue(xl,Sheet,i,j+1);
					System.out.println("password="+pwd);
					
					p1.setvalues(username,pwd);
					
					p1.loginclick();
					String act_url=driver.getCurrentUrl();
					String exp_url="https://www.saucedemo.com/inventory.html";
							if(act_url.equalsIgnoreCase(exp_url)) {
								System.out.println("login success");
							
							break;
				}else {
								System.out.println("login failed");
							}
					Thread.sleep(1000);
					driver.get("https://www.saucedemo.com/");
					
				}
			}
			Clickaddtocart pdt=new Clickaddtocart(driver);
					pdt.addtocart();
			Checkout check=new Checkout(driver);
			check.carticon();
			check.checkout();
			
			
		}
	}
		
		


