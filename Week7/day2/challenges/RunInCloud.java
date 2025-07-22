package challenges;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

public class RunInCloud {

	public static void main(String[] args) throws MalformedURLException {
//		https://www.lambdatest.com/capabilities-generator/
		SafariOptions browserOptions = new SafariOptions();
		browserOptions.setPlatformName("MacOS Sonoma");
		browserOptions.setBrowserVersion("17.0");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("username", "jeyagokul7");
		ltOptions.put("accessKey", "7RcIiLHA8KuppMaAHAOA1BxKn5Td6dunIOQ1LD9VN1AZQNY2nJ");
		ltOptions.put("build", "Selenium week end");
		ltOptions.put("project", "Salesforce");
		ltOptions.put("w3c", true);
		browserOptions.setCapability("LT:Options", ltOptions);
		/*https://" + username + ":" + accesskey + gridURL*/
		URL url = new URL("https://jeyagokul7:7RcIiLHA8KuppMaAHAOA1BxKn5Td6dunIOQ1LD9VN1AZQNY2nJ@hub.lambdatest.com/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.close();

	}

}
