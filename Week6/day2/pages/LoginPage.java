package pages;

import org.openqa.selenium.By;

import base.CommonMethods;

public class LoginPage extends CommonMethods {

	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();

	}
}
