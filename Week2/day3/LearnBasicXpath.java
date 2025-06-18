package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnBasicXpath {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		String textOfTheElement = driver.findElement(By.xpath("//label[@for='username']")).getText();
		System.out.println(textOfTheElement);
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
	}

}
