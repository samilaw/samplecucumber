package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/Features/FirstFeature.feature"},
        glue = {"org.example"}

)
public class RunCucumberTest {

}
