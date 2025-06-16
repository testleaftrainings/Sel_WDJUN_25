package week2.day1;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		EdgeDriver driver;// declaration
		driver = new EdgeDriver();   // Initialization
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();
		
		

	}
}
