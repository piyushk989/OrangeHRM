package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithInValidData extends AppUtils { 
	 
	@Parameters({"username","password"})
	@Test
	public void checkAdminLogin(String uid,String pwd)
	{
		 LoginPage lp =new LoginPage();
		 lp.login(uid, pwd);
		 boolean fal=lp.isErrMsgDisplayed();
		 Assert.assertTrue(fal);
	}
}
