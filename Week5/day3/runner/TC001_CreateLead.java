package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/features/CreateLeadModule.feature"},glue = {"steps"}, publish = true)
public class TC001_CreateLead extends AbstractTestNGCucumberTests {
	

}
