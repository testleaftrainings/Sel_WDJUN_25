package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnImplicitlyWait {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//Specifies the amount of time the driver should wait when searching for an element if it is not immediately present. 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// Global wait
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		String textOfTheElement = driver.findElement(By.xpath("//label[@for='username']")).getText();
		//org.openqa.selenium.NoSuchElementException - will wait that much long only for this Exception
		System.out.println(textOfTheElement);
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");

	}

}
