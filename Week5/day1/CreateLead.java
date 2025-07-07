package week5.day1;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods {
	@DataProvider(name = "fetchData")
	public String[][] sendData() {
		String [][] dynamic ;// declaration of 2D ARRAY
		//         [totaldataset] [columnSize]
		dynamic = new String[2][4]; //initialization of 2D ARRAY
		// Test Data's were intialized using the 2D array
		dynamic[0][0]="Testleaf";
		dynamic[0][1]="Bhuvanesh";
		dynamic[0][2]="M";
		dynamic[0][3]="98990";
		dynamic[1][0]="CTS";
		dynamic[1][1]="Seenivasan";
		dynamic[1][2]="S";
		dynamic[1][3]="89890";
		return dynamic;
	}
	
    
	@Test(dataProvider = "fetchData")
	public void runCreateLeadModule(String cname, String fname, String lname, String phno) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
			
		}
	}
}
