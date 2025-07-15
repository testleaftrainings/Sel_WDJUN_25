package pages;

import org.openqa.selenium.By;

import base.CommonMethods;

public class MyLeadsPage extends CommonMethods {
	
	public void clickCreateLeadShortcutButton() {

		driver.findElement(By.linkText("Create Lead")).click();

	}

}
