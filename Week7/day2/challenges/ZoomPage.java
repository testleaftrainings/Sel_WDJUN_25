package challenges;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomPage {	

	public static void main(String[] args) throws IOException {
		zoomFrame();
//		zoomPage();
	}	

	public static void zoomFrame() throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/autosuggest");
		
		driver.executeScript("document.body.style.zoom='25%'", "");	
		
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./data/fullpage.png"));
	}

	/*public static void zoomPage() throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");		
		driver.executeScript("document.body.style.zoom='170%'", "");
		
	}*/

}