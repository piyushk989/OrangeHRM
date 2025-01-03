 package orangehrm.library;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import utils.AppUtils;

public class AdminModuleUtils extends AppUtils{
 
	@BeforeTest
	public void adminLogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");				
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();		
	}
	@AfterTest
	public void adminLogout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}   


