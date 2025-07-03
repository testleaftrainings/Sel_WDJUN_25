package week4.day4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations {
  @Test
  public void runCreateLead() {
	  System.out.println("Testcases for Create Lead funtionality");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Page is reloaded");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Snapshot is captured here-");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Navigate to LeatTaps Application");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("cookies have been cleared here");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("chrome is opened here");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Chrome is closed here");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Report has been startd here");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("The Report is Flush here");
  }
  @Test
  public void runEditLead() {
	  System.out.println("Testcases for Edit Lead funtionality");
  }

}
