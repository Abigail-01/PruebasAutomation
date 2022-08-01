package runer;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/sketh/eclipse-workspace/CucumbPruebas/src/test/resources/features", glue = "steps", plugin = {
		"pretty", "html:target/cucumber-reports" }, monochrome = true, dryRun = false

)

public class Runner {
	@AfterClass
	public static void closeDriver() {

	}
}
