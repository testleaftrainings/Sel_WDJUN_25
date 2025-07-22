package challenges;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertSnap {
	
	@Test
	public void alertSnap() throws IOException, AWTException, InterruptedException{
		ChromeOptions ch = new ChromeOptions();
		
		// Headless mode
		ch.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		driver.switchTo().alert();
		takeSnap();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		File src = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./data/headless.png"));
		driver.executeScript("window.scrollTo(0, document.body.scrollHeight");

	}
	public void takeSnap() throws IOException, HeadlessException, AWTException {		
		//Screen Size
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec = new Rectangle(dimen);
		//Write File
		BufferedImage img = new Robot().createScreenCapture(rec);	// take a snapshot	
		ImageIO.write(img, "jpg", new File("./data/alertSnap.jpg"));// 1st argus - img file, 2nd arugs - extension, 3rd argus - file location
	
	}
	

}
