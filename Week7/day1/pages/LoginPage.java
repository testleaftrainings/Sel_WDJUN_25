package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import base.CommonMethods;
import io.cucumber.java.en.When;

public class LoginPage extends CommonMethods {

	@When("the user enters the username as {string}")
	public LoginPage enterUsername(String uname) throws IOException {
		System.out.println("Driver value from pages package"+getDriver());
		try {
			getDriver().findElement(By.id("username")).sendKeys(uname);
			reportStep("pass", "Username is entered successfully" + uname);

		} catch (Exception e) {
			reportStep("fail", "Username is not entered");
		}
		return this;
	}
	@When("the user enters the password as {string}")
	public LoginPage enterPassword(String pword) throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys(pword);
			reportStep("pass", "password is entered successfully" + pword);

		} catch (Exception e) {
			reportStep("fail", "password is not entered");

		}
		return this;

	}
	@When("the user clicks the login button")
	public HomePage clickLoginButton() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("pass", "Login button is clicked successfully");
		} catch (Exception e) {
			reportStep("fail", "Login button is not clicked");
		}
		return new HomePage();

	}
}
