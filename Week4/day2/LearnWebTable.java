package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) {
		 ChromeOptions options = new ChromeOptions();
	      options.addArguments("--start-maximized");
	      options.addArguments("--disable-notifications");
	      ChromeDriver driver = new ChromeDriver(options);
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      driver.get("https://leafground.com/table.xhtml");
	      String tableContent = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr[1]/td[2]")).getText();
	      System.out.println(tableContent);
	      int sizeOfTheRows = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr")).size();
	      int sizeOfTheColumns = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr[1]/td")).size();
	      System.out.println(" no of rows : "+sizeOfTheRows+"\n no of columns :"+sizeOfTheColumns);
	      for (int i = 1; i <= sizeOfTheRows; i++) {// outer loop --> represents rows
	    	  System.out.print("| ");
	    	  for (int j = 1; j <= sizeOfTheColumns; j++) { // inner loop --> represents columns
				String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+" |");
			}
	    	  System.out.println();
		}
	      
	}
}
