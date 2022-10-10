package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\myFeatures\\DataTableMultipleUser.feature",
        glue = {"stepsDefinition"},
        dryRun = false,
        monochrome = false,
        //tags = "@Smoke",
        plugin = {"pretty", "html:target/cucumber-reports/index.html",
                            "json:target/JSON-reports/index.json",
                            "junit:target/XML-reports/index.xml"}
)
public class DataTableMultipleUserRunner {
}
