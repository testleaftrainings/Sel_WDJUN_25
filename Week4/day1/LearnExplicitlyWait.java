package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitlyWait {

	public static void main(String[] args) {
		int expectedNumberOfWindows =3;
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		System.out.println("Total no of windows"+driver.getWindowHandles().size());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//driver.getWindowHandles().size() == expectedNumberOfWindows;
		Boolean verifyTheState = wait.until(ExpectedConditions.numberOfWindowsToBe(expectedNumberOfWindows));
		if (verifyTheState) {
			driver.quit();	
		}
	}

}
