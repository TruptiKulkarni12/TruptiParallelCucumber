package runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.model.CucumberFeature;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {
				"src/test/resources/cucumber/ParallelUiTest.feature",
		},
		 glue = {
				 "src/test/java/stepdefinitions"
				 },
		//tags = "@tag2"
		//tags = "@google"
		tags = "@demo1"
		)

public class RunnerTest {

}
