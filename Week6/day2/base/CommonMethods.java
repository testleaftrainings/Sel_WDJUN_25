package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonMethods {
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {

		String url ="http://leaftaps.com/opentaps/control/main";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
	    driver = new ChromeDriver(options);// Initialization is done here
	    driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@AfterMethod
	public void postCondition() {

		driver.quit();
	}
}
