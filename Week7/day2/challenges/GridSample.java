package challenges;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridSample {

public static void main(String[] args) throws MalformedURLException {
		
		ChromeOptions options = new ChromeOptions();
	  	DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("safari");
		dc.setPlatform(Platform.MAC);
		options.merge(dc);
		
		//step 1 : need a selenium-server jar file 
		//step 2 : open cmd from the jar file location.
		//step 3 :  machince is having a testcase will be a hub.
		// java -jar  selenium-server-version.jar hub

		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.208:4444/wd/hub"), options);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	

	}

}
