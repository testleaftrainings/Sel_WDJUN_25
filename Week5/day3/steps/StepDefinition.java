package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	ChromeDriver driver;

	@Given("the user establishes the environment")
	public void the_user_establishes_the_environment() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("the user loads the url")
	public void the_user_loads_the_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@When("the user enters the username as DemoSalesManager")
	public void the_user_enters_the_username_as_demo_sales_manager() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

	@When("the user enters the password as crmsfa")
	public void the_user_enters_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("the user should be navigated to the welcome page")
	public void the_user_should_be_navigated_to_the_welcome_page() {
		String title = driver.getTitle();
		System.out.println(title);
	}
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
		driver.close();
	}

}
