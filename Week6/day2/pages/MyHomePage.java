package pages;

import org.openqa.selenium.By;

import base.CommonMethods;

public class MyHomePage extends CommonMethods {
	public MyLeadsPage clickLeadsModule() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}

}
