package week4.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnTestNG {
	@Test
	public void runTestNgSuite() {
		ChromeDriver driver = new ChromeDriver();
		driver .get("https://www.google.com");
		driver.quit();
	}
}
