package team12.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
                            "html:src/target/report.html"},
                features = "src/test/resources/features",
                glue = "team12/stepdefinitions",
                tags="",
                dryRun = false
)
public class Runners {

}
