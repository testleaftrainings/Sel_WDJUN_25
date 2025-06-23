package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnCollections {
	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.facebook.com/");
		List<WebElement> listOfAnchorTags = driver.findElements(By.tagName("a")); 
		// List <Generic Type / Wrapper class>  nameOfTheList  --> declaration of the list 
		int sizeOfTheList = listOfAnchorTags.size();
		System.out.println(sizeOfTheList);
		Thread.sleep(1000);
		// ForEach LOOP
        //    listOfAnchorTags.get(i)       : int i = 0; i < sizeOfTheList; i++
		for (WebElement anchorElementFromFB : listOfAnchorTags) {
			System.out.println(anchorElementFromFB.getText());
		}
//		for (int i = 0; i < sizeOfTheList; i++) {
//			String text = listOfAnchorTags.get(i).getText();
//			System.out.println(text);
//	    }
		WebElement secondAnchorTag = listOfAnchorTags.get(1);
		secondAnchorTag.click();
	}
}
