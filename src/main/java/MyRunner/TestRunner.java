package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/Umesh/eclipse-workspace/FreeCRMBDDFramework/src/main/java/Features/tagging.feature", 
				glue = {"stepDefinition" }, 
				format = { "pretty", "html:test-output", "json:json-output/cucumber.json", "junit:junit-xml/cucumber.xml" }, 
				dryRun = false, 
				monochrome = true, 
				strict = true,
				tags= {"@SmokeTest,  @RegressionTest"}) //"@End2End, @RegressionTest" OR condtion
public class TestRunner {

}
