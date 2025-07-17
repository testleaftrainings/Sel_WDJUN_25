package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.CommonMethods;
import pages.LoginPage;

public class TC002_CreateLead extends CommonMethods {

	@BeforeTest
	public void setFilePath() {
     filePath="CreateLeadTC";
     sheetName="Sheet1";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String uname, String pword, String cname , String fname, String lname, String phno) {

		LoginPage user = new LoginPage();
		 System.out.println("Driver value  OF TCOO2 "+getDriver());

		user.enterUsername(uname)
		.enterPassword(pword)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsModule()
		.clickCreateLeadShortcutButton()
		.the_user_enters_the_company_name_as(cname)
		.the_user_enters_the_first_name_as(fname)
		.the_user_enters_the_last_name_as(lname)
		.the_user_enters_the_phone_number_as(phno)
		.the_user_clicks_the_create_lead_button()
		.the_user_should_be_navigated_to_the_view_lead_page();;
		
	}
}
