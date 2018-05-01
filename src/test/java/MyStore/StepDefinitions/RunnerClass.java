package MyStore.StepDefinitions;

import org.junit.runner.RunWith; 
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true, 
		plugin = {"pretty", "html:target/cucumber"},
		features = {"src/test/resources/FeatureCollections/Login.feature"},
		tags={"@SmokeTest"}
		//		dryRun=true
		)
public class RunnerClass {
}
/*
@RunWith(Cucumber.class) 
@CucumberOptions.Options(format = {"pretty", "html:target/html"},
features = {"FeatureCollections"},
tags={"@SmokeTest"}
	) 
public class runTest {

}
 */
