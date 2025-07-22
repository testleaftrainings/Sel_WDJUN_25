package challenges;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {

	@Test
	public void upload() throws IOException {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.myntra.com/");
		WebElement eleUpload = driver.findElement(By.xpath("//strong[text()='SHOP ONLINE AT MYNTRA WITH COMPLETE CONVENIENCE']"));
		
//		driver.executeScript("arguments[0].scrollIntoView();", eleUpload);
		driver.executeScript("arguments[0].click();", eleUpload);
		
		
		//Scroll using Java Script:

//			driver.executeScript("window.scrollBy(0,5000)"); // vertical scroll based on the pixel

		//	driver.executeScript("window.scrollBy(1000,0)"); // horizontal scroll based on the pixel

		//	driver.executeScript("arguments[0].scrollIntoView();", Element);

			driver.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // vertical scroll to the end

	}
}