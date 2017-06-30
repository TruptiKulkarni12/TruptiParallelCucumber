import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"/Users/Junaid/Desktop/CucumberParallel/test-automation-quickstart-master/ui-acceptance-tests/src/test/resources/cucumber/ParallelUiTest.feature"},
        plugin = {"json:/Users/Junaid/Desktop/CucumberParallel/test-automation-quickstart-master/ui-acceptance-tests/target/cucumber-parallel/1.json"},
        monochrome = true,
        tags = {},
        glue = {"stepdefinitions"})
public class Parallel01IT {
}
