package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest or @Regression or @Accounts",
        features = {"src/test/java/FeatureFiles/US_604_Oguzhan.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class US_604_OguzhanRunner extends AbstractTestNGCucumberTests {
}
