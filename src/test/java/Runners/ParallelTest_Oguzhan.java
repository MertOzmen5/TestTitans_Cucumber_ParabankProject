package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ParallelTest_Oguzhan {

    @CucumberOptions(
            tags = "@Regression or @SmokeTest or @Accounts",
            features = {"src/test/java/FeatureFiles"},
            glue = {"StepDefinitions"},
            plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    )

    public class ParallelTest_Mert extends AbstractTestNGCucumberTests {

        @BeforeClass
        @Parameters("browserTipi")
        public void beforeClass(String browserName) {

            GWD.threadBrowserName.set(browserName);

        }
    }
}
