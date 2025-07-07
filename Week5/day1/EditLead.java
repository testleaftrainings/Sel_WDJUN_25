package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/* Steps to implement Dynamic Parameterization:
1)Identify the datas that are specific to the particular testcase 
ex: EditLead - phonenumber,companyname
 */
public class EditLead extends ProjectSpecificMethods {
//	2)Create a method sendData() inside the CreateLead class
//	3)Annotate that method with @DataProvider
	@DataProvider(name="readData")
	public String[][] sendData() {
		//4)Inside sendData() create 2-Dimensional array with number of rows and columns
		//Add all the sets of data into the array and make sure the index starts from 0
		String [][] dynamic ;// declaration of 2D ARRAY
		//         [totaldataset] [columnSize]
		dynamic = new String[2][2]; //initialization of 2D ARRAY
		dynamic[0][0]="98990";
		dynamic[0][1]="TCS";
		dynamic[1][0]="89890";
		dynamic[1][1]="Qeagle";
		return dynamic;
		//5)Return the data back to the calling method

	}
//6)Receive this data in the test method
//	use dataprovider attibute
//	use that arguments inside the method.
@Test(dataProvider = "readData")
	public  void runEditLead(String phno,String cname) throws InterruptedException {
	//7)Finally, replace the hardcoded values
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cname)) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}
	}
}
