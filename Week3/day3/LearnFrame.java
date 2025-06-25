package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://leafground.com/frame.xhtml");
		driver.switchTo().frame(0);
		WebElement insideFrame = driver.findElement(By.id("Click"));
		insideFrame.click();
		System.out.println(insideFrame.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='nested.xhtml']")));
		String text = driver.findElement(By.xpath("//button[text()='Count Frames']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

}
