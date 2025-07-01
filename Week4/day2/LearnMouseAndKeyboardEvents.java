package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseAndKeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--start-maximized");
      options.addArguments("--disable-notifications");
      ChromeDriver driver = new ChromeDriver(options);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://leafground.com/drag.xhtml");
      Actions ac = new Actions(driver);
      // keyboard and mouse actions
      // keyboard actions
      ac.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Search...']")), "Testleaf")
      .keyDown(Keys.SHIFT)//pressing the shift key
      .keyDown(Keys.HOME) //pressing the Home key
      .keyUp(Keys.HOME) // releasing the Home key
      .keyUp(Keys.SHIFT) // releasing the shift key
      .pause(2000)
      .keyDown(Keys.TAB)
      .keyUp(Keys.TAB)
      .perform();
      // mouse actions
      ac.clickAndHold(driver.findElement(By.id("form:conpnl"))).moveByOffset(350, 0)
      .pause(500).moveByOffset(-100, 0).perform();
      ac.dragAndDrop(driver.findElement(By.id("form:drag_content")), driver.findElement(By.id("form:drop")))
      .perform();
      driver.quit();
      
	}

}
