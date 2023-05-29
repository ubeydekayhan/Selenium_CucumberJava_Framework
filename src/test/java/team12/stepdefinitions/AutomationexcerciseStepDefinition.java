package team12.stepdefinitions;

import io.cucumber.java.en.Given;
import team12.utilities.ConfigReader;
import team12.utilities.Driver;

public class AutomationexcerciseStepDefinition {

    @Given("Kullanici_{string}_sayfasina_gider")
    public void kullanici__sayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
}
