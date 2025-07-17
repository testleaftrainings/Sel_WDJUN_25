package pages;

import org.openqa.selenium.By;

import base.CommonMethods;
import io.cucumber.java.en.When;

public class CreateLeadPage  extends CommonMethods{
	
	@When("the user enters the company name as (.*)$")
	public CreateLeadPage the_user_enters_the_company_name_as(String cname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	@When("the user enters the first name as (.*)$")
	public CreateLeadPage the_user_enters_the_first_name_as(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	@When("the user enters the last name as (.*)$")
	public CreateLeadPage the_user_enters_the_last_name_as(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	@When("the user enters the phone number as (.*)$")
	public CreateLeadPage the_user_enters_the_phone_number_as(String phno) {
		getDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		return this;
	}
	@When("the user clicks the create lead button")
	public ViewLeadPage the_user_clicks_the_create_lead_button() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}
