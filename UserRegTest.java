package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.AdminModuleUtils;
import orangehrm.library.User;

public class UserRegTest extends AdminModuleUtils { 
	
	@Parameters({"role","empname","username","pwd"})
	@Test
	 public void checkUserReg(String role,String empname,String username,String pwd) throws InterruptedException
	 { 
		 User us =new User();
		Boolean res = us.addUser(role, empname, username, pwd);
		Assert.assertTrue(res);
	 }
}
