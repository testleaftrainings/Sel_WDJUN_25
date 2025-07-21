package pages;

import org.openqa.selenium.By;

import base.CommonMethods;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends CommonMethods {
	@Then("the user should be navigated to the view lead page")
	public void the_user_should_be_navigated_to_the_view_lead_page() {
		String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}

}
