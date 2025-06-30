package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://leafground.com/window.xhtml");
		String parentWindowID = driver.getWindowHandle();
		System.out.println("parent Window  ID : "+parentWindowID);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//System.out.println("Child window ID "+driver.getWindowHandle());
		//1)Retrieve the set of window handles using driver.getWindowHandles().
		Set<String> idOfCurrentlyOpenedWindow = driver.getWindowHandles();
		System.out.println("ID Of Currently Opened Windows");
		//idOfCurrentlyOpenedWindow.forEach(System.out::println);
		for (String string : idOfCurrentlyOpenedWindow) {
			System.out.println(string);
		}
		//2)Convert the set to a list to handle windows in a sequential manner.
		List<String> indexBasedShift = new ArrayList<String>(idOfCurrentlyOpenedWindow);
		//3)Use the driver.switchTo().window(windowHandle) to switch control to the desired window.
		driver.switchTo().window(indexBasedShift.get(1));
		System.out.println("Child window Title is : "+ driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window Title is : "+ driver.getTitle());
		driver.quit();
	}
}
