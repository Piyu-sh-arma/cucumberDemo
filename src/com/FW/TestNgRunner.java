package com.FW;

import com.FW.supportUtils.NgListeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Listeners({NgListeners.class})
@CucumberOptions(
        features = "src/resources/features",
        glue = {"com/FW/stepDefinitions", "com/FW/typeDefinitions"},
        plugin = {"pretty", "html:target/htmlReport.html", "json:target/JSONReport/jsonReport.json"},
        monochrome = false
)
public class TestNgRunner extends AbstractTestNGCucumberTests {
    // Cucumber will create a new instance of each of your glue code classes before each scenario.
    // Package to load glue code (step definitions, hooks and plugins)
}
