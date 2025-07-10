package steps;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionTwo extends ProjectSpecificMethod  {
	
	@When("the user clicks the crmsfa link")
	public void the_user_clicks_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("the user clicks the leads module")
	public void the_user_clicks_the_leads_module() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("the user clicks the create lead from the shortcuts menu")
	public void the_user_clicks_the_create_lead_from_the_shortcuts_menu() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("the user enters the company name as Testleaf")
	public void the_user_enters_the_company_name_as_testleaf() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	}
	@When("the user enters the first name as Bhuvanesh")
	public void the_user_enters_the_first_name_as_bhuvanesh() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("bhuvanesh");
	}
	@When("the user enters the last name as M")
	public void the_user_enters_the_last_name_as_m() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("moorthy");
	}

	@When("the user enters the phone number")
	public void the_user_enters_the_phone_number() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98127");
	}

	@When("the user clicks the create lead button")
	public void the_user_clicks_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("the user should be navigated to the view lead page")
	public void the_user_should_be_navigated_to_the_view_lead_page() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
	}
	
	@When("the user will get the error message")
	public void the_user_will_get_the_error_message() {
	    System.out.println("The following required parameter is missing");
	}

}
