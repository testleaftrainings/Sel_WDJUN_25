package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHovering {

	public static void main(String[] args) throws InterruptedException {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--start-maximized");
      options.addArguments("--disable-notifications");
      ChromeDriver driver = new ChromeDriver(options);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://www.myntra.com/");
      Actions ac = new Actions(driver);
      ac.moveToElement(driver.findElement(By.xpath("//a[text()='Men']")))
      .pause(2000)
      .click(driver.findElement(By.xpath("//a[text()='T-Shirts']")))
      .perform();
      ac.scrollToElement(driver.findElement(By.xpath("//a[text()=' Contact Us ']"))).perform(); 
	}
}
