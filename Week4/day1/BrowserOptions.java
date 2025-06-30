package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserOptions {

	public static void main(String[] args) throws IOException {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--private");
		FirefoxDriver driver = new FirefoxDriver(options);
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
//		options.addArguments("--start-maximized");
//		options.addArguments("--disable-notifications");
//		ChromeDriver driver = new ChromeDriver(options);
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--inprivate");
//		options.addArguments("--start-maximized");
//		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://leafground.com/window.xhtml");
		WebElement element = driver.findElement(By.xpath("//span[text()='Open with delay']"));
		// step 1 : we have to choose our file type 
		File src = element.getScreenshotAs(OutputType.FILE);
		// step 2 : we have to create a folder 
		// File class-- . /name of the folder / name of the snapshot . image format
		File des = new File("./snap/windowscreenshot.png");
		//step 3 : we are merging the source file with the destination file using the Apache.commons.io
		FileUtils.copyFile(src, des);
	}

}
