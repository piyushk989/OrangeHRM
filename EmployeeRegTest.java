 package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.AdminModuleUtils;
import orangehrm.library.Employee;



public class EmployeeRegTest extends AdminModuleUtils{
  
	     @Parameters({"fname","lname"})
	     @Test
	     public void employeeReg(String fname,String lname)
	     {  
	         Employee emp =new Employee();
	    	 boolean res =emp.addEmployee(fname, lname);
	    	 Assert.assertTrue(res);
	     }
}
