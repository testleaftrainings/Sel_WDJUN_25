package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnModalAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String infoFromSimpleAlert = driver.switchTo().alert().getText();
		System.out.println(infoFromSimpleAlert);
		driver.switchTo().alert().accept();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(500);
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following-sibling::button")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Bhuvanesh");
		alert.accept();
		String textFromThePromptAlert = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(textFromThePromptAlert);
		driver.close();
		

	}

}
