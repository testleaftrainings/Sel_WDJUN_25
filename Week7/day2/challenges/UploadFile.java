package challenges;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {

	@Test
	public void upload() throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String pathOfMyProjectFolder = System.getProperty("user.dir"); //project path

		System.out.println(pathOfMyProjectFolder); 

		  driver.get("https://www.file.io/");
		  //Absolute path of the file
		  driver.findElement(By.xpath("//input[@type='file']")).sendKeys(pathOfMyProjectFolder+"\\data\\Bala_CV.docx"); // absolute path
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
}