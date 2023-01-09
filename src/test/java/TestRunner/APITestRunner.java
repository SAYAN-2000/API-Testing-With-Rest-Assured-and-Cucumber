package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features={"src/test/java/Features/FileUpload.feature"},
    glue= {"stepDefinitions"},
    plugin = {"pretty",
    		 "html:test-output/cucumber-reports/report.html", "json:test-output/cucumber-reports/report.json",},
    tags="@RunAllScenarios",
    publish = true,
    monochrome = true
    )
public class APITestRunner {

}
