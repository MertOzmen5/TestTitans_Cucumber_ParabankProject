package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@PaymentTest or @Regression",
        features = {"src/test/java/FeatureFiles/US_606_Mert.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class US_606_MertRunner extends AbstractTestNGCucumberTests {
}
