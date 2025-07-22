package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.file.io/");
		Thread.sleep(5000);
		String filePath = System.getProperty("user.dir");
		System.out.println(filePath);
		driver.findElement(By.id("select-files-input")).sendKeys(filePath+"/snap/windowscreenshot.png");
		
	}

}
