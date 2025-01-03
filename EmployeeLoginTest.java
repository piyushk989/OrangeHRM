package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeLoginTest extends AppUtils {

	@Parameters({"empuid","emppwd"})
	@Test
	public void checkEmpLogin(String empuid,String emppwd)
	{
		LoginPage lp=new LoginPage();
		lp.login(empuid, emppwd);
		boolean res =lp.isEmpModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
	}
}
