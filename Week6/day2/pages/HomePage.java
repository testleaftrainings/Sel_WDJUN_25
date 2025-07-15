package pages;

import org.openqa.selenium.By;

import base.CommonMethods;

public class HomePage  extends CommonMethods{
	
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}

}
