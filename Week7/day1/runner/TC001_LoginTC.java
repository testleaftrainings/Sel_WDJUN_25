package runner;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.CommonMethods;
import pages.LoginPage;

public class TC001_LoginTC extends CommonMethods {

	@BeforeTest
	public void setFilePath() {
		filePath = "LoginTC";
		sheetName = "Sheet1";
		testName = "Login Functionality";
		testDes = "Verifying the Login functionality using the valid user credentials";
		testAuthor = "Bhuvanesh";
		testCategory = "Smoke Test";
	}

	@Test(dataProvider = "fetchData")
	public void runLogin(String uname, String pword) throws IOException {

		LoginPage user = new LoginPage();
		System.out.println("Driver value  OF TCOO1 " + getDriver());
		user.enterUsername(uname).enterPassword(pword).clickLoginButton();
	}
}
