package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/features/CreateLeadModule.feature"},
glue = {"steps"},dryRun = false, 
publish = true,monochrome = true,tags = "@regression")
public class TC001_CreateLead extends ProjectSpecificMethod{
	

}
