package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://leafground.com/select.xhtml");
		WebElement UiAutomationToolDropdown = driver.findElement(By.className("ui-selectonemenu"));//createLeadForm_dataSourceId
		Select options = new Select(UiAutomationToolDropdown);//createLeadForm_marketingCampaignId
		options.selectByIndex(2);
		Thread.sleep(1000);
		options.selectByVisibleText("Cypress");
		Thread.sleep(1000);
		driver.close();
		
	}

}
