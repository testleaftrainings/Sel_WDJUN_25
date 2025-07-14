package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends ProjectSpecificMethod {

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

	@When("the user enters the username as {string}")
	public void the_user_enters_the_username_as_demo_sales_manager(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@When("the user enters the password as {string}")
	public void the_user_enters_the_password_as_crmsfa(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);
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
	
	

}
