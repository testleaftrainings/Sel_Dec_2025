package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.Login;

public class RunCreateLead extends BaseClass{
	@Test
	public void runCreateLead() {
		//System.out.println(driver);
		Login lp=new Login();
		lp.enterUname().enterPassWord().clickLogin().clickCrmsfa().clickLeads().clickCreateLead().enterCname()
		.enterFname().enterLname().clickCreateLead().verifyLeads();
		
		
	}

}
