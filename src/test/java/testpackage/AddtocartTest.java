package testpackage;

import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Clickaddtocart;
import pagepackage.Pageclass;
import utilpackage.utilclass;

public class AddtocartTest extends Baseclass{
	@Test
	public void verify_login() throws InterruptedException {
		Pageclass p1=new Pageclass(driver);
		String xl="C:\\Users\\Lenovo\\Desktop\\automation\\demoprojec sheet.xlsx";
		String Sheet="Sheet1";
		int rowcount=utilclass.getRowCount(xl, Sheet);
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++) {
			int cellCount=utilclass.getCellCount(xl,Sheet,i);
			System.out.println("Cell Count:"+cellCount);
			
			for(int j=0;j<cellCount;j+=2) { 
				String userName=utilclass.getCellValue(xl,Sheet,i, j);
				System.out.println("UserNmae="+userName);
				String pwd=utilclass.getCellValue(xl,Sheet,i,j+1);
				System.out.println("Password="+pwd);
				
				p1.setvalues(userName,pwd);
				
				p1.loginclick();
				String act_url=driver.getCurrentUrl();
				String exp_url="https://www.saucedemo.com/inventory.html";
				if(act_url.equalsIgnoreCase(exp_url)) {
					System.out.println("login passed");
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
	}
	
	}

	