package com;

import com.supportUtils.NgListeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Listeners({NgListeners.class})
@CucumberOptions(
        features = "src/com/features",
        glue = {"com/stepDefinitions", "com/typeDefinitions"},
        plugin = {"pretty", "html:target/htmlReport.html", "json:target/JSONReport/jsonReport.json"},
        tags = "@DataTableScenario2",
        monochrome = false
)
public class TestNgRunner extends AbstractTestNGCucumberTests {
}
