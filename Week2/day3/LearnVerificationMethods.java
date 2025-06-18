package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnVerificationMethods {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://leafground.com/checkbox.xhtml");
		WebElement basicCheckBox = driver.findElement(By.xpath("//span[text()='Basic']"));
		boolean displayed = basicCheckBox.isDisplayed();
		System.out.println(displayed);
		// true
		if (displayed) {
			basicCheckBox.click();
			WebElement verifyState = driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div/input"));
			System.out.println(" the state of the basic CheckBox is "+verifyState.isSelected());
		}
	}
}
