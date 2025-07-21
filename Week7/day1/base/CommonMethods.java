package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class CommonMethods extends AbstractTestNGCucumberTests {
	private static ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	public String filePath, sheetName, testName, testDes, testAuthor, testCategory;
	public static ExtentReports extent;
	public static ExtentTest test;

	@Parameters({ "url", "browser" })
	@BeforeMethod
	public void preCondition(String url, String browser) {
		// Initialization is done here
		switch (browser.toLowerCase()) {
		case "edge":
			setDriver(new EdgeDriver());
			break;
		case "firefox":
			setDriver(new FirefoxDriver());
			break;
		default:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("guest");
			setDriver(new ChromeDriver(options));
			break;
		}
		System.out.println("Driver value" + getDriver());
		getDriver().manage().window().maximize();
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postCondition() {

		getDriver().quit();
	}

	// setter
	public void setDriver(RemoteWebDriver driver) {
		rd.set(driver);
	}

	// getter
	public RemoteWebDriver getDriver() {
		return rd.get();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return utils.TestDataLibrary.readData(filePath, sheetName);
	}

	/// Extent report implementation starts here
	@BeforeSuite
	public void startReport() {
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy_hh_mm_ss_a"));
		// Step 1: Set Physical Report Path
		ExtentHtmlReporter htmlExtent = new ExtentHtmlReporter("./reports/" + timeStamp + "_result.html");
		// htmlExtent.setAppendExisting(true);
		// Step 2: Create ExtentReports Object
		extent = new ExtentReports();
		// Step 3: Attach Reporter to ExtentReports
		extent.attachReporter(htmlExtent);
	}

	@AfterSuite
	public void endReport() {
		// Step 6: Flush the Report (Mandatory)
		extent.flush();
	}

	@BeforeClass
	public void testDetails() {
		// Step 4: Create a Test & Assign Details
		test = extent.createTest(testName, testDes);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);

	} // test.pass or test.fail

	public void reportStep(String status, String message) throws IOException {
		int takeSnap = takeSnap();
		if (status.equalsIgnoreCase("pass")) {
			test.pass(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snap/" + takeSnap + ".png").build());
		} else {
			test.fail(message,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/" + takeSnap + ".png").build());
		}
	}

	public int takeSnap() throws IOException {
		int ranNum = (int) (Math.random() * 999999);
		File scr = getDriver().getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/" + ranNum + ".png");
		FileUtils.copyFile(scr, target);
		return ranNum;

	}
}
